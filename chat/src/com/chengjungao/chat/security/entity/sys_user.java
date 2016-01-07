
package com.chengjungao.chat.security.entity;

import com.chengjungao.chat.base.baseEntity;



/**
 * 
 */
public class sys_user extends baseEntity{
	
	private String id;
	/** 用户id */
	private String userid;
	/** 密码 */
	private String password;
	/** 用户名 */
	private String username;
	/** 用户类别 */
	private String category;
	/** 用户部门 */
	private String dept;
	/** 角色id */
	private String roleid;
	/** 锁定 0-锁定 1-未锁定 */
	private String lock_flag;
	/** 备注 */
	private String remark;
	
	
	/**
	 * @return the userid
	 */
	
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the username
	 */
	
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the category
	 */
	
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the dept
	 */
	
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the roleid
	 */
	
	public String getRoleid() {
		return roleid;
	}
	/**
	 * @param roleid the roleid to set
	 */
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	/**
	 * @return the lock
	 */
	
	public String getLock_flag() {
		return lock_flag;
	}
	/**
	 * @param lock the lock to set
	 */
	public void setLock_flag(String lock_flag) {
		this.lock_flag = lock_flag;
	}
	/**
	 * @return the remark
	 */
	
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

	

	
}
