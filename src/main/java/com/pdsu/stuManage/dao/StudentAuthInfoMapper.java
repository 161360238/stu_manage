package com.pdsu.stuManage.dao;

import java.util.List;

import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;


public interface StudentAuthInfoMapper {
	
	//学生完善信息，插入学生信息
	int updateAuthenStuInfo(Student1 student) throws Exception;
	
	//完善教师信息
	int updateAuthenTeaInfo(Teacher teacher) throws Exception;
	
	List<Mandc> selectCgradeByPid(int id);
	
	List<Mandc> selectCmajorByPid(int id);
	
	List<Mandc> selectCnameByPid(int id);
	
	String selectCidByReid(String reid);
	
	List<Room> selectRoomNameByReid(int reid);
}
