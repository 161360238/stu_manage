package com.pdsu.stuManage.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Attendcode;
import com.pdsu.stuManage.bean.AttendcodeExample;
import com.pdsu.stuManage.bean.AttendcodeExample.Criteria;
import com.pdsu.stuManage.dao.AttendcodeMapper;
import com.pdsu.stuManage.dao.MyAttendcodeMapper;

/*
 * 签到码有关的业务逻辑
 */
@Service("attendcodeService")
public class AttendcodeService {
	
	//生成的mapper
	@Resource(name="attendcodeMapper")
	private AttendcodeMapper attendcodeMapper;
	
	//自定义的mapper
	@Resource(name="myAttendcodeMapper")
	private MyAttendcodeMapper myAttendcodeMapper;
	
	/*
	 * 老师发起签到，把签到信息存储到数据库，以便于学生签到的时候查找
	 */
	public void insertRecord(Attendcode attendcode) {
		// TODO Auto-generated method stub
		attendcodeMapper.insertSelective(attendcode);
	}
	/*
	 * 学生签到，查找数据库有没有该签到码
	 */
	public Attendcode selectByCode(Integer stu_code) {
		// TODO Auto-generated method stub
		return attendcodeMapper.selectByPrimaryKey(stu_code);
	}
	public void setNumByCode(Integer num,Integer Q_code1) {
		
		myAttendcodeMapper.setNumByCode(num,Q_code1);
	}
	
	public Integer selectNumByCode(Integer code) {
		// TODO Auto-generated method stub
		
		Attendcode attendcode=new Attendcode();
		attendcode =  attendcodeMapper.selectByPrimaryKey(code);
		Integer resule=attendcode.getNum();
		  return resule;
	}
	
	//签到结束后，把这条签到码删除
	public void deleteByAcode(int acode) {
		// TODO Auto-generated method stub
		attendcodeMapper.deleteByPrimaryKey(acode);
	}
	public List<Attendcode> selectByCid(String cid) {
		AttendcodeExample example=new AttendcodeExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		// TODO Auto-generated method stub
		return attendcodeMapper.selectByExample(example);
	}
	

}
