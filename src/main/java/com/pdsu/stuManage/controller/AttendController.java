package com.pdsu.stuManage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pdsu.stuManage.bean.Attendance;
import com.pdsu.stuManage.bean.Attendcode;
import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.service.AttendanceService;
import com.pdsu.stuManage.service.AttendcodeService;
import com.pdsu.stuManage.service.ClazzService;
import com.pdsu.stuManage.service.Student1Service;
import com.pdsu.stuManage.service.TeacherService;
import com.pdsu.stuManage.service.XandcService;
import com.pdsu.stuManage.service.ZclassService;
import com.pdsu.stuManage.utils.AttendCode;

import cn.itcast.commons.CommonUtils;

/*
 * 处理与签到有关的Controller
 */
@Controller
@RequestMapping("/attend")
public class AttendController {
	@Resource(name="xandcService")
	private XandcService xandcService; 
	//行政班级的service
	@Resource(name="clazzService")
	private ClazzService clazzService;
	//老师的service
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	//学生的service
	@Resource(name="student1Service")
	private Student1Service student1Service;
	
	//签到的service
	@Resource(name="attendanceService")
	private AttendanceService attendanceService;
	
	//处理签到码有关逻辑
	@Resource(name="attendcodeService")
	private AttendcodeService attendcodeService;
	
	//自建班级的service
	@Resource(name="zclassService")
	private ZclassService zclassService;
	
	//存储已经签到学生的学生ID,全部已经签到的学生的ID
	private List<String> students=new ArrayList<>();   
	
	/*
	 * 跳转到班级列表，选择要签到的班级,并把班级列表返回到页面
	 */
	@RequestMapping("/chooseZclass.do")
	public String chooseZclass(HttpServletRequest request,ModelMap model){
		String tid=(String) request.getSession().getAttribute("session_tid");
		List<Zclass> zclasses=zclassService.selectZByTid(tid);
		if(zclasses.size()!=0){
			model.addAttribute("zclasses", zclasses);
			model.addAttribute("msg", 1);
		}else{
			model.addAttribute("msg", 0);
		}
		
		return "chooseZclass";
	}
	
	/*
	 * selectZclassByLike 后台查看签到情况，先加载自建班级列表
	 */
	@RequestMapping("/selectZclassByLike.do")
	public String selectClazzByLike(
 			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
 			HttpServletRequest request,Model model){
		String year=request.getParameter("year");   //获取年份
		String major=request.getParameter("major");  //获取专业名称
		String clazzs=request.getParameter("clazzs");  //获取班级ID
		if("0".equals(major)||major==""){
			major=null;
		}
		if("0".equals(clazzs)||clazzs==""){
			clazzs=null;
		}
		if(year==null||year==""){
			year="0";
		}
		List<Clazz> emps = clazzService.selectClazzByLike(Integer.parseInt(year),major,clazzs);
		List<Zclass> emps1;
		if(emps.size()!=0){
			PageHelper.startPage(pn, 5);
			emps1 = clazzService.selectZclassByLike(emps);
		}else{
			emps1=null;
		}
		/*PageHelper.startPage(pn, 5);
		List<Zclass> emps1 = clazzService.selectZclassByLike(emps);*/
		PageInfo<Zclass> page = new PageInfo<Zclass>(emps1, 5);
		model.addAttribute("pageInfo", page);
		
		if(year!="0"){  //说明是条件查询，非条件查询则year为零
			//需要根据班级id查询班级名称，用于回显
			if((clazzs!=null)&&(clazzs!="")){
				Clazz clazz=clazzService.selectClazz(clazzs);
			   model.addAttribute("cname", clazz.getCname());
			}else{
				model.addAttribute("cname", null);
			}
			
			model.addAttribute("year", year);
			model.addAttribute("major", major);
			model.addAttribute("clazzs", clazzs);
		}
		
		return "forward:/pages/zclass-list.jsp";
	}
	
	
	/*
	 * 老师获取签到码
	 */
	@RequestMapping("/getAttendCode.do")
	@ResponseBody
	public Msg getQ_code(HttpServletRequest request,HttpServletResponse response){
		AttendCode attendCode=new AttendCode();
		
		
		attendCode.getImage();//生成签到码
		//Q_code=attendCode.getText();
		request.getSession().setAttribute("session_code", attendCode.getText());  //签到码存储到session域
		return Msg.success().add("Q_code", attendCode.getText());
	}
	
