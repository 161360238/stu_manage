package com.pdsu.stuManage.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Attendance;
import com.pdsu.stuManage.bean.AttendanceExample;
import com.pdsu.stuManage.bean.AttendanceExample.Criteria;
import com.pdsu.stuManage.bean.AttendanceExample.Criterion;
import com.pdsu.stuManage.dao.AttendanceMapper;

/*
 * 与签到有关的逻辑
 */
@Service("attendanceService")
public class AttendanceService {

	@Resource(name="attendanceMapper")
	private AttendanceMapper attendanceMapper;
	/*
	 * 把签到的记录插入到数据库
	 */
	public void insertRecord(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanceMapper.insertSelective(attendance);
	}

	public List<Attendance> showDetail(String kid) {
		AttendanceExample example=new AttendanceExample();
		Criteria criteria=example.createCriteria();
		criteria.andKidEqualTo(kid).andStatueEqualTo("2");    //状态为2，表示缺勤
		// TODO Auto-generated method stub
		List<Attendance> res=attendanceMapper.selectByExample(example);
		return res;
	}
	
	//更新学生的签到情况
	public void alterAttendStatue(String stuId, String statue,String kid) {
		Attendance record=new Attendance();
		record.setSid(stuId);
		record.setStatue(statue);
		AttendanceExample example=new AttendanceExample();
		Criteria criteria=example.createCriteria();
		criteria.andSidEqualTo(stuId).andKidEqualTo(kid);
		// TODO Auto-generated method stub
		attendanceMapper.updateByExampleSelective(record, example);
	}

	public List<Attendance> showleave(String kid) {
		AttendanceExample example=new AttendanceExample();
		Criteria criteria=example.createCriteria();
		criteria.andKidEqualTo(kid).andStatueEqualTo("1");    //状态为2，表示缺勤
		// TODO Auto-generated method stub
		List<Attendance> res=attendanceMapper.selectByExample(example);
		return res;
	}

	/*
	 * 通过考勤id和学生id，查看表里面有没有这个人
	 */
	public Attendance selectBySidAndKid(String stuId, String kid) {
		List<Attendance> list=new ArrayList<>();
		AttendanceExample example=new AttendanceExample();
		Criteria criteria=example.createCriteria();
		criteria.andSidEqualTo(stuId).andKidEqualTo(kid);
		list=attendanceMapper.selectByExample(example);
		if(list.size()!=0)
		return list.get(0);
		else
		return null;  
	}

	public Date getDate(String kid) {
		List<Attendance> list=new ArrayList<>();
		AttendanceExample example=new AttendanceExample();
		Criteria criteria=example.createCriteria();
		criteria.andKidEqualTo(kid);
		list=attendanceMapper.selectByExample(example);
		return list.get(0).getKtime();
		
	}
	//查询请假人数
	public Integer selectLeaveByKid(String kid) {
		// TODO Auto-generated method stub
		List<Attendance> list1=new ArrayList<>();
		AttendanceExample example=new AttendanceExample();
		Criteria criterion=example.createCriteria();
		criterion.andKidEqualTo(kid).andStatueEqualTo("1");
		list1=attendanceMapper.selectByExample(example);
		return list1.size();
	}
	//查询缺勤学生多少人
	public Integer selectLackByKid(String kid) {
		List<Attendance> list1=new ArrayList<>();
		AttendanceExample example=new AttendanceExample();
		Criteria criterion=example.createCriteria();
		criterion.andKidEqualTo(kid).andStatueEqualTo("2");
		list1=attendanceMapper.selectByExample(example);
		return list1.size();
	}
	//查询签到时间
	public Date selectDatekByKid(String kid) {
		List<Attendance> list1=new ArrayList<>();
		AttendanceExample example=new AttendanceExample();
		Criteria criterion=example.createCriteria();
		criterion.andKidEqualTo(kid).andStatueEqualTo("2");
		list1=attendanceMapper.selectByExample(example);
		//防止数组越界异常
		if(list1.size()!=0)
			return list1.get(0).getKtime();
		else
			return null;
	}
}
