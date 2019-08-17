package com.pdsu.stuManage.service;


import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.Student1;

import com.pdsu.stuManage.bean.Teacher;


public interface StudentAuthInfoService {
	
	//学生完善信息，插入学生信息
	int updateAuthenStuInfo(MultipartFile mfile, Student1 student,String InputSnum,String reid,HttpSession session) throws Exception;
	
	//教师完善信息
	int updateAuthenTeaInfo(MultipartFile mfile,Teacher teacher,HttpSession session) throws Exception;
	
	//回显学生信息
	Student1 selectStuByUserCode(String usercode) throws Exception;
	
	//回显教师信息
	Teacher selectTeaByUserCode(String usercode) throws Exception;
	
	List<Mandc> selectCgradeByPid(int id);
	
	List<Mandc> selectCmajorByPid(int id);
	
	List<Mandc> selectCnameByPid(int id);
	
	List<Room> selectRoomNameByReid(int id);
	
}
