package com.pdsu.stuManage.dao;

import org.apache.ibatis.annotations.Param;

public interface MyAttendcodeMapper {
	
	void setNumByCode(@Param("num") Integer num,  @Param("Q_code1") Integer Q_code1);
}