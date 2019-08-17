package com.pdsu.stuManage.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.AchievementExample.Criteria;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student1Example;
import com.pdsu.stuManage.dao.Student1Mapper;

@Service("testService")
public class TestService {
	
	@Resource(name="student1Mapper")
	private Student1Mapper student1Mapper; 

	public Student1 login(String username, String password) {
	
		Student1Example example=new Student1Example();
		com.pdsu.stuManage.bean.Student1Example.Criteria criteria=example.createCriteria();
		criteria.andSnumEqualTo(username);
			
		// TODO Auto-generated method stub
		List<Student1> students=student1Mapper.selectByExample(example);
		return students.get(0);
	}

}
