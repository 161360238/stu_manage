package com.pdsu.stuManage.dao;

import java.util.List;

import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.utils.FindStu;

public interface PovDeterminMapper {
	
	//添加贫困认定信息
	int addStuPoorDeterMin(Student2 student2) throws Exception;
	
	//更新贫困认定信息
	int updateStuPoorDeterMin(Student2 student2) throws Exception;
	
	//统计贫困认定
	List<Student1> selectStuPageByFindStuPov(FindStu findStu) throws Exception;
	
	//添加民主评议分数
	int addPovDeterScore(Student2 student2)throws Exception;
	
	//查询贫困认定参数
	Student2 selectPovDeterScore(String sid) throws Exception;
	
	Student2 selectPovDeterInfo(String sid) throws Exception;
	
	int deletePovDeterInfo(String sid)throws Exception; 
	
	//贫困认定的开放关闭
	int updatePovDeterStutas(Function function) throws Exception;
	
	//查询贫困认定是否开放
	Function selectPovDeterStutas(String fid) throws Exception;
}