	/*
	 * 开始签到，现在开始计时
	 */
	@RequestMapping("/begin.do")
	public void begin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String Q_code=(String) request.getSession().getAttribute("session_code");  //获取到签到码
		String QD_id=CommonUtils.uuid();   //生成签到的ID
		request.getSession().setAttribute("session_kid",QD_id);  //签到ID存储到session域
		Integer acode=Integer.parseInt(Q_code);
		//String tid=request.getParameter("tid");   //获取老师ID
		//String tid=(String) request.getSession().getAttribute("session_tid");
		//String cid=request.getParameter("cid");   //获取班级ID
		String cid=(String) request.getSession().getAttribute("session_cid");
		String time=request.getParameter("time");
		Integer b_time=Integer.parseInt(time);  //签到持续的时间
		
		Date date=new Date();   ////记录签到开始的时间
		Integer num=0;   //签到人数清零
		Attendcode attendcode=new Attendcode();
		attendcode.setAcode(acode);
		attendcode.setBtime(date);
		attendcode.setCid(cid);
		attendcode.setDtime(b_time);
		attendcode.setNum(num);
		attendcode.setTid(QD_id);
		//把这条签到数据存储到数据库
		attendcodeService.insertRecord(attendcode);
	}
	/*
	 * setZcid 跳转到签到页面，并且设置班级id到session域
	 */
	@RequestMapping("/setZcid.do")
	public String setZcid(HttpServletRequest request){
		String zcid=request.getParameter("id");  //获取班级id，
		request.getSession().setAttribute("zcid", zcid);
		return "student";
	}
	
	/*
	 *  attend.do 接收学生签到的请求
	 */
	@RequestMapping("/attend.do")
	public void attend(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String stu_code2=request.getParameter("stu_code2");
		Integer stu_code=Integer.parseInt(stu_code2);  //获取学生发过来的签到码
		
		Date date2=new Date();
		
	    long time2=date2.getTime();     ///当前学生签到的时间
	    Attendcode attendcode=attendcodeService.selectByCode(stu_code);
	    if(attendcode==null){   //如果查不到这个签到码
	    	
	    	request.getSession().setAttribute("QD_image", "签到码错误");
			request.getRequestDispatcher("/student.jsp").forward(request, response);
			return ;
	    }else{
	    	Date btime=attendcode.getBtime();
			long time1=btime.getTime();    //得到开始签到的时间
			Integer b_time=attendcode.getDtime();  //获取签到持续的时间
			
			Integer Q_code1=attendcode.getAcode();  //获取签到码
			
			String Q_code=Q_code1.toString();
			Integer num=attendcode.getNum();
			if(time2-time1>b_time*1000){
				request.getSession().setAttribute("QD_image", "有效签到时间已过");
				request.getRequestDispatcher("/student.jsp").forward(request, response);
				return ;
			}
			else if(stu_code2.equalsIgnoreCase(Q_code)){
				
				//获取签到学生ID
	
				//存储签到学生ID
				//String stuID=request.getParameter("stuID");
				String stuID=(String) request.getSession().getAttribute("session_sid");
				if(students.contains(stuID)){
					request.getSession().setAttribute("QD_image", "请不要重复签到");
					request.getRequestDispatcher("/student.jsp").forward(request, response);
					return ;
				}else{
					students.add(stuID);
					request.getSession().setAttribute("QD_image", "签到成功");
					num++;
					attendcodeService.setNumByCode(num,Q_code1); //签到人数，签到码
					request.getRequestDispatcher("/student.jsp").forward(request, response);
					return ;
				}
			}
	    }
	}
	
	/*
	 * 返回已经签到的人数
	 */
	@RequestMapping("/getnum.do")
	@ResponseBody
	public Msg getnum(HttpServletRequest request,HttpServletResponse response){
		String code1=(String) request.getSession().getAttribute("session_code");  //获取签到码
		Integer code=Integer.parseInt(code1);
		//根据签到码查询已经签到的人数
		Integer num=attendcodeService.selectNumByCode(code);
		return Msg.success().add("num", num);
	}

	/*
	 * 签到结束，整合签到数据，并持久化到数据库
	 */
	@RequestMapping("/stop.do")
	public void stop(HttpServletRequest request,HttpServletResponse response){
		List<String> lackStudent=new ArrayList<>();
		
		String cid=(String) request.getSession().getAttribute("session_cid");  //获取到班级的ID
		String tid=(String) request.getSession().getAttribute("session_tid");  //获取老师ID
		String kid=(String) request.getSession().getAttribute("session_kid");  //获取考勤ID
		
		
		//1,获取到这个班所有的学生
		//List<String> allStudent=student1Service.selectAllStudents(cid);
		List<Student1> allStudent=student1Service.selectAll(cid);              //查询到这个班所有学生
		System.out.println(allStudent);
		//2,与已经签到的学生比较，得到未签到学生
		for(int i=0;i<allStudent.size();i++){
			if(!students.contains(allStudent.get(i).getSid())){
				//2.1把缺勤的学生加入到缺勤的链表里面
				lackStudent.add(allStudent.get(i).getSid());
			}else{
				students.remove(allStudent.get(i).getSid());
				//System.out.println(students);
			}
		}
		  //3,把未签到的学生存储到数据库里面
			for(int i=0;i<lackStudent.size();i++){
				Attendance attendance=new Attendance();
				attendance.setCid(cid);  //班级ID
				//attendance.setCuid(cuid);  //课程ID
				attendance.setKid(kid);  //考勤ID
				attendance.setKtime(new Date());
				attendance.setSid(lackStudent.get(i));  //学生ID
				attendance.setStatue("2");   //2表示缺勤
				attendance.setTid(tid);  //老师ID
				attendanceService.insertRecord(attendance);
			}
			Attendance attendance2=new Attendance();
			attendance2.setTid(tid);   //设置考勤老师的id
			attendance2.setKid(kid);    //设置考勤id
			attendance2.setKtime(new Date());    //设置考勤时间，如果全部到齐，留一条记录用于查询出考勤时间
			attendanceService.insertRecord(attendance2);
			//最后把签到码表里面记录删除
	/*		String QD_code=(String) request.getSession().getAttribute("session_code");
			attendcodeService.deleteByAcode(Integer.parseInt(QD_code));*/
	}
	
	/*
	 * 显示签到的详情
	 */
	@RequestMapping("/showDetail.do")
	public String showDetail(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		
		String kid=(String) request.getSession().getAttribute("session_kid");  //获取考勤ID
		String cid=(String) request.getSession().getAttribute("session_cid");  //获取到班级的ID
		
		List<Attendance> lackStudent=new ArrayList<>();         //缺勤记录链表
		List<String> lackStudent2=new ArrayList<>();         //存储缺勤学生的ID
		List<Student1> attendStudent=new ArrayList<>();        //到勤学生链表
		List<Student1> lackendStudent1=new ArrayList<>();        //缺勤学生链表
		List<Student1> leaveStudent1=new ArrayList<>();        //缺勤学生链表
		List<Attendance> leaveStudent=new ArrayList<>();         //请假记录链表
		List<String> leaveStudent2=new ArrayList<>();         //请假记录链表
		List<Student1> allStudent=student1Service.selectAll(cid);              //查询到这个班所有学生
		
		lackStudent=attendanceService.showDetail(kid);            //根据考勤id，查找到缺勤学生
		leaveStudent=attendanceService.showleave(kid);            //根据考勤id，查找到请假学生
		for(int i=0;i<lackStudent.size();i++){
			lackStudent2.add(lackStudent.get(i).getSid());           //得到所有缺勤学生ID
		}
		for(int i=0;i<leaveStudent.size();i++){
			leaveStudent2.add(leaveStudent.get(i).getSid());           //得到所有缺勤学生ID
		}
		for(int i=0;i<allStudent.size();i++){
			if(lackStudent2.contains(allStudent.get(i).getSid())){         //这个是缺勤学生
				lackendStudent1.add(allStudent.get(i));
			}else if(leaveStudent2.contains(allStudent.get(i).getSid())){  //这个是请假学生
				leaveStudent1.add(allStudent.get(i));
			}else{                                                         //这个是到勤学生
				attendStudent.add(allStudent.get(i));
			}
		}
		model.addAttribute("lackendStudent1",lackendStudent1);   //返回缺勤学生
		model.addAttribute("attendStudent",attendStudent); //返回到勤学生
		model.addAttribute("leaveStudent1",leaveStudent1); //返回到勤学生
		model.addAttribute("kid",kid); //返回到勤学生
		return "detail";
	}
	/*
	 * 显示签到的详情2
	 */
	@RequestMapping("/showDetail2.do")
	public String showDetail2(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		
		String kid=request.getParameter("kid");  //获取考勤ID
		String cid=request.getParameter("cid");  //获取到班级的ID
		
		List<Attendance> lackStudent=new ArrayList<>();         //缺勤记录链表
		List<String> lackStudent2=new ArrayList<>();         //存储缺勤学生的ID
		List<Student1> attendStudent=new ArrayList<>();        //到勤学生链表
		List<Student1> lackendStudent1=new ArrayList<>();        //缺勤学生链表
		List<Student1> leaveStudent1=new ArrayList<>();        //缺勤学生链表
		List<Attendance> leaveStudent=new ArrayList<>();         //请假记录链表
		List<String> leaveStudent2=new ArrayList<>();         //请假记录链表
		List<Student1> allStudent=student1Service.selectAll(cid);              //查询到这个班所有学生
		
		lackStudent=attendanceService.showDetail(kid);            //根据考勤id，查找到缺勤学生
		leaveStudent=attendanceService.showleave(kid);            //根据考勤id，查找到请假学生
		for(int i=0;i<lackStudent.size();i++){
			lackStudent2.add(lackStudent.get(i).getSid());           //得到所有缺勤学生ID
		}
		for(int i=0;i<leaveStudent.size();i++){
			leaveStudent2.add(leaveStudent.get(i).getSid());           //得到所有缺勤学生ID
		}
		for(int i=0;i<allStudent.size();i++){
			if(lackStudent2.contains(allStudent.get(i).getSid())){         //这个是缺勤学生
				lackendStudent1.add(allStudent.get(i));
			}else if(leaveStudent2.contains(allStudent.get(i).getSid())){  //这个是请假学生
				leaveStudent1.add(allStudent.get(i));
			}else{                                                         //这个是到勤学生
				attendStudent.add(allStudent.get(i));
			}
		}
		model.addAttribute("lackendStudent1",lackendStudent1);   //返回缺勤学生
		model.addAttribute("attendStudent",attendStudent); //返回到勤学生
		model.addAttribute("leaveStudent1",leaveStudent1); //返回到勤学生
		model.addAttribute("kid", kid);
		return "detail";
	}
	
	
	/*
	 * 修改签到状态，0表示到勤，删除该调记录  1表示请假，修改状态 2表示缺勤，在表中插入这条记录，状态设置为2
	 */
	@RequestMapping("/alterAttendStatue.do")
	@ResponseBody
	public Msg alterAttendStatue(HttpServletRequest request,HttpServletResponse response){
		String stuId=request.getParameter("stuId");  //或者学生的ID
		String statue=request.getParameter("statue"); //获得要改变的状态
		
		//String kid =(String) request.getSession().getAttribute("session_kid");   //获取考勤的ID
		String kid=request.getParameter("kid");
		//1,先查询数据库表里面有没有这个人，
		Attendance attendancen=null;
		attendancen=attendanceService.selectBySidAndKid(stuId,kid);
		if(attendancen!=null){  //如果有记录，直接修改状态
			attendanceService.alterAttendStatue(stuId,statue,kid);
		}else{
			//如果没有记录，直接插入记录
			Date date=attendanceService.getDate(kid);
			Attendance newAttendance=new Attendance();
			newAttendance.setKid(kid);   //考勤ID
			newAttendance.setCid((String)request.getSession().getAttribute("session_cid"));  //设置班级id
			newAttendance.setTid((String)request.getSession().getAttribute("session_tid"));  //设置老师id
			newAttendance.setSid(stuId);   //设置学生的id
			newAttendance.setStatue(statue);  //设置状态
			newAttendance.setKtime(date);
			attendanceService.insertRecord(newAttendance);
		}
	//	return "forward:showDetail.do";
		return Msg.success();
	}

	/*
	 * selectAttendClass 查看班级签到情况，先展示班级列表，选择其中一个查看
	 */
	@RequestMapping("/selectAttendClass.do")
	public String selectAttendClass(HttpServletRequest request,ModelMap model){
		String tid=(String) request.getSession().getAttribute("session_tid");
		List<Zclass> zclasses=new ArrayList<>();

		zclasses=zclassService.selectZByTid(tid);
		if(zclasses.size()!=0){
			model.addAttribute("msg",1);
			model.addAttribute("zclasses",zclasses);
		}else{
			model.addAttribute("msg",0);
		}
		
		return "zlistAttend";
		
	}
	
	/*
	 *  selectAttendByCid 根据班级的ID，查询这个班级所有的考勤记录，显示仅显示签到时间 到勤人数 缺勤人数 请假人数，点击后再显示详情
	 */
	@RequestMapping("/selectAttendByCid.do")
	public String selectAttendByCid(HttpServletRequest request,ModelMap model){
		String cid=request.getParameter("id");   //得到班级的ID
		
		//1，查询到所有的考勤ID
		List<Attendcode> list1=new ArrayList<>();     //存储签到记录
	//	List<String> list2=new ArrayList<>();     //存储签到（ID）
		list1=attendcodeService.selectByCid(cid);
		
		List<Msg> msg=new ArrayList<>();        //通用返回类链表
		List<Student1> allStudent=student1Service.selectAll(cid);   //查询到这个班所有学生
		Integer all=allStudent.size();               //得到这个班所有学生
		
			if(list1.size()!=0){          //如果签到记录不为空
				for(int i=0;i<list1.size();i++){
					String kid=list1.get(i).getTid();       //的到签到ID	
					Integer leave=attendanceService.selectLeaveByKid(kid);   //根据签到ID，查询请假学生多少人
					Integer  lack=attendanceService.selectLackByKid(kid);    //根据签到ID，查询缺勤学生多少人
					
					Date date=attendanceService.selectDatekByKid(kid);    //根据签到ID，查询签到时间
					
					Msg m=new Msg();
					m.add("leave", leave);
					m.add("lack", lack);
					m.add("date", date);
					m.add("attend", all-leave-lack);
					m.add("cid", cid);
					m.add("kid", kid);
					msg.add(m);
				}
				model.addAttribute("msg", msg);
				model.addAttribute("msg1", 1);
			}else{        //如果签到记录为空
				model.addAttribute("msg1", 0);
			}
		
		
		return "attendList";
	}
	
	/*
	 *  selectAttendByCidPage （后台用）根据班级的ID，查询这个班级所有的考勤记录，显示仅显示签到时间 到勤人数 缺勤人数 请假人数，点击后再显示详情
	 */
	@RequestMapping("/selectAttendByCidPage.do")
	public String selectAttendByCidPage(HttpServletRequest request,ModelMap model){
		String cid=request.getParameter("id");   //得到班级的ID
		
		//1，查询到所有的考勤ID
		List<Attendcode> list1=new ArrayList<>();     //存储签到记录
		list1=attendcodeService.selectByCid(cid);
		List<Msg> msg=new ArrayList<>();        //通用返回类链表
		List<Student1> allStudent=student1Service.selectAll(cid);   //查询到这个班所有学生
		Integer all=allStudent.size();               //得到这个班所有学生
		
		for(int i=0;i<list1.size();i++){
			String kid=list1.get(i).getTid();       //的到签到ID	
			Integer leave=attendanceService.selectLeaveByKid(kid);   //根据签到ID，查询请假学生多少人
			Integer  lack=attendanceService.selectLackByKid(kid);    //根据签到ID，查询缺勤学生多少人
			Date date=attendanceService.selectDatekByKid(kid);    //根据签到ID，查询签到时间
			Msg m=new Msg();
			m.add("leave", leave);
			m.add("lack", lack);
			m.add("date", date);
			m.add("attend", all-leave-lack);
			m.add("cid", cid);
			m.add("kid", kid);
			msg.add(m);
		}
		model.addAttribute("msg", msg);
		model.addAttribute("num", msg.size());
		return "forward:/pages/attend-list.jsp";
	}
	

	/*
	 * selectTnameByTid 通过老师的id 查询老师的姓名
	 */
	@RequestMapping("/selectTnameByTid.do")
	public void selectTnameByTid(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String tid=request.getParameter("tid");
		Teacher tc=teacherService.selectTnameByTid(tid);
		String tname=tc.getTname();
		response.getWriter().write(tname);
	} 

	/*
	 * selectGradeByZcid 通过自建班级的id 查询这个自建班级所在的年级
	 */
	@RequestMapping("/selectGradeByZcid.do")
	public void selectGradeByZcid(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String zcid=request.getParameter("zcid"); //获取自建班级的id
		//1,通过自建班级id 查询行政班级
		List<Clazz> xc=xandcService.selecClassestByZcid(zcid);
		Integer grade=xc.get(0).getCgrade();
		String result=grade.toString();
		response.getWriter().write(result);
	}
	
	/*
	 * selectMajorByZcid 通过自建班级id 查询自建班级所在专业
	 */
	@RequestMapping("/selectMajorByZcid.do")
	public void selectMajorByZcid(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String zcid=request.getParameter("zcid"); //获取自建班级的id
		//1,通过自建班级id 查询行政班级
		List<Clazz> xc=xandcService.selecClassestByZcid(zcid);
		String major=xc.get(0).getCmajor();
		response.getWriter().write(major);
	}

}
