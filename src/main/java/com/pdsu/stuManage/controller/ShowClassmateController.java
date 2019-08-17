package com.pdsu.stuManage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 * 班级成员展示
 * @author hasee
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.service.ZClassMateService;
import com.pdsu.stuManage.service.ZclassService;

@Controller
public class ShowClassmateController {
	
	@Autowired
	private ZClassMateService zClassmateSeriveImpl;
	
	//自建班级的service
	@Resource(name="zclassService")
	private ZclassService zclassService;
	
	//我的   页面跳转
	@RequestMapping("/userPu")
	public String weInfo(){		
		return "userPu";
	}
	
	//查看本班级信息
	@RequestMapping("/showClassmateByCid")
	public String showClassmate(HttpSession session,Model model,HttpServletRequest request){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		if(activeUser.getIdentity().equals("1")){//学生			
			List<Student1> stuList = null;
			try {
				stuList = zClassmateSeriveImpl.showClassmateByCid(activeUser.getUserid());
			} catch (Exception e) {
				e.printStackTrace();
			}	
			model.addAttribute("stuList", stuList);
			return "findMyClass";			
		}
		else if(activeUser.getIdentity().equals("2")){
			String tid=(String) request.getSession().getAttribute("session_tid");
			List<Zclass> zclasses=new ArrayList<>();
			zclasses=zclassService.selectZByTid(tid);
			model.addAttribute("zclasses",zclasses);
			return "zclazz-Admin";
		}
		return "index";
	}
	
	
	//基本信息
	@RequestMapping("/showMyDetailInfo")
	public String showMyDetailInfo(HttpSession session,Model model){
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		Student1 stu = null;
		try {
			stu = zClassmateSeriveImpl.selectStuBaiscInfoBySid(activeUser.getUserid());
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		List<Reward> rewardList = null;
		try {
			rewardList = zClassmateSeriveImpl.selectMyselfRewardInfo(activeUser.getUserid());
		} catch (Exception e) {			
			e.printStackTrace();
		}
		session.setAttribute("stu", stu);
		session.setAttribute("rewardList", rewardList);		
		return "myDetailnfo";
	}
	
	//奖励详情信息
	@RequestMapping("/findDetailRewardInfo")
	public String findDetailRewardInfo(String rid,Model model){
		Reward detailInfo = null;
		try {
			detailInfo = zClassmateSeriveImpl.selectRewardDetailINfo(rid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("detailInfo", detailInfo);
		return "rewardDetail";
	}
}
