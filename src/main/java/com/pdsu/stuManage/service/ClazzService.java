package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Clazz;
import com.pdsu.stuManage.bean.ClazzExample;
import com.pdsu.stuManage.bean.ClazzExample.Criteria;
import com.pdsu.stuManage.bean.Xandc;
import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.dao.ClazzMapper;
import com.pdsu.stuManage.dao.MyXandcMapper;
import com.pdsu.stuManage.dao.XandcMapper;

/*
 * 处理与班级有关的逻辑
 */
@Service("clazzService")
public class ClazzService {

	@Resource(name="clazzMapper")
	private ClazzMapper clazzMapper;
	
	@Resource(name="zclassService")
	private ZclassService zclassService;
	
	@Resource(name="myXandcMapper")
	private MyXandcMapper myXandcMapper;
	
	//行政班级与自建班级中间表
	@Resource(name="xandcMapper")
	private XandcMapper xandcMapper;

	public void insertClazz(Clazz clazz) {
		// TODO Auto-generated method stub
		clazzMapper.insertSelective(clazz);
	}

	public List<Clazz> selectAllClazz() {
		ClazzExample example=new ClazzExample();
		example.setOrderByClause("cgrade ASC,cmajor ASC,cname ASC");
		return clazzMapper.selectByExample(example);
	}

	public void alterStopClazz(String cid) {
		Clazz record=new Clazz();
		record.setCstatue("0");
		
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		clazzMapper.updateByExampleSelective(record, example);
	}

	public void alterStartClazz(String cid) {
		Clazz record=new Clazz();
		record.setCstatue("1");
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		clazzMapper.updateByExampleSelective(record, example);
		
	}

	public Clazz selectClazz(String cid) {
		// TODO Auto-generated method stub
		return clazzMapper.selectByPrimaryKey(cid);
	}

	public void editClazz(Clazz clazz2, String cid) {
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		// TODO Auto-generated method stub
		clazzMapper.updateByExampleSelective(clazz2, example);
	}

	public void deleteClazz(String cid) {
		// TODO Auto-generated method stub
		clazzMapper.deleteByPrimaryKey(cid);
	}

	public List<Clazz> selectClazzByLike(int cgrade, String major, String clazzs) {
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		
		if(cgrade==0){	
			return clazzMapper.selectByExample(null);
			
		}else{
			if(major!=null&&clazzs==null){
				criteria.andCgradeEqualTo(cgrade).andCmajorEqualTo(major);
			}else if(major!=null&&clazzs!=null){
				criteria.andCgradeEqualTo(cgrade).andCidEqualTo(clazzs).andCmajorEqualTo(major);
			}else{
				criteria.andCgradeEqualTo(cgrade);
			}
			
			// TODO Auto-generated method stub
			return clazzMapper.selectByExample(example);
		}
		
		
	}

	public void alterCscore(float cscore, String cid) {
		// TODO Auto-generated method stub
		 float  b   =  (float)(Math.round(cscore*10))/10;
		Clazz clazz=new Clazz();
		clazz.setCscore(b);
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		
		clazzMapper.updateByExampleSelective(clazz, example);
	}

	public void alterAssis(String cid, String assis) {
		Clazz record=new Clazz();
		record.setIntroduce(assis);
		ClazzExample example=new ClazzExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		// TODO Auto-generated method stub
		clazzMapper.updateByExampleSelective(record, example);
	}

	public List<Zclass> selectZclassByLike(List<Clazz> emps) {
		List<Zclass> zc=new ArrayList<>();
		Set<String> zcid=new HashSet<>();    //存储自建班级的ID 集合 去重
		List<Xandc> zxc=new ArrayList<>();
		
		for(int i=0;i<emps.size();i++){
			
			List<Xandc> xc=myXandcMapper.selectRecordByCid(emps.get(i).getCid());           //查询到行政班级对应的中间表记录
			zxc.addAll(xc);                               //吧查询到的所有记录 放到一起
		}
		for(int i=0;i<zxc.size();i++){
			zcid.add(zxc.get(i).getZcid());         //去重后的自建班级id
		}
		for (String xandc : zcid) {
			Zclass zc2=zclassService.selectByCid(xandc);
			zc.add(zc2);
		}
		return zc;
	}


	
}
