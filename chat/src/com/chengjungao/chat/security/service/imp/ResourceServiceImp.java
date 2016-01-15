package com.chengjungao.chat.security.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chengjungao.chat.security.dao.ResourceDao;
import com.chengjungao.chat.security.entity.resource;
import com.chengjungao.chat.security.service.ResourceService;
import com.github.pagehelper.PageHelper;


@Service("resourceServiceImp")
public class ResourceServiceImp implements ResourceService{
	@Autowired
    private ResourceDao dao; 
	public List<resource> queryList(resource model,int page,int pagesize){
		PageHelper.startPage(page, pagesize);
		List<resource> list=dao.querylist(model);
		return list;
	}
	
	
	public List<resource> queryListbyuser(Map<String, String> map){
		List<resource> list=dao.querylistbyuser(map);
		return list;
	}
}
