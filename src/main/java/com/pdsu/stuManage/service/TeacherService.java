package com.pdsu.stuManage.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.bean.TeacherExample;
import com.pdsu.stuManage.dao.TeacherMapper;

@Service("teacherService")
public class TeacherService {

	/*
	 * 处理与老师有关的逻辑
	 */
	@Resource(name="teacherMapper")
	private TeacherMapper teacherMapper;
	
	public Teacher selectByPhone(String userid) {
		Teacher teacher=new Teacher();
		TeacherExample example=new TeacherExample();
		
		teacherMapper.selectByExample(example);
		return null;
	}

	public Teacher selectTnameByTid(String tid) {
		// TODO Auto-generated method stub
		return teacherMapper.selectByPrimaryKey(tid);
	}

}
