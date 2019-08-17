package com.pdsu.stuManage.dao;

import java.util.List;

import com.pdsu.stuManage.bean.Administrator;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.utils.FindStu;

public interface UserAccountMapper {
	
	//学生以删除的账号
	Integer selectStuCountAccountByFindStu(FindStu findStu) throws Exception;
	
	//学生账号列表
	List<Student1> selectPageStuAccountByFindStu(FindStu findStu) throws Exception;
	
	//恢复学生账号
	int updateStuAccountBySid(String sid) throws Exception;
	
	//教师以删除的账号
	Integer selectTeaCountAccountByFindStu(FindStu findStu) throws Exception;
	
	//教师账号列表
	List<Teacher> selectPageTeaAccountByFindStu(FindStu findStu) throws Exception;
	
	//恢复教师账号
	int updateTeaAccountBySid(String sid) throws Exception;
	
	//添加管理员账号
	int insertManagerAccount(Administrator administrator)throws Exception;
	
	//管理总数
	Integer selectCountMancherByFindStu(FindStu findStu) throws Exception;
	
	//管理员列表
	List<Administrator> selectPageMancherByFindStu(FindStu findStu)throws Exception;
	
	//删除管理账号
	int deleteManAccountByAid(String aid)throws Exception;
	
	//管理员登录
	Administrator selectManagerAccount(String uesrcode) throws Exception;
	
}
