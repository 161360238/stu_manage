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
import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.service.ClazzService;
import com.pdsu.stuManage.service.MandcService;
import com.pdsu.stuManage.service.Student1Service;

@Controller
public class ClazzController {
	@Resource(name="clazzService")
	private ClazzService clazzService; 
	
	@Resource(name="student1Service")
	private Student1Service student1Service;
	
	@Resource(name="mandcService")
	private MandcService mandcService;
	
	@RequestMapping("/selectAllClazz.do")
	public String selectAllClazz(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model){
		
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Clazz> emps = clazzService.selectAllClazz();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Clazz> page = new PageInfo<Clazz>(emps, 5);
		
		model.addAttribute("pageInfo", page);
		return "forward:pages/class-list.jsp";
	}
	
	
	/*
	 * selectStuNum  根据班级id 查询班级里面的人数，并更新班级表
	 */
	@RequestMapping("/selectStuNum.do")
	public void selectStuNum(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String cid=request.getParameter("cid");
		List<Student1> stu=student1Service.selectByCid(cid);
		Integer num=stu.size();
		
		String stuNum=num.toString();
		
		response.getWriter().write(stuNum);
	}
	
	/*
	 * settingClazz 设置班级，跳转页面
	 */
	@RequestMapping("/settingClazz.do")
	public String settingClazz(ModelMap model){
		List<Clazz> clazzes=new ArrayList<>();
		clazzes=clazzService.selectAllClazz();
		int num=clazzes.size();
		model.addAttribute("msg", clazzes);
		model.addAttribute("num", num);
		return "forward:pages/class-setting.jsp";
	}
	
	/*
	 * editClassNum 修改班级评分
	 */
	@RequestMapping("/editClassNum.do")
	public String editClassNum(HttpServletRequest request,ModelMap model){
		String cid=request.getParameter("cid");
		Clazz clazz=clazzService.selectClazz(cid);
		model.addAttribute("cscore", clazz.getCscore());
		model.addAttribute("cid", cid);
		return "forward:pages/class-num.jsp";
	}
	
	/*
	 * selectClazzByLike 根据条件查询班级
	 */
	@RequestMapping("/selectClazzByLike.do")
 	public String selectClazzByLike(
 			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
 			HttpServletRequest request,Model model){
		String year=request.getParameter("year");   //获取年份
		String major=request.getParameter("major");  //获取专业名称
		String clazzs=request.getParameter("clazzs");  //获取班级ID
		if("0".equals(major)||major==""){
			major=null;
		}
		if("0".equals(clazzs)||clazzs==""){
			clazzs=null;
		}
		if(year==null||year==""){
			year="0";
		}
		PageHelper.startPage(pn, 5);
		List<Clazz> emps = clazzService.selectClazzByLike(Integer.parseInt(year),major,clazzs);
		PageInfo<Clazz> page = new PageInfo<Clazz>(emps, 5);
		model.addAttribute("pageInfo", page);
		
		if(year!="0"){  //说明是条件查询，非条件查询则year为零
			//需要根据班级id查询班级名称，用于回显
			if((clazzs!=null)&&(clazzs!="")){
				Clazz clazz=clazzService.selectClazz(clazzs);
			   model.addAttribute("cname", clazz.getCname());
			}else{
				model.addAttribute("cname", null);
			}
			
			model.addAttribute("year", year);
			model.addAttribute("major", major);
			model.addAttribute("clazzs", clazzs);
		}
		
		return "forward:pages/class-detail.jsp";
	}
	
	/*
	 * ClazzAdmin 查看班委成员
	 */
	@RequestMapping("/ClazzAdmin.do")
	public String ClazzAdmin(HttpServletRequest request,ModelMap modle){
		String cid=request.getParameter("cid");   //获取班级id
		List<Student1> list=new ArrayList<>();
		list=student1Service.ClazzAdmin(cid);
		if(list.size()==0){
			list=null;
		}
		modle.addAttribute("student1s", list);
		return "forward:pages/class-admin.jsp";
	}
	
	
	//@RequestMapping("/selectDetail.do")
	public String getEmps(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model) {
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Clazz> emps = clazzService.selectAllClazz();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<Clazz> page = new PageInfo<Clazz>(emps, 5);
		model.addAttribute("pageInfo", page);
		return "forward:pages/class-detail.jsp";
	}
	
	
	/*
	 * ClazzAssis.do 设置辅导员 跳转页面并回显
	 */
	@RequestMapping("/ClazzAssis.do")
	public String ClazzAssis(HttpServletRequest request,ModelMap model){
		String cid=request.getParameter("cid");
		Clazz clazz=clazzService.selectClazz(cid);
		model.addAttribute("assis", clazz.getIntroduce());
		model.addAttribute("cid", cid);
		return "forward:pages/class-assis.jsp";
	}
	/*
	 * alterAssis 执行修改辅导员
	 */
	@RequestMapping("/alterAssis.do")
	@ResponseBody
	public Msg alterAssis(HttpServletRequest request){
		String cid=request.getParameter("cid");
		String assis=request.getParameter("assis");
		clazzService.alterAssis(cid,assis);
		return Msg.success();
	}
	
	/*
	 * editClazz 修改班级
	 */
	
	@RequestMapping("/editClazz.do")
	@ResponseBody
	public Msg editClazz(HttpServletRequest request){
		String cid=request.getParameter("cid");
		String year=request.getParameter("year");
		String major=request.getParameter("major");
		String clazz=request.getParameter("class");
		Clazz clazz2=new Clazz();
		clazz2.setCgrade(Integer.parseInt(year));
		clazz2.setCmajor(major);
		clazz2.setCname(clazz);
		clazzService.editClazz(clazz2,cid);
		return Msg.success();
	}
	/*
	 * alterCscore 执行修改班级分数
	 */
	@RequestMapping("/alterCscore.do")
	@ResponseBody
	public Msg alterCscore(HttpServletRequest request){
		String cscore=request.getParameter("cscore");
		String cid=request.getParameter("cid");
		clazzService.alterCscore(Float.parseFloat(cscore),cid);
		return Msg.success();
	}
	
	
	
	/*
	 * 停用班级状态
	 */
	@RequestMapping("/alterStopClazz.do")
	@ResponseBody
	public Msg alterStopClazz(HttpServletRequest request){
		String cid=request.getParameter("id");
		clazzService.alterStopClazz(cid);
		return Msg.success();
	}
	/*
	 * deleteClazz 删除班级
	 */
	@RequestMapping("/deleteClazz.do")
	public Msg deleteClazz(HttpServletRequest request){
		String cid=request.getParameter("id");
		clazzService.deleteClazz(cid);
		mandcService.deleteClazz(cid);
		
		return Msg.success();
	}
	/*
	 *  alterStartClazz启用班级状态
	 */
	@RequestMapping("/alterStartClazz.do")
	@ResponseBody
	public Msg alterStartClazz(HttpServletRequest request){
		String cid=request.getParameter("id");
		clazzService.alterStartClazz(cid);
		return Msg.success();
	}
	/*
	 * selectClazz 查询班级
	 */
	@RequestMapping("/selectClazz.do")
	public String selectClazz(HttpServletRequest request,ModelMap model){
		String cid=request.getParameter("id");
		Clazz clazz=new Clazz();
		clazz=clazzService.selectClazz(cid);
		model.addAttribute("clazz", clazz);
		return "forward:/pages/class-edit.jsp";
	}
	
}
