
package com.pdsu.stuManage.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.service.MandcService;
import com.pdsu.stuManage.service.Student1Service;
import com.pdsu.stuManage.service.TeacherService;
import com.pdsu.stuManage.service.XandcService;
import com.pdsu.stuManage.service.ZclassService;

/*
 * 与字典表相关的操作
 */
@Controller
@RequestMapping("/addClass")
public class AddClassController {
	
	@Resource(name="mandcService")
	private MandcService mandcService;
	
	//学生service
	@Resource(name="student1Service")
	private Student1Service student1Service;
	
	//自建班级的service
	@Resource(name="zclassService")
	private ZclassService zclassService;
	
	@Resource(name="xandcService")
	private XandcService xandcService;
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	/*
	 *  add 添加年级，专业，班级
	 */
	@RequestMapping("/add.do")
	@ResponseBody
	public Msg add(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String year=request.getParameter("year");
		Integer grate=Integer.parseInt(year);  //获取年级
		
		String major=request.getParameter("major");    //获取专业名称
		String cname=request.getParameter("class");   //获取班级名称
		Integer id1 = 0,id2=0;
		//0，根据要插入的年份，查询要插入的年份是否存在
		Mandc mandc=null;
		mandc=mandcService.selectByYear(grate);
		if(mandc==null){
			//1，如果这个年份没有，先插入年级 父id为零，并获取它的id
			 id1=mandcService.addyear(grate);   
			 
			//2，再插入专业，父id为刚刚插入的年级的id,并获取他的id
			    Mandc mandc2=null;
				mandc2=mandcService.selectByYearAndMajor(major,id1);
				if(mandc2==null){
					id2=mandcService.addmajor(major,id1);  //添加专业
				
					  Mandc mandc3=null;
					  mandc3=mandcService.selectByclassAndMajor(cname,id2);  //查找班级
					if(mandc3==null){
						//如果班级不存在，插入班级
						mandcService.addclass(cname,id2,grate,major);
					
						return Msg.success().add("msg", "添加成功");
					}else{
						//如果班级存在，则不能重复添加
						return Msg.fail().add("msg", "该班级已经存在");
					}
				}else{
					id2=mandc2.getReid();
					//如果这个专业有了
					  Mandc mandc3=null;
					  mandc3=mandcService.selectByclassAndMajor(cname,id2);  //查询班级是否存在
					if(mandc3==null){
						//如果班级不存在，添加班级
						mandcService.addclass(cname,id2,grate,major);
						return Msg.success().add("msg", "添加成功");
					}else{
						//如果班级存在，不能重复添加
						return Msg.fail().add("msg", "该班级已经存在");
					}
				}	
		}else{
			//1.1如果这个年份有
			id1=mandc.getReid();       //年份记录的id
			
			    Mandc mandc2=null;
				mandc2=mandcService.selectByYearAndMajor(major,id1);  //查询专业是否已经存在，
				if(mandc2==null){
					//如果这个专业没有，就插入
					id2=mandcService.addmajor(major,id1);  //ID2为专业ID
					  Mandc mandc3=null;
					  mandc3=mandcService.selectByclassAndMajor(cname,id2);  //查询班级是否存在
					if(mandc3==null){
						//如果班级不存在，就添加班级
						mandcService.addclass(cname,id2,grate,major);
						//同时在班级表里面添加
						return Msg.success().add("msg", "添加成功");
					}else{
						//如果已经存在，不能重复添加
						return Msg.fail().add("msg", "该班级已经存在");
					}
				}else{
					id2=mandc2.getReid();
					//如果这个专业有了
					  Mandc mandc3=null;
					  mandc3=mandcService.selectByclassAndMajor(cname,id2);  //查询班级是否存在
					if(mandc3==null){
						//如果班级不存在，插入班级
						mandcService.addclass(cname,id2,grate,major);
					
						return Msg.success().add("msg", "添加成功");
					}else{
						//如果班级存在，不能重复添加
						return Msg.fail().add("msg", "该班级已经存在");
					}
				}
		}
	}
	
	
	
