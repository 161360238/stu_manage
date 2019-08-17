package com.pdsu.stuManage.dao;

import java.util.List;

import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.utils.FindStu;

public interface AdminBasicInfoMapper {
	
			//查询学生分页
			List<Student1> selectStuPageByFindStu(FindStu findStu);
			
			//总页数
			Integer selectStuConunt(FindStu findStu);
			
			//插入学生的奖励信息
			Integer addStuRewardInfo(Reward reward)throws Exception;
			
			//插入学生的处分信息
			Integer addStuPunishInfo(Punishment punishment) throws Exception;
			
			//<!-- 插入学生的入党班委等信息 -->
			int addStudent2Info(Student2 student2)throws Exception;
			
			//<!-- 查询入党班委是否已经存在-->
			int selesctStudent2InfoExist(String sid);
			
			//<!-- 更新入党班委等信息 -->
			int updateStudent2Info(Student2 student2)throws Exception;
			
			//<!-- 回显入党班委等信息 -->
			Student2 selectStu2BySid(String sid)throws Exception;
			
			//查询学生的奖励情况
			List<Reward> selectStuRewardInfoBySid(String sid) throws Exception;
			
			//查询学生的处分情况
			List<Punishment> selectStupunishmentInfoBySid(String sid) throws Exception;
			
			//删除学生账号
			int delectStuByManagerBySid(String sid) throws Exception;
			
			//同步到student1中班委
			int updateStudent1Role(Student2 student2);
			
			Integer selectCountTeacherByFindStu(FindStu findStu)throws Exception;
			
			//教师列表
			List<Teacher> selectPageTeacherByFindStu(FindStu findStu) throws Exception;
			
			//删除教师
			int delectTeaByManagerBySid(String tid);
			
}
