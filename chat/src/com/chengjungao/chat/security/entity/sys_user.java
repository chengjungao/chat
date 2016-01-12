
package com.chengjungao.chat.security.entity;

import java.sql.Date;

import com.chengjungao.chat.base.baseEntity;



/**
 * 
 */
public class sys_user extends baseEntity{
	
	/**  */
	private String id;
	/** 用户名 */
	private String userid;
	/** 用户名称 */
	private String username;
	/** 密码 */
	private String password;
	/** 用户类型 */
	private String category;
	/** 部门 */
	private String deptid;
	/** 角色 */
	private String roleid;
	/** 备注 */
	private String remark;
	/** 创建日期 */
	private Date createdata;
	/**  */
	private String lock_flag;
	

	/**
	 * @return the id
	 */
	
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
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
	 * @return the password
	 */
	
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the deptid
	 */
	
	public String getDeptid() {
		return deptid;
	}
	/**
	 * @param deptid the deptid to set
	 */
	public void setDeptid(String deptid) {
		this.deptid = deptid;
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
	/**
	 * @return the createdata
	 */
	
	public Date getCreatedata() {
		return createdata;
	}
	/**
	 * @param createdata the createdata to set
	 */
	public void setCreatedata(Date createdata) {
		this.createdata = createdata;
	}
	/**
	 * @return the lock_flag
	 */
	
	public String getLock_flag() {
		return lock_flag;
	}
	/**
	 * @param lock_flag the lock_flag to set
	 */
	public void setLock_flag(String lock_flag) {
		this.lock_flag = lock_flag;
	}
	
	
	

	
}
