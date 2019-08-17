package com.pdsu.stuManage.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.StuDetailInfo;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.dao.AdminBasicInfoMapper;
import com.pdsu.stuManage.service.StuBasicInfoService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;
import cn.itcast.commons.CommonUtils;
/**
 * 查询学生的基本信息
 * @author zhangchi
 *
 */
@Service
public class StuBasicInfoServiceImpl implements StuBasicInfoService{
	@Autowired
	private AdminBasicInfoMapper adminBasicInfoMapper;
	
	//查询学生分页
	@Override
	public Page<Student1> selectStuBasicInfoByFindStu(FindStu findStu) {
		Page<Student1> page = new Page<Student1>();
		page.setPage(findStu.getPage());//获取当前页
		findStu.setSize(10);//每次查询的条数
		page.setSize(10);//同步到返回的page中
		if(findStu != null){
			findStu.setStartRow((findStu.getPage()-1)*findStu.getSize());//开始行
			//判断当前页
			if(findStu.getStu_name()!=null && !"".equals(findStu.getStu_name().trim())){
				findStu.setStu_name(findStu.getStu_name().trim());
			}
			if(findStu.getEnter_year() !=null ){
				findStu.setEnter_year(findStu.getEnter_year());
			}
			if(findStu.getStu_major() !=null ){
				findStu.setStu_major(findStu.getStu_major());
			}
			if(findStu.getStu_class() !=null ){
				findStu.setStu_class(findStu.getStu_class());
			}
			
			Integer count = null;
			try {
				count = adminBasicInfoMapper.selectStuConunt(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Student1> stuList = null;
			try {
				 stuList = adminBasicInfoMapper.selectStuPageByFindStu(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(stuList);
			
		}		
		return page;
	}
	
	//插入学生奖励信息
	@Override
	public Integer addStuRewardInfo(Reward reward) throws Exception {		
		String rid = CommonUtils.uuid();	
		reward.setRid(rid);
		Integer yesOrNo = adminBasicInfoMapper.addStuRewardInfo(reward);
		return yesOrNo;
	}
	
	//插入学生处分信息
	@Override
	public Integer addStuPunishInfo(Punishment punishment) throws Exception {
		String pid = CommonUtils.uuid();	
		punishment.setPid(pid);
		return 	adminBasicInfoMapper.addStuPunishInfo(punishment);
	}
	
	//插入入党学生信息
	@Override
	public int insertStudent2Info(Student2 student2) {
				
		int yesOrNo = 0;		
		int selesctStudent2InfoExist = adminBasicInfoMapper.selesctStudent2InfoExist(student2.getSid());
		if(selesctStudent2InfoExist > 0){
			try {
				//如果存在更新
				yesOrNo = adminBasicInfoMapper.updateStudent2Info(student2);
				adminBasicInfoMapper.updateStudent1Role(student2);
			} catch (Exception e) {	
				e.printStackTrace();
				return 0;
			}
		}else{
			try {
				//不存在插入
				yesOrNo =	adminBasicInfoMapper.addStudent2Info(student2);
				adminBasicInfoMapper.updateStudent1Role(student2);
			} catch (Exception e) {			
				e.printStackTrace();
				return 0;
			}
		}		
		return yesOrNo;
	}
	
	//回显学生的入党班委等信息
	@Override
	public Student2 selectStu2BySid(String sid) throws Exception {		
		int YesOrNo = adminBasicInfoMapper.selesctStudent2InfoExist(sid);
		if(YesOrNo < 1) return null;		
		Student2 student2 = adminBasicInfoMapper.selectStu2BySid(sid);		
		return student2;
	}
	
	//查询的学生的详情信息
	@Override
	public StuDetailInfo selectStuDeltailBySid(String sid) throws Exception {
		StuDetailInfo stuDetailInfo = new StuDetailInfo();
		List<Reward> rewardList = adminBasicInfoMapper.selectStuRewardInfoBySid(sid);
		if(rewardList.size() > 0)stuDetailInfo.setRewards(rewardList);		
		List<Punishment> punishmentList = adminBasicInfoMapper.selectStupunishmentInfoBySid(sid);
		if(punishmentList.size() > 0)stuDetailInfo.setPunishments(punishmentList);
		
		Student2 student2 = adminBasicInfoMapper.selectStu2BySid(sid);
		stuDetailInfo.setStudent2(student2);
		
		return stuDetailInfo;
	}
	
	//删除学生的账号
	@Override
	public int delectStuByManagerBySid(String sid) throws Exception { 
		return adminBasicInfoMapper.delectStuByManagerBySid(sid);
	}
	
	//教师列表
	@Override
	public Page<Teacher> selectTeacherListByFindStu(FindStu findStu) throws Exception {		
		Page<Teacher> page = new Page<Teacher>();
		page.setPage(findStu.getPage());//获取当前页
		findStu.setSize(10);//每次查询的条数
		page.setSize(10);//同步到返回的page中
		if(findStu != null){
			findStu.setStartRow((findStu.getPage()-1)*findStu.getSize());//开始行
			//判断当前页
			if(findStu.getStu_name()!=null && !"".equals(findStu.getStu_name().trim())){
				findStu.setStu_name(findStu.getStu_name().trim());
			}						
			Integer count = null;
			try {
				count = adminBasicInfoMapper.selectCountTeacherByFindStu(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Teacher> teaList = null;
			try {
				 teaList = adminBasicInfoMapper.selectPageTeacherByFindStu(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(teaList);
			
		}				
		return page;
	}
		
	//教师删除
	@Override
	public int delectTeaByManagerBySid(String tid) {		
		return adminBasicInfoMapper.delectTeaByManagerBySid(tid);
	}
	

}
