package com.pdsu.stuManage.service;

import javax.servlet.http.HttpSession;

import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;

public interface PovDeterminService {
	
	//插入贫困认定的
	int insertPovDeterminNum(String[] povNum,HttpSession session,int marker);
		
	//贫困认定统计
	Page<Student1> selectStuPageByFindStu(FindStu findStu);
	
	//添加民主评议分
	int addPovDeterScore(String sid,String score,String marker)throws Exception;
	
	//查询贫困
	Student2 selectPovDeterInfo(String sid) throws Exception;
	
	//删除学生的贫困认定信息
	int deletePovDeterInfo(String sid)throws Exception; 
	
	int updatePovDeterStutasByStutas(String status) throws Exception;
	
	//查询贫困认定是否开放
	Function selectPovDeterStutas();
	
}
