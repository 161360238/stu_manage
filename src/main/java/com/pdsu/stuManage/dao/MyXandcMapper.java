package com.pdsu.stuManage.dao;

import java.util.List;

import com.pdsu.stuManage.bean.Xandc;

public interface MyXandcMapper {

	//通过行政班级id 查询自建班级记录
	List<Xandc> selectRecordByCid(String cid);

}
