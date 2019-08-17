package com.pdsu.stuManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.dao.ZClassmateMapper;
import com.pdsu.stuManage.service.ZClassMateService;
/**
 * 班级信息处理
 * @author zhangchi
 *
 */
@Service
public class ZClassmateSeriveImpl implements ZClassMateService{
	
	@Autowired
	private ZClassmateMapper zClassmateMapper;
	
	//查看本班级学生信息
	@Override
	public List<Student1> showClassmateByCid(String id) throws Exception {
		List<Student1> stuList = zClassmateMapper.showClassmateByCid(id);		
		return stuList;
	}
	
	//查看自己的基本信息
	@Override
	public Student1 selectStuBaiscInfoBySid(String sid) throws Exception {		
		return zClassmateMapper.selectStuBaiscInfoBySid(sid);
	}
	
	//查看自己的奖励信息列表
	@Override
	public List<Reward> selectMyselfRewardInfo(String sid) throws Exception {		
		return zClassmateMapper.selectMyselfRewardInfo(sid);
	}
	
	//奖励详情信息
	@Override
	public Reward selectRewardDetailINfo(String rid) throws Exception {		
		return zClassmateMapper.selectRewardDetailINfo(rid);
	}

}
