package com.chengjungao.chat.security.dao;

import com.chengjungao.chat.base.baseDao;
import com.chengjungao.chat.security.entity.sys_user;




/**
 * SysUser Mapper
 * @author Administrator
 *
 */
public interface SysUserDao<T> extends baseDao<T> {
	
	/**
	 * 检查登录
	 * @return
	 */
	public T queryLogin(sys_user model);
	
	public  int add(sys_user model);
	
}
