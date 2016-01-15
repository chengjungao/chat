package com.chengjungao.chat.security.service;

import java.util.List;
import java.util.Map;

import com.chengjungao.chat.security.entity.resource;






public interface ResourceService {  	
	
	public List<resource> queryList(resource model,int page,int pagesize);
	
	public List<resource> queryListbyuser(Map<String, String> map);
}  
