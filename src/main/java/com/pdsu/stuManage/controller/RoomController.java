package com.pdsu.stuManage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
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
import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.service.ClazzService;
import com.pdsu.stuManage.service.RoomService;
import com.pdsu.stuManage.service.Student1Service;

import cn.itcast.commons.CommonUtils;
/*
 * 处理与宿舍有关请求的处理器
 */
@Controller
@RequestMapping("/room")
public class RoomController {
	
	@Resource(name="roomService")
	private RoomService roomService;
	
	@Resource(name="clazzService")
	private ClazzService clazzService;
	
	//学生的mapper
	@Resource(name="student1Service")
	private Student1Service student1Service;
	/*
	 * addRoom 添加宿舍功能实现
	 */
	@RequestMapping("/addRoom.do")
	@ResponseBody
	public Msg addRoom(HttpServletRequest request,HttpServletResponse response){
		String rnum=request.getParameter("rnum");   //获取宿舍号
		String rpnum=request.getParameter("rpnum");  //获取宿舍容纳人数
		String ismix=request.getParameter("ismix");  //是否为混寝
		
		Room r3 = roomService.selectByRnum(rnum);
		if(r3!=null){        //说明这个宿舍已经存在
			return Msg.fail().add("msg", "该宿舍已经存在");		
		}
		
		Room room=new Room();
		room.setIsmix(Integer.parseInt(ismix));
		room.setRid(CommonUtils.uuid());
		room.setRnum(Integer.parseInt(rnum));
		room.setRpnum(Integer.parseInt(rpnum));
		room.setRscore(123);
		
		roomService.addRoom(room);
		return Msg.success().add("msg", "添加成功");
	}
	
	/*
	 * editRoom 编辑宿舍功能实现 
	 */
	@RequestMapping("/editRoom.do")
	@ResponseBody
	public Msg editRoom(HttpServletRequest request,HttpServletResponse response){
		String rnum=request.getParameter("rnum");   //获取宿舍号
		String rpnum=request.getParameter("rpnum");  //获取宿舍容纳人数
		String ismix=request.getParameter("ismix");  //是否为混寝
		String rid=request.getParameter("rid");   //获取要修改宿舍的id
		Room room=new Room();
		room.setIsmix(Integer.parseInt(ismix));
		room.setRnum(Integer.parseInt(rnum));
		room.setRpnum(Integer.parseInt(rpnum));
		room.setRscore(123);
		
		roomService.editRoom(room,rid);
		return Msg.success().add("msg", "添加成功");
	}
	
	/*
	 * deleteRoom 删除宿舍功能
	 */
	@RequestMapping("/deleteRoom.do")
	@ResponseBody
	public Msg deleteRoom(HttpServletRequest request){
		String rid=request.getParameter("rid");
		roomService.deleteRoom(rid);
		return Msg.success();
	}
	
	
	/*
	 * selectRoom 查询宿舍信息 用于回显
	 */
	@RequestMapping("/selectRoom.do")
	public String selectRoom(HttpServletRequest request,ModelMap model){
		String rid=request.getParameter("rid");
		Room room=new Room();
		room=roomService.selectByRid(rid);
		model.addAttribute("room", room);
		return "forward:/pages/room-edit.jsp";
	} 
	
	/*
	 * selectRoomMember 查询宿舍信息详情，显示宿舍成员 根据宿舍号查
	 */
	@RequestMapping("/selectRoomMember.do")
	public String selectRoomMember(HttpServletRequest request,ModelMap model){
		String rnum=request.getParameter("rnum");
		List<Student1> stu=new ArrayList<>();   //存储宿舍成员
		stu=student1Service.selectByRid(rnum);
		model.addAttribute("students", stu);
		return "forward:/pages/room-detail2.jsp";
	} 
	
