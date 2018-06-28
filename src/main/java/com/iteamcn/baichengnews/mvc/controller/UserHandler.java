package com.iteamcn.baichengnews.mvc.controller;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.service.UserService;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PageInfo;
import com.iteamcn.baichengnews.util.PasswordEncrypter;

@Controller
@RequestMapping(value="/user")
public class UserHandler {
	@Resource
	private UserService userService;
	@RequestMapping(value="/detail/{id}",method=RequestMethod.GET)
	public String userDetail(@PathVariable String id,HttpServletRequest request,HttpServletResponse response,Model m) {
		User user=null;
		try {
			id=new String(id.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		System.out.println(id);
		try {
			user = userService.userDetailByName(id);
		}catch(UndeclaredThrowableException e) {
			if(e.getCause() instanceof NoPrivilegeException) {
				response.setStatus(404);
				return "404";
			}else {
				e.printStackTrace();
			}
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user==null) {
//			System.out.println("null");
			response.setStatus(404);
			return "404";
		}
		m.addAttribute("user",user);
		return "user_detail";
	}
	@RequestMapping(value="/list/{page}",method=RequestMethod.GET)
	public String userList(@PathVariable int page,HttpServletRequest request,HttpServletResponse response,Model m) {
		List<User> user=null;
		PageInfo p=PageInfo.getPageInfo(3, page);
		try {
			user = userService.listUser(p);
		}catch(UndeclaredThrowableException e) {
			if(e.getCause() instanceof NoPrivilegeException) {
				response.setStatus(404);
				return "404";
			}else {
				e.printStackTrace();
			}
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user==null) {
			System.out.println("null");
			response.setStatus(404);
			return "404";
		}
		m.addAttribute("list",user);
		m.addAttribute("page",p);
		return "user_list";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String userLogin(HttpServletRequest request,HttpServletResponse response,Model m) {
		return "user_login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String userLoginCheck(HttpServletRequest request,HttpServletResponse response,Model m) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=userService.userAdvDetailByNameWithPrivilege(username);
		if(user==null) {
			m.addAttribute("success",false);
			m.addAttribute("info","登录失败,该用户不存在");
			return "info";
		}
		if(user.getU_password().equals(PasswordEncrypter.userPasswordEncrypt(username, password))) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("privilege", user.getU_groupObject().getG_privilege());
			m.addAttribute("success",true);
			m.addAttribute("info","登录成功");
		}else {
			m.addAttribute("success",false);
			m.addAttribute("info","登录失败,用户名或密码错误");
		}
//		System.out.println("check:"+Hash.MD5(password+username+"BCNEWS"));
//		System.out.println("database:"+user.getU_password());
		return "info";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String userRegister(HttpServletRequest request,HttpServletResponse response,Model m) {
		return "user_register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String userRegisterCheck(HttpServletRequest request,HttpServletResponse response,Model m) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String nick=request.getParameter("nick");
		User user=new User();
		user.setU_group("user");
		user.setU_name(username);
		user.setU_nick(nick);
		user.setU_password(PasswordEncrypter.userPasswordEncrypt(username, password));
		user.setU_reg_date(new Date());
		
		if(userService.userRegister(user)) {
			m.addAttribute("success",true);
			m.addAttribute("info","注册成功");
		}else {
			m.addAttribute("success",false);
			m.addAttribute("info","注册失败,用户名或密码错误");
		}
		return "info";
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String userLogout(HttpServletRequest request,HttpServletResponse response,Model m) {
		request.getSession().invalidate();
		m.addAttribute("info","注销成功");
		return "info";
	}
	
}
