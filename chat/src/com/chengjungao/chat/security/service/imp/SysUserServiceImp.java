package com.chengjungao.chat.security.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chengjungao.chat.security.dao.SysUserDao;
import com.chengjungao.chat.security.entity.sys_user;
import com.chengjungao.chat.security.service.SysUserService;


@Service("userServiceImpl")
public class SysUserServiceImp implements SysUserService{
	@Autowired
    private SysUserDao<sys_user> userDao; 
	public sys_user queryLogin(sys_user sys_user){
		return userDao.queryLogin(sys_user);
		
	}
}
