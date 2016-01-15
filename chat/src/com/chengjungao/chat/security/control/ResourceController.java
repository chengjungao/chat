package com.chengjungao.chat.security.control;



import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chengjungao.chat.security.entity.resource;
import com.chengjungao.chat.security.entity.sys_user;
import com.chengjungao.chat.security.service.ResourceService;
import com.github.pagehelper.PageInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resource")
public class ResourceController {
	final int pagesize=10;
	@Resource(name="resourceServiceImpl")
	private ResourceService resourceService;
	
	public ResourceService getResourceService() {
		return resourceService;
	}

	public void setUserService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}	
	
	@RequestMapping(value="/query.do",method= RequestMethod.POST)
	@ResponseBody
	public String list(resource bean,HttpServletRequest request,HttpServletResponse response,Model model){
		String pageString=request.getParameter("pagenum");
		int pagenum=Integer.parseInt(pageString);
		List<resource> list=resourceService.queryList(bean, pagenum, pagesize);
		PageInfo page = new PageInfo(list);
		JSONObject  json=new JSONObject();
		try {
			json.put("msg", "success");
	     } catch (Exception e) {
		  e.printStackTrace();
		  json.put("msg", "false");
	  }
        return json.toString();
	}
	@RequestMapping(value="/listuser.do",method= RequestMethod.POST)
	@ResponseBody
	public String list_user(resource bean,HttpServletRequest request,HttpServletResponse response,Model model){
		sys_user user=(sys_user)request.getSession().getAttribute("user");
		Map<String,String> map=new HashMap<String, String>();
		map.put("roleid", user.getRoleid());
		List<resource> list=resourceService.queryListbyuser(map);
		JSONObject  json=new JSONObject();
		try {
			JSONArray  jsons=new JSONArray();
		   for (int i = 0; i < list.size(); i++) {
			   jsons.add(JSONObject.fromObject(list.get(i)));
		      }
		    json.put("list", jsons);
			json.put("msg", "success");
	     } catch (Exception e) {
		  e.printStackTrace();
		  json.put("msg", "false");
	  }
        return json.toString();
	}
	@RequestMapping(value="/main.do",method= RequestMethod.POST)
	public String main(HttpServletRequest request,Model model){
	   return "resource/main";
	}
}
