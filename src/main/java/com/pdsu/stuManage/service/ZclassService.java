package com.pdsu.stuManage.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Xandc;
import com.pdsu.stuManage.bean.XandcExample;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.bean.ZclassExample;
import com.pdsu.stuManage.bean.ZclassExample.Criteria;
import com.pdsu.stuManage.dao.MyXandcMapper;
import com.pdsu.stuManage.dao.XandcMapper;
import com.pdsu.stuManage.dao.ZclassMapper;

import cn.itcast.commons.CommonUtils;

/*
 * 处理与自建班级有关的业务逻辑
 */
@Service("zclassService")
public class ZclassService {
	
	//自建班级的mapper
	@Resource(name="zclassMapper")
	private ZclassMapper zclassMapper;
	
	@Resource(name="myXandcMapper")
	private MyXandcMapper myXandcMapper;
	
	//自建表与行政班级中间表的mapper
	@Resource(name="xandcMapper")
	private XandcMapper xandcMapper;

	//老师创建班级
	public void addZclass(String[] arr, String tid, String zclassname) {
	//1,往自建表里面插入提条数据，自建班级ID，创建老师ID，创建码，班级名称，创建时间，状态
			String zcid=CommonUtils.uuid();  //自建班级ID
			Date ctime=new Date();       //班级创建时间
			Zclass zclass=new Zclass();
			zclass.setTid(tid);
			zclass.setZcid(zcid);
			zclass.setZcname(zclassname);
			zclass.setZctime(ctime);
			zclassMapper.insertSelective(zclass);
	//2，在自建班级表与行政班级表 中间表里面插入数据，让他们关联
			for(int i=0;i<arr.length;i++){
				Xandc xandc=new Xandc();
				xandc.setCid(arr[i]);    //班级ID
				xandc.setReid(CommonUtils.uuid());   //记录ID
				xandc.setZcid(zcid);            //自建班级ID
				xandcMapper.insertSelective(xandc);    //插入记录
			}
	}
	
	/*
	 * 根据老师ID，查询他创建的班级,状态为1表示正常，0为已经删除
	 */
	public List<Zclass> selectZByTid(String tid) {
		ZclassExample example=new ZclassExample();
		Criteria criteria=example.createCriteria();
		criteria.andTidEqualTo(tid).andZcstatueEqualTo(1);
		// TODO Auto-generated method stub
		return zclassMapper.selectByExample(example);
	}

	public Zclass selectByCid(String xandc) {
		
		// TODO Auto-generated method stub
		ZclassExample example=new ZclassExample();
		com.pdsu.stuManage.bean.ZclassExample.Criteria criteria=example.createCriteria();
		criteria.andZcidEqualTo(xandc);
		List<Zclass>list=zclassMapper.selectByExample(example);
		if(list.size()!=0)
		return list.get(0);
		else
			return null;
	}

	/*
	 * 删除自建班级（改变状态）
	 */
	public void delZclazzByZcid(String zcid) {
		// TODO Auto-generated method stub
		Zclass zclass=new Zclass();
		zclass.setZcstatue(0);
		ZclassExample example=new ZclassExample();
		Criteria criteria=example.createCriteria();
		criteria.andZcidEqualTo(zcid);
		zclassMapper.updateByExampleSelective(zclass, example);
	}

}
