package com.pdsu.stuManage.service.impl;

import java.util.List;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdsu.stuManage.bean.Administrator;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.dao.UserAccountMapper;
import com.pdsu.stuManage.service.UserAccountService;
import com.pdsu.stuManage.utils.FindStu;
import com.pdsu.stuManage.utils.Page;

import cn.itcast.commons.CommonUtils;
@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountMapper userAccountMapper;
	
	@Override
	public Page<Student1> selectStuAccountByFindStu(FindStu findStu) {
		
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
			Integer count = null;
			try {
				count = userAccountMapper.selectStuCountAccountByFindStu(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Student1> stuList = null;
			try {
				 stuList = userAccountMapper.selectPageStuAccountByFindStu(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(stuList);
			
		}				
		return page;	
	}
	
	//恢复学生账号
	@Override
	public int updateStuAccountBySid(String sid) {
		int yesOrNo = 0;
		try {
			yesOrNo = userAccountMapper.updateStuAccountBySid(sid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yesOrNo;
	}

	@Override
	public Page<Teacher> selectTeaAccountByFindStu(FindStu findStu) {
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
				count = userAccountMapper.selectTeaCountAccountByFindStu(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Teacher> teaList = null;
			try {
				teaList = userAccountMapper.selectPageTeaAccountByFindStu(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(teaList);
			
		}				
		return page;
	}
	
	//恢复教师
	@Override
	public int updateTeaAccountBySid(String sid) {
		int yesOrNo = 0;
		try {
			yesOrNo = userAccountMapper.updateTeaAccountBySid(sid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yesOrNo;
	}
	
	//添加管理员账号
	@Override
	public int insertManagerAccount(Administrator administrator) {				
		int yerOrNo = 0;
		String aid = CommonUtils.uuid();
		String salt = aid.substring(1, 8);
		String password = this.GetMD5(administrator.getApwd(), salt);
		administrator.setAid(aid);
		administrator.setApwd(password);
		administrator.setAimage(salt);//头像作为盐
		administrator.setIdentity(3);//身份
		try {
			yerOrNo = userAccountMapper.insertManagerAccount(administrator);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return yerOrNo;
	}
	
	//MD5加密公用方法
	public String GetMD5(String password,String salt){	
		
		SimpleHash simpleHash = new SimpleHash("MD5", password, salt, 1);
		
		return simpleHash.toString();
	}

	@Override
	public Page<Administrator> selectManPageByFindStu(FindStu findStu) {
		Page<Administrator> page = new Page<Administrator>();
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
				count = userAccountMapper.selectCountMancherByFindStu(findStu);//总条数
			} catch (Exception e) {		
				e.printStackTrace();
			}
			page.setTotal(count);
			List<Administrator> manList = null;
			try {
				manList = userAccountMapper.selectPageMancherByFindStu(findStu);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			page.setRows(manList);
		}				
		return page;		
	}
	
	//删除管理员账号
	@Override
	public int deleteManAccountByAid(String aid) throws Exception {
		int yesOrNo = userAccountMapper.deleteManAccountByAid(aid);
		return yesOrNo;
	}
	
	//管理员登录
	@Override
	public Administrator selectManagerAccount(String uesrcode) throws Exception {		
		return userAccountMapper.selectManagerAccount(uesrcode);
	}

}
