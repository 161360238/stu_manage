package com.pdsu.stuManage.service;

import com.pdsu.stuManage.bean.Administrator;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;

public interface UserAccountService {
	
	//学生账号
	Page<Student1> selectStuAccountByFindStu(FindStu findStu);
	
	//恢复学生账号
	int updateStuAccountBySid(String sid);
		
	//教师账号
	Page<Teacher> selectTeaAccountByFindStu(FindStu findStu);
	
	//恢复教师账号
	int updateTeaAccountBySid(String sid);
	
	//添加管理员账号
	int insertManagerAccount(Administrator administrator);
	
	//管理员列表
	Page<Administrator> selectManPageByFindStu(FindStu findStu);
	
	//删除管理账号
	int deleteManAccountByAid(String aid)throws Exception;
	
	//管理员登录
	Administrator selectManagerAccount(String uesrcode) throws Exception;
	
}
