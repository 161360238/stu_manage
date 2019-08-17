package com.pdsu.stuManage.service;



import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.StuDetailInfo;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;


public interface StuBasicInfoService {
	
		//查询学生分页
		Page<Student1> selectStuBasicInfoByFindStu(FindStu findStu);
				
		//插入学生的奖励信息
		Integer addStuRewardInfo(Reward reward)throws Exception;
		
		//插入学生的处分信息
		Integer addStuPunishInfo(Punishment punishment) throws Exception;
			
		//插入学生的基本信息
		int insertStudent2Info(Student2 student2);
		
		//回显学生入党班委信息
		Student2 selectStu2BySid(String sid)throws Exception;
		
		//查询学生的详情信息
		StuDetailInfo selectStuDeltailBySid(String sid)throws Exception;
		
		//删除学生账号信息
		int delectStuByManagerBySid(String sid) throws Exception;
			
		//教师列表
		Page<Teacher> selectTeacherListByFindStu(FindStu findStu) throws Exception;
		
		//删除教师
		int delectTeaByManagerBySid(String tid);
}
