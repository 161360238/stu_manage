package com.pdsu.stuManage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;

public interface UserMapper {
	
		//根据学生的学号，考生号查询学生信息
		Student1 findStudentByUsercode(String usercode) throws Exception;
		
		//根据教师手机，查询教师信息
		Teacher findTeacherByUsercode(String usercode) throws Exception;
		
		//根据学生或者教师的身份查询菜单
		List<Function> findMenusByIdentity(int identity) throws Exception;
		
		//大二以上学生注册插入数据
		int insertStudent1(Student1 stu) throws Exception;
		
		//新生注册
		int insertNewStudent1(Student1 stu) throws Exception;
		
		//教师注册
		int insertTeacher(Teacher teacher) throws Exception;
		
		//判断学生账号知否存在
		List<Student1> findStudentExist(@Param("usercode") String usercode) throws Exception;
		
		//判断教师账号知否存在
		List<Teacher> findTeacherExist(String usercode) throws Exception;
		
		//查询学生密码
		Student1 selectStuPassword(String sid) throws Exception;
				
		//更新学生密码
		int updateStuPassword(Student1 student1) throws Exception;
		
		//查询教师密码
		Teacher selectTeaPassword(String tid)throws Exception;
		
		//更新教师密码
		int updateTeapassWord(Teacher teacher) throws Exception;
		
}
