package com.pdsu.stuManage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.service.StudentAuthInfoService;
import com.pdsu.stuManage.utils.Result;

/**
 * 学生信息完善
 * @author zhangchi
 *
 */
@Controller
public class WeInfoController {
	
	@Autowired
	private StudentAuthInfoService studentAuthInfoServiceImpl;
	

	//认证页面跳转
	@RequestMapping("/AuthenStuInfo")
	public String AuthenStuInfo(HttpSession session,Model model){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		
		//用户是否已经认证
		model.addAttribute("activeUser", activeUser);
		
		//判断用户的身份信息
		if(Integer.parseInt(activeUser.getIdentity()) == 2){
			//教师登录
			return "AuthenTeaInfo";
		}
		
		List<Mandc> list = studentAuthInfoServiceImpl.selectCgradeByPid(0);
		
		model.addAttribute("grade", list);
				
		return "AuthenStuInfo";
	}
	
	//学生信息完善
	@ResponseBody
	@RequestMapping(value = "/addStuInfo.do")
	public Result stuAuthInfo(HttpServletRequest request, Student1 student,String InputSnum,String reid,HttpSession session){		
		
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		int yesOrNo = -3;
		
			MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;			
			MultipartFile mfile = mreq.getFile("myimage");//获取图片文件			
																			
			try {
				yesOrNo = studentAuthInfoServiceImpl.updateAuthenStuInfo(mfile,student,InputSnum,reid, session);
			} catch (Exception e) {				
				e.printStackTrace();
			}
				
			if(yesOrNo == -1){
				return Result.build(400, "图片上传失败");
			}else if(yesOrNo == -2){
				return Result.build(400, "认证失败");
			}
			
		//信息认证通过把学生姓名更新到session中
		activeUser.setUsername(student.getSname());
		activeUser.setStatus("2");//更新认证状态
		session.setAttribute("activeUser", activeUser);
				
		return Result.build(200, "认证成功");
	}
	
	//教师完善信息
	@ResponseBody
	@RequestMapping("/addTeaInfo")
	public Result teaAuthInfo(HttpServletRequest request, Teacher teacher,HttpSession session){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		
		MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;			
		MultipartFile mfile = mreq.getFile("myimage");//获取图片文件
		
		int yesOrNo = -3;
		try {
			teacher.setTphone(activeUser.getUsercode());
			yesOrNo = studentAuthInfoServiceImpl.updateAuthenTeaInfo(mfile, teacher, session);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		if(yesOrNo == -1){
			return Result.build(400, "图片上传失败");
		}else if(yesOrNo == -2){
			return Result.build(400, "认证失败");
		}
		//信息认证通过把教师姓名更新到session中
		activeUser.setUsername(teacher.getTname());
		activeUser.setStatus("2");//更新认证状态
		
		session.setAttribute("activeUser", activeUser);
		
		return Result.build(200, "认证成功");		
	}
	
	//学生信息的回显
	@ResponseBody
	@RequestMapping("/showStuInfo")
	public Student1 showStuInfo(HttpSession session){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		Student1 student = null;
		try {
			student = studentAuthInfoServiceImpl.selectStuByUserCode(activeUser.getUsercode());
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		return student;
	}
	
	//教师信息回显
	@ResponseBody
	@RequestMapping("/showTeaInfo")
	public Teacher ShowStuInfo(HttpSession session){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		Teacher teacher = null;
		try {
			teacher = studentAuthInfoServiceImpl.selectTeaByUserCode(activeUser.getUsercode());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return teacher;
	}
	
	//专业
	@ResponseBody
	@RequestMapping("/selectCmajor")
	public List<Mandc> selectCmajor(int reid){		
		List<Mandc> list = studentAuthInfoServiceImpl.selectCmajorByPid(reid);
		return list;
	}
	
	//班级
	@ResponseBody
	@RequestMapping("/selectClass")
	public List<Mandc> selectClass(int reid){		
		return studentAuthInfoServiceImpl.selectCnameByPid(reid);
	}
	
	
	//宿舍
	@ResponseBody
	@RequestMapping("/selectCname")
	public List<Room> selectCname(int reid){		
		List<Room> list = studentAuthInfoServiceImpl.selectRoomNameByReid(reid);				
		return list;
	}
	
	
}
