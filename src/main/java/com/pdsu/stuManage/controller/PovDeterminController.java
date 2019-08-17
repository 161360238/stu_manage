package com.pdsu.stuManage.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.service.PovDeterminService;
import com.pdsu.stuManage.service.StudentAuthInfoService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;
import com.pdsu.stuManage.utils.Result;
/**
 * 贫困认定
 * @author hasee
 *
 */
@Controller
public class PovDeterminController {
	
	@Autowired
	private PovDeterminService povDeterminNumServiceImpl;
	@Autowired
	private StudentAuthInfoService studentAuthInfoServiceImpl;
	
	//贫困认定入口
	@RequestMapping("/povDetermination")
	public String tizhuanPovDetermin(){			
		Function function = povDeterminNumServiceImpl.selectPovDeterStutas();
		if(function.getPression().equals("0"))return "conPovDeter";							
		return "povDeter";
	}
	
	
	//大一贫困认定
	@RequestMapping("/Stu1povDetermination")
	public String Stu1povDetermination(){		
		return "povDetermination1";
	}
	
	//大二贫困认定
	@RequestMapping("/Stu2povDetermination")
	public String Stu2povDetermination(){		
		return "povDetermination2";
	}
	
	//大一贫困认定
	@ResponseBody
	@RequestMapping("/getStu1Num")
	public Result getNum(String[] povNum,HttpSession session){
		int marker = 0;
		int yesOrNo = povDeterminNumServiceImpl.insertPovDeterminNum(povNum, session,marker);
		if(yesOrNo < 1)	return Result.build(400, "提交失败");
		return Result.build(200, "提交成功");
	}
	
	//大二贫困认定
	@ResponseBody
	@RequestMapping("/getStu2Num")
	public Result getNum2(String[] povNum,HttpSession session){	
		int marker = 1;
		int yesOrNo = povDeterminNumServiceImpl.insertPovDeterminNum(povNum, session,marker);
		if(yesOrNo < 1)	return Result.build(400, "提交失败");
		return Result.build(200, "提交成功");
	}
		
	//后台贫困统计
	@RequestMapping("/amdinPovDeterMana")
	public String amdinPovDeterMana(FindStu findStu,Model model){		
		List<Mandc> list = studentAuthInfoServiceImpl.selectCgradeByPid(0);		
		model.addAttribute("grade", list);		
		Page<Student1> page = povDeterminNumServiceImpl.selectStuPageByFindStu(findStu);
		model.addAttribute("page", page);
		//回显数据
		model.addAttribute("henter_year", findStu.getEnter_year());
		model.addAttribute("hstu_major", findStu.getStu_major());
		model.addAttribute("hstu_class", findStu.getStu_class());
		model.addAttribute("hstu_name", findStu.getStu_name());
				
		return "forward:/pages/povDeterMana.jsp";
	}
	
	//添加民主评议页面
	@RequestMapping("/addPovDeterScore")
	public String addPovDeterScore(String sid,Model model){
		model.addAttribute("sid", sid);		
		return "forward:/pages/addPovDeterScore.jsp";
	}
	
	
	//添加民主评议分数
	@ResponseBody
	@RequestMapping("/addPovDeter")
	public Result addPovDeter(String sid,String score,String marker){		
		if(score.trim() == "" || score == null)return Result.build(400, "信息未填写完整");
		if(marker == "" || marker == null)return Result.build(400, "信息未填写完整");		
		int yesOrNo = 0;
		try {
			yesOrNo = povDeterminNumServiceImpl.addPovDeterScore(sid,score,marker);
		} catch (Exception e) {			
			e.printStackTrace();			
		}
		if(yesOrNo < 1)	Result.build(400, "添加失败");		
		return Result.build(200, "添加成功");
	}
		
	//信息查看
	@RequestMapping("/PovDeterInfo")
	public String PovDeterInfo(String sid,Model model){
		Student2 stu2 = null;
		try {
			stu2 = povDeterminNumServiceImpl.selectPovDeterInfo(sid);
		} catch (Exception e) {		
			e.printStackTrace();
		}
		model.addAttribute("stu2", stu2);
		return "forward:/pages/PovDeterInfo.jsp";
	}
	
	
	//认定信息作废
	@ResponseBody
	@RequestMapping("/delectPovDeter")
	public Result delectPovDeter(String sid){
		int yesOrNo = 0;
		try {
			yesOrNo = povDeterminNumServiceImpl.deletePovDeterInfo(sid);
		} catch (Exception e) {			
			e.printStackTrace();
			return Result.build(400,"作废失败");
		}
		if(yesOrNo < 1)return Result.build(400,"作废失败");
		return Result.build(200, "作废成功");
	}
	
	//开放贫困认定页面
	@RequestMapping("/amdinPovDeteryesOrNo")
	public String amdinPovDeteryesOrNo(Model model){
		Function function = povDeterminNumServiceImpl.selectPovDeterStutas();
		model.addAttribute("function", function);		
		return "forward:/pages/ContrpovDeter.jsp";
	}
	
	
	//开放关闭贫困认定
	@ResponseBody
	@RequestMapping("/updatePovDeterStatusbyPression")
	public Result updatePovDeterStatusbyPression(String status){
		int yesOrNo = 0;
		try {
			yesOrNo = povDeterminNumServiceImpl.updatePovDeterStutasByStutas(status);
		} catch (Exception e) {			
			e.printStackTrace();
			return Result.build(400,"");
		}
		if(yesOrNo < 1) return Result.build(400,"");
		
		return Result.build(200,"");
	}
	
}