	/*
	 * selectYear 查询年级（已经加入状态）
	 */
	@RequestMapping("/selectYear.do")
	@ResponseBody
	public Msg selectYear(HttpServletRequest request,HttpServletResponse response){
		List<Mandc> list=new ArrayList<>();
		list=mandcService.selectYear();
		return Msg.success().add("msg",list);
	}
    
	//根据年份查询专业selectMajor.do（已经加入状态）
	@RequestMapping("/selectMajor.do")
	@ResponseBody
	public Msg selectMajor(HttpServletRequest request ,HttpServletResponse response){
		String year =request.getParameter("year");
		Integer cgrade=Integer.parseInt(year);
		List<String> list=new ArrayList<>();
		
		list=mandcService.selectMajor(cgrade);
		return Msg.success().add("msg", list);
	}
	
	//selectclazz 根据专业查询班级（已经加入状态）
	@RequestMapping("/selectclazz.do")
	@ResponseBody
	public Msg selectclazz(HttpServletRequest request ,HttpServletResponse response){
		String cmajor=request.getParameter("cmajor");   //专业
		
		String year =request.getParameter("year");    
		Integer cgrade=Integer.parseInt(year);    //获取年级
		List<Mandc> list=new ArrayList<>();
		list=mandcService.selectclazz(cmajor,cgrade);
		return Msg.success().add("msg", list);
	} 
	
	/*
	 * addZclass 创建自建班级
	 */
	@RequestMapping("/addZclass.do")	
	@ResponseBody
	public Msg addZclass(HttpServletResponse response ,HttpServletRequest request){
		String clazzs=request.getParameter("clazzs");                             //获取包含行政班级的id
		String tid=(String) request.getSession().getAttribute("session_tid");     //获取创建班级老师的ID
		String zclassname=request.getParameter("zclassname");                     //获取创建班级的名称
		String [] arr=clazzs.split(",");
		zclassService.addZclass(arr,tid,zclassname);
		
		return Msg.success();
	}
	
	/*
	 * selectZclass 根据老师的ID 查询这个老师创建的班级（已经加状态）
	 */
	@RequestMapping("/selectZclass.do")
	public String selectZclass(HttpServletResponse response,HttpServletRequest request ,ModelMap model){
		String tid=(String) request.getSession().getAttribute("session_tid");
		List<Zclass> zclasses=new ArrayList<>();
		zclasses=zclassService.selectZByTid(tid);
		model.addAttribute("zclasses",zclasses);
		return "zlist";
	}
	
	/*
	 * adminZclass 根据老师的ID 查询这个老师创建的班级 管理班级（已经加状态）
	 */
	@RequestMapping("/adminZclass.do")
	public String adminZclass(HttpServletResponse response,HttpServletRequest request ,ModelMap model){
		String tid=(String) request.getSession().getAttribute("session_tid");
		List<Zclass> zclasses=new ArrayList<>();
		zclasses=zclassService.selectZByTid(tid);
		if(zclasses.size()!=0){
			model.addAttribute("zclasses",zclasses);
			model.addAttribute("msg",1);
		}else{
			model.addAttribute("msg",0);
		}
		return "zclazz-Admin";
	}
	
	
	
	
	/*
	 * zclassDetail.do 根据班级ID，查询班级详情
	 */
	@RequestMapping("/zclassDetail.do")
	public String zclassDetail(HttpServletRequest request,HttpServletResponse response,ModelMap model){
			String id=request.getParameter("id");   //自建班级的ID
		
			//根据自建班级的ID，查询出自建班级所包含的行政班级
			List<Clazz> clazzes=new ArrayList<>();
			List<Student1> students=new ArrayList<>();        //存储学生的链表
			List<Student1> allStu=new ArrayList<>();
			clazzes=xandcService.selecClassestByZcid(id);     //根据自建班级的id，查询自建班级的班级成员
			
			//查询出包含的学生，并返回
			List< List<Student1> > all = null;
			for(int i=0;i<clazzes.size();i++){
				students=student1Service.selectByCid(clazzes.get(i).getCid());
				//model.addAttribute("msg"+String.valueOf(i), students);
				allStu.addAll(students);
				model.addAttribute("msg", allStu);
			}
		return "zclassMember";
	}
	
