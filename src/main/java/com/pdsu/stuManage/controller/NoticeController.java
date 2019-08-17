package com.pdsu.stuManage.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pdsu.stuManage.bean.Msg;
import com.pdsu.stuManage.bean.Notice;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.service.NoticeService;
import com.pdsu.stuManage.service.Student1Service;
import com.pdsu.stuManage.service.TeacherService;

import cn.itcast.commons.CommonUtils;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	@Resource(name="noticeService")
	private NoticeService noticeService;
	
	@Resource(name="teacherService")
	private TeacherService teacherService; 
	
	@Resource(name="student1Service")
	private Student1Service student1Service;
	
	/*
	 * selectNoticeByOid 显示某个人的公告
	 */
	@RequestMapping("/selectNoticeByOid.do")
	public String selectNoticeByOid(HttpServletRequest request,Model model){
		String sid=(String) request.getSession().getAttribute("session_sid");
		String tid=(String) request.getSession().getAttribute("session_tid");
		String oid;
		if(sid!=null){
			oid=sid;
		}else{
			oid=tid;
		}
		
		List<Notice> notices=new ArrayList<>();
		notices=noticeService.selectNoticeByOid(oid);
		
		model.addAttribute("notices", notices);
		
		return "forward:/myNotice.jsp";
	} 
	
	/*
	 * deleteNotice 删除公告
	 */
	@RequestMapping("/deleteNotice.do")
	public String deleteNotice(HttpServletRequest request,Model model){
		String nid=request.getParameter("noticeId");
		noticeService.deletNotice(nid);
		return "forward:/notice/selectNoticeByOid.do";
	} 
	
	
	
	/*
	 * uploadPic.do 上传公告 含有图片
	 */
	@RequestMapping("/uploadPic.do")
	@ResponseBody
	public Msg doUpload(MultipartFile photo,HttpServletRequest request,
			HttpSession session) throws IllegalStateException, IOException{
		String text=request.getParameter("notice");
		if(!photo.isEmpty()){
			//服务端的路径需要手工创建好
			String path=session.getServletContext().getRealPath("/pics/pictures");
			String tid=(String) session.getAttribute("session_tid");
			String sid=(String) session.getAttribute("session_sid");
			
			//获取原始文件名
			String fileName=photo.getOriginalFilename();
			if(fileName.endsWith(".jpg")||fileName.endsWith(".png")){
				//避免文件名称冲突
				fileName=CommonUtils.uuid()+"_"+fileName;
				int index=fileName.lastIndexOf("\\");
				if(index!=-1){
					fileName=fileName.substring(index+1);
				}
 				File file =new File(path, fileName);
 				//完成文件上传
 				photo.transferTo(file);
 				Notice notice=new Notice();
 				notice.setNid(CommonUtils.uuid());
 				notice.setNtext(text);          //公告内容
 				notice.setBtime(new Date());    //发布时间
 				notice.setNimage(fileName);     //存储图片的路径
 				if(tid!=null){
 					notice.setOid(tid);             //设置发布者id，发布者是老师
 				}else{
 					notice.setOid(sid);             //设置发布者id，发布者是学生
 				}
 				
 				noticeService.insertNotice(notice);
			}else{
				return Msg.fail().add("msg", "只能上传.jpg或者.png格式图片");
			}
		}
		return Msg.success().add("msg", "上传成功");
	}

	/*
	 * selectAllNotice 公告圈 显示所有的公告
	 */
	@RequestMapping("/selectAllNotice.do")
	public String selectAllNotice(Model model){
		List<Notice> notices=new ArrayList<>();
		notices=noticeService.selectAllNotice();
		model.addAttribute("notices", notices);
		
		return "forward:/notice-circle.jsp";
	} 
	
	
	
	
	@ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView  handleException(MaxUploadSizeExceededException ex)  {
       //System.out.println("=========================================发生异常了");      
      
       return new ModelAndView("/WEB-INF/jsp/Test.jsp");
    }
	/*
	 * selectOname.do 根据公告发布者的id查询发布者的名字并显示
	 */
	@RequestMapping("/selectOname.do")
	public void selectOname(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String oid=request.getParameter("oid");
		
		Teacher teacher=teacherService.selectTnameByTid(oid);
		if(teacher!=null){
			String result=teacher.getTname();
			response.getWriter().write(result);
		}else{
			Student1 student=student1Service.selectBySid(oid);
			String result=student.getSname();
			response.getWriter().write(result);
		}
	}


}
