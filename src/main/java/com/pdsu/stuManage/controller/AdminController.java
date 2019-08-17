package com.pdsu.stuManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台页面测试
 * @author hasee
 *
 */
@Controller
public class AdminController {
	
	
	@RequestMapping("/welcome")
	public String admin2(){
		
		return "redirect:/pages/welcome.jsp";
	}
	
	@RequestMapping("/gradeManage")
	public String admin3(){
		return "redirect:/pages/gradeManage.jsp";
	}
			
}
