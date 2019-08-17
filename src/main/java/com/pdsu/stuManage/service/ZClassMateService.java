package com.pdsu.stuManage.service;

import java.util.List;

import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.Student1;

public interface ZClassMateService {
	
	//查看班级学生信息
	List<Student1> showClassmateByCid(String id) throws Exception;
	
	//查看自己的信息
	Student1 selectStuBaiscInfoBySid(String sid) throws Exception;
		
	//查看奖励信息
	List<Reward> selectMyselfRewardInfo(String sid)throws Exception;
	
	//奖励详情信息
	Reward selectRewardDetailINfo(String rid) throws Exception;
}
