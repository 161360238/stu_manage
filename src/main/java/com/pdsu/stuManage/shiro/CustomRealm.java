package com.pdsu.stuManage.shiro;


import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.pdsu.stuManage.bean.ActiveUser;
import com.pdsu.stuManage.bean.Administrator;
import com.pdsu.stuManage.bean.Function;
import com.pdsu.stuManage.bean.Student1;
import com.pdsu.stuManage.bean.Teacher;
import com.pdsu.stuManage.service.UserAccountService;
import com.pdsu.stuManage.service.UserService;


/**
 * 用户的认证授权
 * @author hasee
 *
 */
public class CustomRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private UserAccountService userAccountServiceImpl;
	
	//用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		
		return null;
	}
	
	//用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		//账号身份信息
		String usercode = (String) token.getPrincipal();
		ActiveUser activeUser = new ActiveUser();
		Teacher teacher = null;				
		String password = null;
		String salt = null;
		
		Student1 stu = null;
		//判断用户账号
		if(usercode.length() == 9 || usercode.length() == 14){
			//学生登录		
			try {
				stu = userServiceImpl.findStudentByUsercode(usercode);
			} catch (Exception e) {			
				e.printStackTrace();
			}			
			if(stu == null) return null;
			
			password = stu.getSpwd();
			salt = stu.getSalt();
			
			//封装学生用户信息			
			activeUser.setUserid(stu.getSid());
			activeUser.setUsername(stu.getSname());						
			activeUser.setUsercode(usercode);
			activeUser.setIdentity(stu.getIdentity().toString());
			activeUser.setStatus(stu.getSstatue().toString());
			activeUser.setSimage(stu.getSimage());
			//根据用户的identity查询菜单
			List<Function> menus = null;
			try {
				menus = userServiceImpl.findMenusByIdentity(stu.getIdentity());
			} catch (Exception e) {
				e.printStackTrace();
			}
			activeUser.setMenus(menus);
						
		}else if(usercode.length() == 11){			
			//教师登录
			try {
			 teacher = userServiceImpl.findTeacherByUsercode(usercode);
			} catch (Exception e) {			
				e.printStackTrace();
			}
			if(teacher == null) return null;
			
			password = teacher.getTpwd();
			salt = teacher.getSalt();
			
			//封装教师用户信息			
			activeUser.setUserid(teacher.getTid());
			activeUser.setUsername(teacher.getTname());
			activeUser.setUsercode(teacher.getTphone());
			activeUser.setIdentity(teacher.getIdentity().toString());
			activeUser.setStatus(teacher.getTscore().toString());
			activeUser.setSimage(teacher.getTimage());
			//根据用户的identity查询菜单
			List<Function> menus = null;
			try {
				menus = userServiceImpl.findMenusByIdentity(teacher.getIdentity());
			} catch (Exception e) {
				e.printStackTrace();
			}			
			activeUser.setMenus(menus);
		}else if(usercode.length() == 12){//管理员登录
			Administrator administrator = null;
			try {
				administrator = userAccountServiceImpl.selectManagerAccount(usercode);
			} catch (Exception e) {				
				e.printStackTrace();
			}
			if(administrator == null) return null;
			password = administrator.getApwd();
			salt = administrator.getAimage();
			activeUser.setIdentity(administrator.getIdentity().toString());//身份
			activeUser.setUsername(administrator.getAname());
			activeUser.setUserid(administrator.getAid());				
			activeUser.setUsercode(administrator.getAcollage());				
		}
							
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser, password,
			ByteSource.Util.bytes(salt),this.getName());		
		return simpleAuthenticationInfo;
	}

}
