package com.pdsu.stuManage.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;

public interface UserService {
	
	//根据学生的学号，考生号查询学生信息
	public Student1 findStudentByUsercode(String usercode) throws Exception;
	
	//根据教师手机，查询教师信息
	Teacher findTeacherByUsercode(String usercode) throws Exception;
	
	//根据学生的身份查询菜单
	public List<Function> findMenusByIdentity(int identity) throws Exception;
	
	//用户注册
	int insertUser(int usertype,String usercode,String password) throws Exception;
	
	//更新学生密码
	int updateStuPassword(HttpSession session,String oldpass,String newpass) throws Exception;
	
}
