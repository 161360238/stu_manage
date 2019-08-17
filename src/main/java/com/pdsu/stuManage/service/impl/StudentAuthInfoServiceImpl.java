package com.pdsu.stuManage.service.impl;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.dao.StudentAuthInfoMapper;
import com.pdsu.stuManage.dao.UserMapper;
import com.pdsu.stuManage.service.StudentAuthInfoService;


import cn.itcast.commons.CommonUtils;
/**
 * 学生信息认证信息完善
 * @author zhangchi
 *
 */
@Service
public class StudentAuthInfoServiceImpl implements StudentAuthInfoService{
	
	@Autowired
	private StudentAuthInfoMapper studentAuthInfoMapper;
	
	@Autowired
	private UserMapper UserMapper;
			
	//学生完善信息，插入学生信息
	@Override
	public int updateAuthenStuInfo(MultipartFile mfile, Student1 student,String InputSnum,String reid,HttpSession session) throws Exception {
		
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");		
		String cid = studentAuthInfoMapper.selectCidByReid(reid);		
		student.setCid(cid);
		
		if(mfile != null){				
			//图片上传
			String pictPath = this.UpPictures(mfile, session);
			activeUser.setSimage(pictPath);
			if(pictPath == null){
				return -1;
			}
			student.setSimage(pictPath);
		}						
		student.setSstatue(2);//已认证
	
		if(activeUser.getUsercode().length() == 14){
			//新生
			student.setSnum(InputSnum);
			student.setExnum(activeUser.getUsercode());
		}else{
			student.setSnum(activeUser.getUsercode());
		}
		
		int yesOrNo = studentAuthInfoMapper.updateAuthenStuInfo(student);
		
		if(yesOrNo < 1){
			return -2;
		}
		return 1;
	}
	
	
	//图片上传	
	public String UpPictures(MultipartFile mfile,HttpSession session){
		String iconpath = null;
		try {		
		String name = mfile.getOriginalFilename();//获取用户传入的文件名
		String extname = name.substring(name.lastIndexOf(".")); //文件后缀			
		iconpath = CommonUtils.uuid()+extname; //名为文件名			
		ServletContext servletContext = session.getServletContext();
		String realpath = servletContext.getRealPath("/pics");	
		String path =realpath+ "/pictures/"+iconpath; //图片保存的真实路径			
		mfile.transferTo(new File(path));
		
		} catch (Exception e) {
			return null;			
		}
		return iconpath;
	}

	//教师完善信息
	@Override
	public int updateAuthenTeaInfo(MultipartFile mfile, Teacher teacher, HttpSession session) throws Exception {
		
		if(mfile != null){				
			//图片上传
			String pictPath = this.UpPictures(mfile, session);		
			if(pictPath == null){
				return -1;
			}
			teacher.setTimage(pictPath);
		}
		teacher.setTscore(2);//已认证
		int yesOrNo = studentAuthInfoMapper.updateAuthenTeaInfo(teacher);
		
		if(yesOrNo < 1){
			return -2;
		}		
		return 1;
	}

	//回显学生信息
	@Override
	public Student1 selectStuByUserCode(String usercode) throws Exception {		
		Student1 stu = UserMapper.findStudentByUsercode(usercode);
		return stu;
	}

	//回显教师信息
	@Override
	public Teacher selectTeaByUserCode(String usercode) throws Exception {
		Teacher teacher = UserMapper.findTeacherByUsercode(usercode);
		return teacher;
	}

	//查询年级
	@Override
	public List<Mandc> selectCgradeByPid(int id) {
		List<Mandc> list = studentAuthInfoMapper.selectCgradeByPid(id);
		return list;
	}

	//插询专业
	@Override
	public List<Mandc> selectCmajorByPid(int id) {		
		return studentAuthInfoMapper.selectCmajorByPid(id);
	}

	//班级
	@Override
	public List<Mandc> selectCnameByPid(int id) {		
		return studentAuthInfoMapper.selectCnameByPid(id);
	}

	//宿舍号
	@Override
	public List<Room> selectRoomNameByReid(int id) {	
		return studentAuthInfoMapper.selectRoomNameByReid(id);
	}
	
	
	
	





	


	
	
	
}
