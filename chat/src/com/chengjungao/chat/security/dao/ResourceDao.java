package com.chengjungao.chat.security.dao;

import java.util.List;
import java.util.Map;

import com.chengjungao.chat.base.baseDao;
import com.chengjungao.chat.security.entity.resource;
import com.chengjungao.chat.security.entity.sys_user;




/**
 * SysUser Mapper
 * @author Administrator
 *
 */
public interface ResourceDao{
	
	/**
	 * 查询资源list
	 * @return
	 */
	public List<resource> querylist(resource model);
	
	public  List<resource> querylistbyuser(Map<String, String> map);
	
}
