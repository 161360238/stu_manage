package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student1Example;
import com.pdsu.stuManage.bean.Student1Example.Criteria;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Student2Example;
import com.pdsu.stuManage.dao.MyStudent1Mapper;
import com.pdsu.stuManage.dao.Student1Mapper;
import com.pdsu.stuManage.dao.Student2Mapper;

/*
 * 处理部分与学生有关的业务逻辑
 */
@Service("student1Service")
public class Student1Service {

	@Resource(name="student1Mapper")
	private Student1Mapper student1Mapper;
	
	@Resource(name="student2Mapper")
	private Student2Mapper student2Mapper;
	//自定义mapper
	@Resource(name="myStudent1Mapper")
	private MyStudent1Mapper myStudent1Mapper;
	
	@Resource(name="xandcService")
	private XandcService xandcService;
	
	@Resource(name="student1Service")
	private Student1Service student1Service;
	/*
	 *
	 */
	public List<String> selectAllStudents(String cid) {
		
		return myStudent1Mapper.selectSidByClass(cid);
	}
	
	//查询这个班所有的学生
	public List<Student1> selectAll(String cid) {
		
		//根据自建班级的ID，查询出自建班级所包含的行政班级
		List<Clazz> clazzes=new ArrayList<>();
		List<Student1> students=new ArrayList<>();        //存储学生的链表
		List<Student1> allStu=new ArrayList<>();
		clazzes=xandcService.selecClassestByZcid(cid);  
		List< List<Student1> > all = null;
		for(int i=0;i<clazzes.size();i++){
			students=student1Service.selectByCid(clazzes.get(i).getCid());
			//model.addAttribute("msg"+String.valueOf(i), students);
			allStu.addAll(students);
			
		}
		/*Student1Example example=new Student1Example();
		Criteria criterion=example.createCriteria();
		criterion.andCidEqualTo(cid);*/
		// TODO Auto-generated method stub
		return allStu;
	}
	
	//查询班级ID为 cid 的学生，（查询一个班的学生）
	public List<Student1> selectByCid(String cid) {
		Student1Example example=new Student1Example();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		return student1Mapper.selectByExample(example);
	}

	public Student1 selectBySid(String sid) {
		// TODO Auto-generated method stub
		return student1Mapper.selectByPrimaryKey(sid);
	}

	public List<Student1> selectByRid(String rnum) {
		Student1Example example=new Student1Example();
		Criteria criteria=example.createCriteria();
		criteria.andRidEqualTo(rnum);
		// TODO Auto-generated method stub
		return student1Mapper.selectByExample(example);
	}

	public Student2 selectStu2BySid(String sid) {
		return student2Mapper.selectByPrimaryKey(sid);
	}

	public List<Student1> ClazzAdmin(String cid) {
		List<Student1> stu1=new ArrayList<>();
		Student1Example example=new Student1Example();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid).andRoleIsNotNull();
		stu1=student1Mapper.selectByExample(example);
		return stu1;
	}
	

	
}
