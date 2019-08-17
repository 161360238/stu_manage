package com.pdsu.stuManage.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Notice;
import com.pdsu.stuManage.bean.NoticeExample;
import com.pdsu.stuManage.bean.NoticeExample.Criteria;
import com.pdsu.stuManage.bean.NoticeExample.Criterion;
import com.pdsu.stuManage.dao.NoticeMapper;

@Service("noticeService")
public class NoticeService {

	@Resource(name="noticeMapper")
	private NoticeMapper noticeMapper;
	
	public void insertNotice(Notice notice) {
		noticeMapper.insertSelective(notice);
	}

	//查询所有的公告，用于显示
	public List<Notice> selectAllNotice() {
		
		NoticeExample example=new NoticeExample();
		Criteria criteria=example.createCriteria();
		criteria.andNstatueEqualTo(1);
		example.setOrderByClause("btime DESC");
		return noticeMapper.selectByExampleWithBLOBs(example);
	}

	public List<Notice> selectNoticeByOid(String oid) {
		NoticeExample example=new NoticeExample();
		Criteria criteria=example.createCriteria();
		criteria.andNstatueEqualTo(1).andOidEqualTo(oid);
		example.setOrderByClause("btime DESC");
		return noticeMapper.selectByExampleWithBLOBs(example);
	}

	public void deletNotice(String nid) {
		NoticeExample example=new NoticeExample();
		Criteria criteria=example.createCriteria();
		criteria.andNidEqualTo(nid);
		noticeMapper.deleteByExample(example);
		
	}

}
