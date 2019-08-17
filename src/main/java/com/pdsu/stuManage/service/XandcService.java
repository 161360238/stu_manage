package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.Xandc;
import com.pdsu.stuManage.bean.XandcExample;
import com.pdsu.stuManage.bean.XandcExample.Criteria;
import com.pdsu.stuManage.dao.ClazzMapper;
import com.pdsu.stuManage.dao.XandcMapper;


@Service("xandcService")
public class XandcService {
	
	@Resource(name="xandcMapper")
	private XandcMapper xandcMapper;
	
	@Resource(name="clazzMapper")
	private ClazzMapper clazzMapper;

	public List<Clazz> selecClassestByZcid(String id) {
		
		XandcExample example=new XandcExample();
		Criteria criteria=example.createCriteria();
		criteria.andZcidEqualTo(id);
		List<Xandc> list=xandcMapper.selectByExample(example);   //查询到符合要求的记录，
		List<Clazz> clazzes=new ArrayList<>();
		for(int i=0;i<list.size();i++){
			Clazz clazz=clazzMapper.selectByPrimaryKey(list.get(i).getCid());
			clazzes.add(clazz);
		}
		 
		 return clazzes;
	}
	

}
