package com.pdsu.stuManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.Administrator;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.service.UserAccountService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;
import com.pdsu.stuManage.utils.Result;
/**
 * 账号管理
 * @author hasee
 *
 */
@Controller
public class UserAccountController {
	
	@Autowired
	private UserAccountService userAccountServiceImpl;
	
	//学生账号
	@RequestMapping("/stuAccountList")
	public String stuAccount(FindStu findStu,Model model){
		
		Page<Student1> page = userAccountServiceImpl.selectStuAccountByFindStu(findStu);
		model.addAttribute("page", page);
		model.addAttribute("stu_name", findStu.getStu_name());				
		return "forward:/pages/stuAccount.jsp";
	}
		
	//恢复学生账号
	@ResponseBody
	@RequestMapping("/thawStuAccount")
	public Result thawStuAccount(String sid){		
		int yesOrNo = userAccountServiceImpl.updateStuAccountBySid(sid);
		if(yesOrNo < 1)return Result.build(400,"操作失败");		
		return Result.build(200,"操作成功");
	}
	
	//教师账号
	@RequestMapping("/teaAccountList")
	public String teaAccount(FindStu findStu,Model model){
		Page<Teacher> page = userAccountServiceImpl.selectTeaAccountByFindStu(findStu);
		model.addAttribute("page", page);
		model.addAttribute("stu_name", findStu.getStu_name());
		return "forward:/pages/teaAccount.jsp";
	}
	
	//恢复教师账号
	@ResponseBody
	@RequestMapping("/thawTeaAccount")
	public Result thawTeaAccount(String tid){		
		int yesOrNo = userAccountServiceImpl.updateTeaAccountBySid(tid);
		if(yesOrNo < 1)return Result.build(400,"操作失败");		
		return Result.build(200,"操作成功");
	}
	
	
	@RequestMapping("/adminList")
	public String adminList(FindStu findStu,Model model){		
		Page<Administrator> page = userAccountServiceImpl.selectManPageByFindStu(findStu);
		model.addAttribute("page",page);
		model.addAttribute("stu_name", findStu.getStu_name());
		return "forward:/pages/adminList.jsp";
	}
	
	//添加管理员页面
	@RequestMapping("/addAdmin")
	public String addAdmin(){			
		return "forward:/pages/addAdmin.jsp";
	}
	
	//添加管理员
	@ResponseBody
	@RequestMapping("/addAdmindo")
	public Result addAdmindo(Administrator administrator,String phone){		
		if(administrator.equals("") || administrator.getApwd().equals("") || phone.equals("")) return Result.build(400,"信息未填写完整");
		administrator.setAcollage(phone);//Interger类型接受不了手机号，只能占用其他字段
		int yerOrNo = userAccountServiceImpl.insertManagerAccount(administrator);
		if(yerOrNo < 1) return Result.build(400,"添加失败");
		return Result.build(200, "添加成功");
	}
	
	//删除管理账号
	@ResponseBody
	@RequestMapping("/delectManAccount")
	public Result delectManAccount(String aid){
		int yesOrNo = 0;
		try {
			yesOrNo = userAccountServiceImpl.deleteManAccountByAid(aid);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		if(yesOrNo < 1) return Result.build(200, "操作失败");
		return Result.build(200, "操作成功");
	}
	
	
	
}