	/*
	 * zclassDetail2.do 根据班级ID，查询班级详情 用于学生端显示
	 */
	@RequestMapping("/zclassDetail2.do")
	public String zclassDetail2(HttpServletRequest request,HttpServletResponse response,ModelMap model){
			String id=request.getParameter("id");   //自建班级的ID
		
			//根据自建班级的ID，查询出自建班级所包含的行政班级
			List<Clazz> clazzes=new ArrayList<>();
			List<Student1> students=new ArrayList<>();        //存储学生的链表
			List<Student1> allStu=new ArrayList<>();
			clazzes=xandcService.selecClassestByZcid(id);     //根据自建班级的id，查询自建班级的班级成员
			
			//查询出包含的学生，并返回
			List< List<Student1> > all = null;
			for(int i=0;i<clazzes.size();i++){
				students=student1Service.selectByCid(clazzes.get(i).getCid());
				//model.addAttribute("msg"+String.valueOf(i), students);
				allStu.addAll(students);
				model.addAttribute("msg", allStu);
			}
		return "zclassStuList";
	}
	
	
	
	
	
	/*
	 * stuDetail 查看学生详情，根据学生id查询
	 */
	@RequestMapping("/stuDetail.do")
	public String stuDetail(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		String sid=request.getParameter("stuId");
		Student1 stu=new Student1();
		stu=student1Service.selectBySid(sid);
		model.addAttribute("stu", stu);
		
		return "stuDetail";
	}
	
	
	/*
	 * userDetail 从圈子点击用户头像，查看用户详情
	 */
	@RequestMapping("/userDetail.do")
	public String userDetail(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		String user=request.getParameter("userId");
		Student1 stu=student1Service.selectBySid(user);
		Teacher teacher=teacherService.selectTnameByTid(user);
		if(stu!=null){
			model.addAttribute("stu", stu);
			return "userDetail";
		}else{
			model.addAttribute("teacher", teacher);
			return "userDetail";
		}
		
	}
	
	
	
	
	
	
	/*
	 * selectZclassBysid 通过学生的id，查询他加入的自建班级
	 */
	@RequestMapping("/selectZclassBysid.do")
	public String selectZclassBysid(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		 String sid=(String) request.getSession().getAttribute("session_sid");  //获得学生的id
		 
		 ActiveUser ac=(ActiveUser) request.getSession().getAttribute("activeUser");
			if(!"2".equals(ac.getStatus())){
				return "temp";	
			}
		 
		 List<Zclass> zclass=new ArrayList<>();
		 zclass=mandcService.selectZclassBysid(sid);
		 if(zclass.size()==0){
			 model.addAttribute("msg", 0);            //把查出的自建班级返回
		 }else{
			 model.addAttribute("zclass", zclass);            //把查出的自建班级返回
			 model.addAttribute("msg", 1);            //把查出的自建班级返回
		 }
		return "chooseAttendClass";
	}
	
	/*
	 * selectZclassBysid 通过学生的id，查询他加入的自建班级
	 */
	@RequestMapping("/selectZclassBysid2.do")
	public String selectZclassBysid2(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		 String sid=(String) request.getSession().getAttribute("session_sid");  //获得学生的id
		 
		 ActiveUser ac=(ActiveUser) request.getSession().getAttribute("activeUser");
			if(!"2".equals(ac.getStatus())){
				return "temp";	
			}
			
		 
		 List<Zclass> zclass=new ArrayList<>();
		 zclass=mandcService.selectZclassBysid(sid);
		 if(zclass.size()==0){
			 model.addAttribute("msg", 0);            //把查出的自建班级返回
		 }else{
			 model.addAttribute("zclass", zclass);            //把查出的自建班级返回
			 model.addAttribute("msg", 1);            //把查出的自建班级返回
		 }
		return "stuClassList";
	}
	
	
	
	
	
	/*
	 * 根据自建班级的id，删除这个班级（改变状态）
	 */
	@RequestMapping("/delZclazzByZcid.do")
	@ResponseBody
	public Msg delZclazzByZcid(HttpServletRequest request){
		String zcid=request.getParameter("zcid");
		zclassService.delZclazzByZcid(zcid);
		return Msg.success();
	}
	
}
