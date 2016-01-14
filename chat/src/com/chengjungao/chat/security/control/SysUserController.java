package com.chengjungao.chat.security.control;



import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chengjungao.chat.security.entity.sys_user;
import com.chengjungao.chat.security.service.SysUserService;
import com.chengjungao.chat.util.MD5Encrypt;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class SysUserController {
	
	@Resource(name="userServiceImpl")
	private SysUserService userService;
	
	public SysUserService getUserService() {
		return userService;
	}

	public void setUserService(SysUserService userService) {
		this.userService = userService;
	}	
	@RequestMapping(value="/login.do",method= RequestMethod.POST)
	public String login(sys_user user,HttpServletRequest request,Model model){
		user.setPassword(MD5Encrypt.encrypt(user.getPassword()));
		user=userService.queryLogin(user);
        model.addAttribute("user", user);
        request.getSession().setAttribute("user", user);
	    return "main";
	}
	@RequestMapping(value="/adduser.do",method= RequestMethod.POST)
	@ResponseBody
	public String adduser(sys_user user,HttpServletRequest request,HttpServletResponse response,Model model){
		user.setPassword(MD5Encrypt.encrypt(user.getPassword()));
		int id=userService.addUser(user);
		JSONObject  json=new JSONObject();
		try {
			json.put("result", id);
			json.put("msg", "success");
	     } catch (Exception e) {
		  e.printStackTrace();
		  json.put("msg", "false");
	  }
//		 try {
//		    	response.getWriter().println(json);
//			 } catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        return json.toString();
	}
	@RequestMapping(value="/logout.do",method= RequestMethod.GET)
	public String logout(HttpServletRequest request,Model model){
		//sys_user user=(sys_user)request.getSession().getAttribute("user");
        request.getSession().removeAttribute("user");
	    return "redirect:/index.jsp";
	}
}
