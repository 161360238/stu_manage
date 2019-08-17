package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.MandcExample;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Xandc;
import com.pdsu.stuManage.bean.XandcExample;
import com.pdsu.stuManage.bean.XandcExample.Criteria;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.dao.MandcMapper;
import com.pdsu.stuManage.dao.MyMandcMapper;
import com.pdsu.stuManage.dao.XandcMapper;
import com.pdsu.stuManage.dao.ZclassMapper;

import cn.itcast.commons.CommonUtils;

@Service("mandcService")
public class MandcService {
	
	//自关联
	@Resource(name="myMandcMapper")
	private MyMandcMapper myMandcMapper;
	
	@Resource(name="student1Service")
	private Student1Service student1Service;
	
	@Resource(name="mandcMapper")
	private MandcMapper mandcMapper;
	
	@Resource(name="xandcMapper")
	private XandcMapper xandcMapper;
	
	
	// 班级表
	@Resource(name="clazzService")
	private ClazzService clazzService;
	
	@Resource(name="zclassMapper")
	private ZclassMapper zclassMapper;

	//先添加年份记录
	public int addyear(Integer grate) {
		Integer pid=0;
		Mandc mandc=new Mandc();
		mandc.setPid(pid);
		mandc.setCgrade(grate);
		mandc.setCmajor(grate.toString());//内容都要在major中进行显示
		
		myMandcMapper.addAndGetYear(mandc);
		return mandc.getReid();
	}
	
	/*
	 * 添加专业记录
	 */
	public int addmajor(String major, int pid) {
		
		Mandc mandc=new Mandc();
		mandc.setPid(pid);
		mandc.setCmajor(major);
		myMandcMapper.addAndGetMajor(mandc);
		return  mandc.getReid();
	}
	/*
	 * 添加班级
	 */
	public int addclass(String class1, int pid,int grate,String major) {  //班级名称，父id，年级，专业
		 Clazz clazz=new Clazz();			
		Mandc mandc=new Mandc();
		mandc.setPid(pid);     //设置父id
		mandc.setCname(class1);  //设置班级名称
		String uuid=CommonUtils.uuid();
		mandc.setCid(uuid);  //设置班级ID
		mandc.setCmajor(class1);  //内容都要在major中进行显示
		myMandcMapper.addAndGetClass(mandc);
		
		clazz.setCgrade(grate);
		clazz.setCmajor(major);
		clazz.setCname(class1);
		clazz.setCid(uuid);
		clazzService.insertClazz(clazz);    //在班级表里面也要插入该班级
		
		return  mandc.getReid();
	}

	public Mandc selectByYear(Integer year) {
		// TODO Auto-generated method stub
		return myMandcMapper.selectByYear(year);
	}


	public Mandc selectByYearAndMajor(String cmajor,Integer pid) {
		// TODO Auto-generated method stub
		return  myMandcMapper.selectByYearAndMajor(cmajor,pid);
	}

	public Mandc selectByclassAndMajor(String cname, Integer pid) {
		// TODO Auto-generated method stub
		return myMandcMapper.selectByclassAndMajor(cname,pid);
	}

	/*
	 * 查询年级（已经加状态）
	 */
	public List<Mandc> selectYear() {
		MandcExample example=new MandcExample();
		com.pdsu.stuManage.bean.MandcExample.Criteria criteria=example.createCriteria();
		List<Mandc> list=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		criteria.andPidEqualTo(0).andRestatueEqualTo(1);
		list= mandcMapper.selectByExample(example);
		
		//return myMandcMapper.selectYear(0);
		for(int i=0;i<list.size();i++){
			list2.add(list.get(i).getCgrade());
		}
		return mandcMapper.selectByExample(example);
	}

	/*
	 * 根据年级查询专业（已经加入状态）
	 */
	public List<String> selectMajor(Integer cgrade) {
		// TODO Auto-generated method stub
		//先查出年级的ID，作为专业的父id去查询专业
		Integer reid=myMandcMapper.selectReidByCgrade(cgrade);
		Integer pid=reid;
		
		MandcExample example=new MandcExample();
		com.pdsu.stuManage.bean.MandcExample.Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(pid).andRestatueEqualTo(1);    //状态为1表示正常，0表示已经被删除
		//List<Mandc> mandcs= myMandcMapper.selectMajor(pid);
		List<Mandc> mandcs= mandcMapper.selectByExample(example);
		
		List<String> list=new ArrayList<>();
		for(int i=0;i<mandcs.size();i++){
			list.add(mandcs.get(i).getCmajor());
		}
		return  list;
	}

	//最后定位到班级(已经加入状态)
	public List<Mandc> selectclazz(String cmajor,Integer cgrade) {
		Integer pid1=myMandcMapper.selectReidByCgrade(cgrade);        //年级的ID
		Mandc m=new Mandc();
		m=myMandcMapper.selectByYearAndMajor(cmajor,pid1);    //查询到专业
		
		MandcExample example=new MandcExample();
		com.pdsu.stuManage.bean.MandcExample.Criteria criteria=example.createCriteria();
		criteria.andPidEqualTo(m.getReid()).andRestatueEqualTo(1);
		return mandcMapper.selectByExample(example);
		//return myMandcMapper.selectclazz(m.getReid());
	}

	/*public List<Mandc> selectMajorByCheck(Integer cgrade) {
		Integer pid=myMandcMapper.selectReidByCgrade(cgrade);        //年级的ID
		// TODO Auto-generated method stub
		return myMandcMapper.selectMajor(pid);
	}*/
	
	//通过学生的id，查询他加入的自建班级
	public List<Zclass> selectZclassBysid(String sid) {
		//1，先查出他所在的行政班级，
		Student1 stu=new Student1();
		stu=student1Service.selectBySid(sid);
		String cid=stu.getCid();           //获得行政班级ID
		XandcExample example=new XandcExample();
		Criteria  criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		//2，根据他所在的行政班级，查出他加入的自建班级
		List<Xandc> list=xandcMapper.selectByExample(example);
		List<Zclass> zclasses=new ArrayList<>();     //存储查出的自建班级
		for(int i=0;i<list.size();i++){
			Zclass zc=zclassMapper.selectByPrimaryKey(list.get(i).getZcid());
			zclasses.add(zc);            
		}
		return zclasses;
	}

	public void deleteClazz(String cid) {
		MandcExample example=new MandcExample();
		com.pdsu.stuManage.bean.MandcExample.Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		// TODO Auto-generated method stub
		mandcMapper.deleteByExample(example);
	}



}
