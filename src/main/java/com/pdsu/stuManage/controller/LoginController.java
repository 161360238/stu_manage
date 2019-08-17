package com.pdsu.stuManage.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.exception.CustomException;
import com.pdsu.stuManage.service.TeacherService;
import com.pdsu.stuManage.service.UserService;
import com.pdsu.stuManage.utils.Result;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	//用户注册
	@RequestMapping("/registerdate")
	@ResponseBody
	public Result registerdate(String randomcode,int usertype,String usercode,String password,HttpSession session){
		
		String validateCode = (String) session.getAttribute("validateCode");
		//验证码错误
		if(randomcode == null || randomcode =="" || !validateCode.equals(randomcode)){
			return Result.build(400, "验证码错误");
		}
		
		int YesOrNo = 0;
		try {
			 YesOrNo = userServiceImpl.insertUser(usertype, usercode, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(YesOrNo == -1) return Result.build(500, "账号已存在");	
		
		if(YesOrNo == 0) return Result.build(500, "注册失败");
				
		return Result.build(200, "注册成功");
	}
	
	//用户注册跳转
	@RequestMapping("/register")
	public String register(){		
		return "register";
	}
	
	//用户登录
	@RequestMapping("/login")
	public String login(HttpServletRequest request)throws Exception{
		
		//如果登陆失败从request中获取认证异常信息
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		
		//用户登陆的异常判断
		if(exceptionClassName != null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {			
				throw new CustomException("用户名不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
				throw new CustomException("密码错误");
			}else if("randomcodeError".equals(exceptionClassName)){
				throw new CustomException("验证码错误");
			}else{
				throw new Exception("未知错误");//未知错误
			}
		}
		
		//如果登陆成功(认证成功),shiro会自动跳转到上一个请求路径
		//如果登陆不成功,执行一下代码即还跳转到登陆页面
		return "login";
	}
	
	@RequestMapping("/index")
	public String first(Model model,HttpSession session){		
		//在这家session
		Subject subject = SecurityUtils.getSubject();		
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();///获取用户信息，
				
		 String userid=activeUser.getUserid();
		 String usercode=activeUser.getUsercode();
		if(userid.length() == 11){
			Teacher teacher=teacherService.selectByPhone(userid);
		}
		
		if(usercode.length()==11){
			String id=activeUser.getUserid();
			session.setAttribute("session_tid", id);
		}else{
			String id=activeUser.getUserid();
			session.setAttribute("session_sid", id);
		}
		
		session.setAttribute("activeUser", activeUser);
			
		model.addAttribute("activeUser", activeUser);
		
		
	  if(activeUser.getIdentity().equals("3") || activeUser.getIdentity().equals("4")){//管理员
		  	return "redirect:/pages/index.jsp";
	  }
							
		return "index";
	}
	
	@RequestMapping("/findindex")
	public String findindex(){		
		return "index";
	}
	
	//设置
	@RequestMapping("/reset")
	public String reset(){
		return "set";		
	}
	
	//重置密码页面
	@RequestMapping("/setNewPassword")
	public String setNewPassword(){		
		return "setNewPassword";
	}
	
	
	//重置密码
	@ResponseBody
	@RequestMapping("/resetPaw")
	public Result resetpaw(HttpSession session,String oldpass,String newpass){
		int yesOrNo = 0;
		try {
			yesOrNo = userServiceImpl.updateStuPassword(session, oldpass, newpass);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		if(yesOrNo < 1) return Result.build(400, "密码不正确");		
		return Result.build(200, "重置密码成功");
	}
	
	//忘记密码
	@RequestMapping("/resetUserPsss")
	public String resetPsss(){
		return "resetPsss";
	}
	
	
	@RequestMapping("/activity")
	public String activity1(){		
		return "activity";
	}
	
	@RequestMapping("/userMyactivity")
	public String userMyactivity(){
		return "myactivity";
	}
	
}
