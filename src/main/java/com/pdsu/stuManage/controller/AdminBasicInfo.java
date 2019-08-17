package com.pdsu.stuManage.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.StuDetailInfo;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.service.StuBasicInfoService;
import com.pdsu.stuManage.service.StudentAuthInfoService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;
import com.pdsu.stuManage.utils.Result;
/**
 * 学生基本信息
 * @author zhangchi
 *
 */
@Controller
public class AdminBasicInfo {
	@Autowired
	private StuBasicInfoService StuBasicInfoServiceImpl;
	@Autowired
	private StudentAuthInfoService studentAuthInfoServiceImpl;
	
	//查询学生的基本信息
	@RequestMapping("/stuBasicInfoList")
	public String stuBasicInfoList(FindStu findStu,Model model){
								
		Page<Student1> page = StuBasicInfoServiceImpl.selectStuBasicInfoByFindStu(findStu);
		
		List<Mandc> list = studentAuthInfoServiceImpl.selectCgradeByPid(0);		
		model.addAttribute("grade", list);
		//回显数据
		model.addAttribute("henter_year", findStu.getEnter_year());
		model.addAttribute("hstu_major", findStu.getStu_major());
		model.addAttribute("hstu_class", findStu.getStu_class());
		model.addAttribute("hstu_name", findStu.getStu_name());
		model.addAttribute("page", page);
					
		return "forward:/pages/stuBasicInfoList.jsp";
	}
	
	
	//条件查询学生基本信息
	@ResponseBody
	@RequestMapping("/selectBasicStuInfo")
	public Result selectBasicStuInfo(){					
		return Result.build(200, "请求成功");
	}
	

	//获取添加处分的学生id
	@RequestMapping(value="/sendPunishSid",method=RequestMethod.GET)
	public String addpunishStu(String sid,Model model){
		model.addAttribute("sid", sid);	
		return "forward:/pages/punish.jsp";
	}
	
	//添加处分
	@ResponseBody
	@RequestMapping("/addStuPunish")
	public Result addStuPunish(Punishment punishment,String nstime){

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		try {
			Date ptime = dateFormat.parse(nstime);
			punishment.setPtime(ptime);
		} catch (ParseException e) {			
			e.printStackTrace();
			return Result.build(400, "日期必须填写");
		}
		try {
			StuBasicInfoServiceImpl.addStuPunishInfo(punishment);
		} catch (Exception e) {			
			e.printStackTrace();
			return Result.build(400, "添加失败");
		}
		return Result.build(200, "添加成功");
	}
	
	//获取添加奖励的学生id
	@RequestMapping(value = "/sendRewardSid",method=RequestMethod.GET)
	public String sendRewardSid(String sid,Model model){
		model.addAttribute("sid", sid);
		return "forward:/pages/reward.jsp";
	}
	
	//添加奖励
	@ResponseBody
	@RequestMapping("/addStuReward")	
	public Result addStuReward(String nstime,Reward reward){
		
		//将String类型转换为Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		try {
			Date rtime = dateFormat.parse(nstime);
			reward.setRtime(rtime);
		} catch (ParseException e) {			
			e.printStackTrace();
			return Result.build(400, "日期必须填写");
		}
		try {
			Integer yesOrNo = StuBasicInfoServiceImpl.addStuRewardInfo(reward);
		} catch (Exception e) {			
			e.printStackTrace();
			return Result.build(400, "添加失败");
		}				
		return Result.build(200, "添加成功");
	}
	
	//回显学生的个人信息
	@RequestMapping("/snedStuInfoBymanager")
	public String  getStuSidBymanager(String sid,Model model){
		model.addAttribute("sid", sid);
		Student2 stu = null;
		try {
		 stu = StuBasicInfoServiceImpl.selectStu2BySid(sid);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("stu", stu);	
		}		
		model.addAttribute("stu", stu);		
		return "forward:/pages/addStuInfoBymanager.jsp";
	}
	
	//更新插入入党职务等信息
	@ResponseBody
	@RequestMapping("/addStuInfoBymanager")
	public Result addtuInfoBymanager(Student2 student2){
		
		int yesOrNo = StuBasicInfoServiceImpl.insertStudent2Info(student2);
		if(yesOrNo < 1) return Result.build(400, "添加失败");	
		
		return Result.build(200, "添加成功");
	}
	
	//展示学生详情信息
	@RequestMapping(value="/selectStuDetailInfo",method=RequestMethod.GET)
	public String selectDetailStuInfo(String sid,Model model){		
		StuDetailInfo detailInfo = null;
		try {
			detailInfo = StuBasicInfoServiceImpl.selectStuDeltailBySid(sid);
		} catch (Exception e) {			
			e.printStackTrace();
		}			 
		model.addAttribute("detailInfo", detailInfo);		
		return "forward:/pages/detailStuInfo.jsp";
	}
	
	//删除用户账号
	@ResponseBody
	@RequestMapping("/delectStuByManager")
	public Result delectStuByManager(String sid){
		int yesOrNo = 0;
		try {
			yesOrNo = StuBasicInfoServiceImpl.delectStuByManagerBySid(sid);
		} catch (Exception e) {		
			e.printStackTrace();
			return Result.build(400, "删除失败");
		}		
		if(yesOrNo < 1)return Result.build(400, "删除失败");
				
		return Result.build(200, "删除成功");
	}
	
	//教师列表
	@RequestMapping("/teaBasicInfoList")
	public String teaBasicInfoList(FindStu findStu,Model model){
		Page<Teacher> page = null;
		try {
			page = StuBasicInfoServiceImpl.selectTeacherListByFindStu(findStu);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		model.addAttribute("stu_name", findStu.getStu_name());
		model.addAttribute("page", page);		
		return "forward:/pages/teaBasicInfoList.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/delectTeaByManager")
	public Result delectTeaByManager(String tid){		
		int yesOrNo = StuBasicInfoServiceImpl.delectTeaByManagerBySid(tid);
		if(yesOrNo < 1) return Result.build(400,"删除失败");
		return Result.build(200, "删除成功");
	}
	
}
