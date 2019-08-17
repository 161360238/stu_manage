package com.pdsu.stuManage.bean;

import java.util.List;
/**
 * 用户身份信息，存入session
 * @author zhangchi
 * 
 */
public class ActiveUser implements java.io.Serializable {
	
	private String userid;//用户id（主键）老师或学生的ID
	private String usercode;// 用户账号     登录账号
	private String username;// 用户名称   真实名字
	private String identity;//身份标识 1学生 2老师
	private String status;// 状态 1已注册 2已认证
	private String simage;//头像
	
	public String getSimage() {
		return simage;
	}
	public void setSimage(String simage) {
		this.simage = simage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	private List<Function> menus;// 菜单
	private List<Function> permissions;// 权限
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Function> getMenus() {
		return menus;
	}
	public void setMenus(List<Function> menus) {
		this.menus = menus;
	}
	public List<Function> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Function> permissions) {
		this.permissions = permissions;
	}
	
	
}
