package com.pdsu.stuManage.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.dao.UserMapper;
import com.pdsu.stuManage.service.UserService;

import cn.itcast.commons.CommonUtils;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	//根据学生学号考生号查询学生信息
	@Override
	public Student1 findStudentByUsercode(String usercode) throws Exception {			
		Student1 student = userMapper.findStudentByUsercode(usercode);		
		return student;
	}
	
	//根据教师手机号查询教师信息
	@Override
	public Teacher findTeacherByUsercode(String usercode) throws Exception {
		Teacher teacher = userMapper.findTeacherByUsercode(usercode);
		return teacher;
	}
	
	//根据身份查询菜单
	@Override
	public List<Function> findMenusByIdentity(int identity) throws Exception {		
		List<Function> list = userMapper.findMenusByIdentity(identity);	
		return list;
	}
	
	//学生教师注册
	@Override
	public int insertUser(int usertype,String usercode,String password) throws Exception {
		int YesOrNo = 0;
		//判断用户身份
		if(usertype == 1){	
			//学生注册		
			//判断账号是否存在
			List<Student1> list = userMapper.findStudentExist(usercode);			
			if(list.size() > 0) return -1;
				
			//封装学生类
			Student1 stu = new Student1();			
			//根据注册的账号不同		
		
			String str = CommonUtils.uuid();
			stu.setSid(str);//学生Sid		
			stu.setIdentity(1);//权限默认为一	
			stu.setSstatue(1);//已注册
			//获取随机串盐
			String salt = str.substring(1, 8);
			stu.setSalt(salt);
			stu.setSstatue(1);//
			stu.setSpwd(this.GetMD5(password, salt));
			
				if(usercode.length() == 9){
					//学号注册
					stu.setSnum(usercode);//学号
					YesOrNo = userMapper.insertStudent1(stu);
				}else{
					//考生号注册
					stu.setExnum(usercode);//考生号
					YesOrNo = userMapper.insertNewStudent1(stu);
				}		
				
		}else if(usertype == 0){
			//教师注册
			//判断账号是否存在
			List<Teacher> teaList = userMapper.findTeacherExist(usercode);
			if(teaList.size() > 0) return -1;
			
			Teacher teacher = new Teacher();			
			String str = CommonUtils.uuid();
			teacher.setTid(str);
			teacher.setTphone(usercode);
			String salt = str.substring(1, 8);
			teacher.setTpwd(this.GetMD5(password, salt));
			teacher.setSalt(salt);	
			teacher.setIdentity(2);
			teacher.setTscore(1);//已注册
			YesOrNo = userMapper.insertTeacher(teacher);
		}		
		return YesOrNo;
	}
	
	//MD5加密公用方法
	public String GetMD5(String password,String salt){	
		
		SimpleHash simpleHash = new SimpleHash("MD5", password, salt, 1);
		
		return simpleHash.toString();
	}
	
	
	//更新学生密码
	@Override
	public int updateStuPassword(HttpSession session,String oldpass,String newpass) throws Exception {
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		if(activeUser.getIdentity().equals("1")){//学生			
		Student1 student1 = userMapper.selectStuPassword(activeUser.getUserid());
		if(!this.GetMD5(oldpass, student1.getSalt()).equals(student1.getSpwd())) return 0;//密码不正确			
		String newPsw = this.GetMD5(newpass, student1.getSalt());
		Student1 stu = new Student1();
		stu.setSid(activeUser.getUserid());
		stu.setSpwd(newPsw);
		 int yesOrNo = userMapper.updateStuPassword(stu);
		return yesOrNo;
		}else{ //教师
			Teacher teacher = userMapper.selectTeaPassword(activeUser.getUserid());
			if(!this.GetMD5(oldpass, teacher.getSalt()).equals(teacher.getTpwd())) return 0;//密码不正确
			String newPsw = this.GetMD5(newpass, teacher.getSalt());
			Teacher tea = new Teacher();
			tea.setTid(activeUser.getUserid());
			tea.setTpwd(newPsw);
			int yesOrNo = userMapper.updateTeapassWord(tea);
			return yesOrNo;
		}
	
	}
}
