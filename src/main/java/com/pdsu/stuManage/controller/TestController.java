package com.pdsu.stuManage.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource(name="testService")
	private TestService testService;
	
	@RequestMapping("/login2.do")
	@ResponseBody
	public Msg login2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
			String username=request.getParameter("username");
			String password=request.getParameter("pwd");
			Student1 student=new Student1();
			student=testService.login(username,password);
			
			if(student!=null){
				return Msg.success().add("stu", student);
			}else{
				return Msg.fail().add("msg", "账号或密码错误");
			}
	}
	
	

}
