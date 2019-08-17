package com.pdsu.stuManage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdsu.stuManage.bean.Mandc;

public interface MyMandcMapper {
	Integer addAndGetYear(Mandc grade);

	Integer addAndGetMajor(Mandc mandc);

	Integer addAndGetClass(Mandc mandc);

	Mandc selectByYear(Integer year);

	Mandc selectByYearAndMajor(@Param("cmajor") String cmajor,@Param("pid") Integer pid);

	Mandc selectByclassAndMajor(@Param("cname") String cname, @Param("pid") Integer pid);

	List<Integer> selectYear(int i);

	List<Mandc> selectMajor(Integer pid);

	Integer selectReidByCgrade(Integer cgrade);


	List<Mandc> selectclazz(Integer pid);

	
}