	/*
	 * getStudent2 根据学生id，返回学生得任职情况
	 */
	@RequestMapping("/getStudent2.do")
	public void getStudent2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String sid=request.getParameter("sid");
		Student2 stu2=new Student2();
		stu2=student1Service.selectStu2BySid(sid);
		if(stu2!=null){
			String result=stu2.getRole();
			if(result==null){
				result="没有任职";
			}
			response.getWriter().write(result);
		}else{
			response.getWriter().write("没有任职");
		}
		
	}
	
	
	/*
	 * getClazz 根据班级id 回显宿舍所属班级
	 */
	@RequestMapping("/getClazz.do")
	public void getClazz(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String cid=request.getParameter("cid");
		Clazz clazz=new Clazz();
		clazz=clazzService.selectClazz(cid);
		String result;
		if(clazz==null){
			result="还没有分配班级";
		}else{
			result=clazz.getCgrade()+"级"+clazz.getCmajor()+clazz.getCname();
		}
		response.getWriter().write(result);
	}
	
	/*
	 * disRoom 分配宿舍
	 */
	@RequestMapping("/disRoom.do")
	@ResponseBody
	public Msg disRoom(HttpServletRequest request){
		String clazzs=request.getParameter("clazzs");
		String rid=request.getParameter("rid");
		roomService.disRoom(clazzs,rid);
		return Msg.success();
	}
	
	/*
	 * selectRoomByClid 根据院系id 查询这个院系已经添加的宿舍
	 */
	@RequestMapping("/selectRoomByClid.do")
	public String selectRoomByClid(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			
			HttpServletRequest request,Model model){
		String clid="123";
		
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Room> emps = roomService.selectRoomByClid(Integer.parseInt(clid));
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Room> page = new PageInfo<Room>(emps, 5);
		
		model.addAttribute("pageInfo", page);
		
		
		//List<Room> rooms=new ArrayList<>();
		//rooms=roomService.selectRoomByClid(Integer.parseInt(clid));
		//model.addAttribute("rooms", rooms);
		//model.addAttribute("num", rooms.size());
		return "forward:/pages/room-list.jsp";
	}
	
	/*
	 * selectRoomByClid2 根据院系id 和班级id 查询可以分配的宿舍
	 */
	@RequestMapping("/selectRoomByClid2.do")
	@ResponseBody
	public Msg selectRoomByClid2(HttpServletRequest request,HttpServletResponse response){
		String clid=request.getParameter("clid");  //获得院系的id
		String cid=request.getParameter("cid");    //获得宿舍所属班级的id，如果为默认 则可以分配
		List<Room> rooms2=new ArrayList<>();
		rooms2=roomService.selectRoomByClid2(Integer.parseInt(clid),cid);
		return Msg.success().add("rooms", rooms2);
	}
	
	/*
	 * selectByRnum  根据宿舍号查询宿舍
	 */
	@RequestMapping("/selectByRnum.do")
	@ResponseBody
	public Msg selectByRnum(HttpServletRequest request,HttpServletResponse response){
		String rnum=request.getParameter("rnum");
		Room room=new Room();
		room=roomService.selectByRnum(rnum);
		return Msg.success().add("room", room);
	}
	
	/*
	 * addRoomToC 把宿舍分配给班级
	 */
	@RequestMapping("/addRoomToC.do")
	@ResponseBody
	public Msg addRoomToC(HttpServletRequest request,HttpServletResponse response){
		String rnum=request.getParameter("rnum");  //获取宿舍号
		String cid=request.getParameter("cid");    //获取班级ID
		roomService.addRoomToC(rnum,cid);
		return Msg.success();
	}
	
	/*
	 * selectRoomDetail 查看宿舍详细信息 先加载宿舍列表
	 */
	//@RequestMapping("/selectRoomDetail.do")
	public String selectRoomDetail(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			HttpServletRequest request,Model model){
		String clid=request.getParameter("clid");
		
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Room> emps = roomService.selectRoomByClid(Integer.parseInt(clid));
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Room> page = new PageInfo<Room>(emps, 5);
		
		model.addAttribute("pageInfo", page);
		
		//List<Room> rooms=new ArrayList<>();
		//rooms=roomService.selectRoomByClid(Integer.parseInt(clid));
		//model.addAttribute("rooms", rooms);
		//model.addAttribute("num", rooms.size());
		return "forward:/pages/room-detail.jsp";
	}

	/*
	 * selectRoomByCid  根据班级的id 查询 条件查询
	 */
	@RequestMapping("/selectRoomByCid.do")
	public String selectRoomByCid(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			
			HttpServletRequest request,Model model){
		 
		String clazz=request.getParameter("clazzs");  //获取班级id
		String year=request.getParameter("year");   //获取年份
		String major=request.getParameter("major");  //获取专业信息
		
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Room> emps = roomService.selectRoomByCid(clazz);
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Room> page = new PageInfo<Room>(emps, 5);
		if(clazz.length()<3){       //说明不是条件查询   不用回显班级名称
			model.addAttribute("cname", 0);
			model.addAttribute("pageInfo", page);
			model.addAttribute("clazzs", 0);
			model.addAttribute("year", 0);
			model.addAttribute("major", 0);
		}else{                        //是条件查询，需要回显
			Clazz clazz2=new Clazz();
			clazz2=clazzService.selectClazz(clazz);
			model.addAttribute("cname", clazz2.getCname());
			model.addAttribute("pageInfo", page);
			model.addAttribute("clazzs", clazz);
			model.addAttribute("year", year);
			model.addAttribute("major", major);
		}
		
		//list=roomService.selectRoomByCid(clazz);
		
	//	model.addAttribute("rooms", list);
		//model.addAttribute("num", list.size());
		
		return  "forward:/pages/room-detail.jsp";
	}

	/*
	 * selectRoomBySid 学生选宿舍模块，先根据学生id查询他们可以选择的宿舍，返回手机端，以供选择
	 */
	@RequestMapping("/selectRoomBySid.do")
	public String selectRoomBySid(HttpServletRequest request,Model model){
		
		ActiveUser ac=(ActiveUser) request.getSession().getAttribute("activeUser");
		if(!"2".equals(ac.getStatus())){
			return "temp";	
		}
		
		String sid=(String) request.getSession().getAttribute("session_sid");   //获取学生id
		String cid=roomService.selectCidBysid(sid);              //根据学生id查询 所在班级id
		List<Room> rooms=new ArrayList<>();
		rooms=roomService.selectRoomByCid(cid);            //查询这个班级的宿舍以及混寝宿舍
		model.addAttribute("rooms", rooms);
		return "rooms";
	} 
	
	/*
	 * selectPnumByRid 根据宿舍id 查询这个宿舍当前有多少人选
	 */
	@RequestMapping("/selectPnumByRid.do")
	public void selectPnumByRid(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String rnum=request.getParameter("rnum");
		List<Student1> stu=new ArrayList<>();   //存储宿舍成员
		stu=student1Service.selectByRid(rnum);
		//model.addAttribute("students", stu);
		Integer pnum=stu.size();          //获取当前宿舍有多少人
		response.getWriter().write(pnum.toString());
	}
	
	/*
	 * chooseRoom 学生选择宿舍 把宿舍分配给这个学生
	 */
	@RequestMapping("/chooseRoom.do")
	@ResponseBody
	public Msg chooseRoom(HttpServletRequest request,HttpServletResponse response){
		String rid=request.getParameter("rid");     //得到宿舍的id
		String rnum=request.getParameter("rnum");
		String sid=(String) request.getSession().getAttribute("session_sid");
		roomService.chooseRoom(rnum,sid);
				
		return Msg.success();
	}
	
	
}
