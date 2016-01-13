package com.chengjungao.chat.security.dao;

import com.chengjungao.chat.base.baseDao;
import com.chengjungao.chat.security.entity.sys_user;




/**
 * SysUser Mapper
 * @author Administrator
 *
 */
public interface SysUserDao{
	
	/**
	 * 检查登录
	 * @return
	 */
	public sys_user queryLogin(sys_user model);
	
	public  int add(sys_user model);
	
}
