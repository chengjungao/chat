package com.chengjungao.chat.security.control;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chengjungao.chat.security.entity.sys_user;
import com.chengjungao.chat.security.service.SysUserService;
import com.chengjungao.chat.util.MD5Encrypt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    //	sys_user user=new sys_user();
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		user.setUsername(username);
//		user.setPassword(password);
		user.setPassword(MD5Encrypt.encrypt(user.getPassword()));
		userService.queryLogin(user);
        model.addAttribute("user", user);
	    return "success";
	}
	@RequestMapping(value="/adduser.do",method= RequestMethod.POST)
	public String adduser(HttpServletRequest request,Model model){
    	sys_user user=new sys_user();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		user.setUsername(username);
		user.setPassword(password);
		userService.queryLogin(user);
        model.addAttribute("user", user);
	    return "success";
	}
}
