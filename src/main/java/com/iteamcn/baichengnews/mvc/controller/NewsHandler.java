package com.iteamcn.baichengnews.mvc.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iteamcn.baichengnews.entity.News;
import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.service.NewsService;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PageInfo;

@Controller
@RequestMapping(value="/news")
public class NewsHandler {
	@Resource
	private NewsService newsService;
	
	@RequestMapping(value="/detail/{id}",method=RequestMethod.GET)
	public String newsDetail(@PathVariable int id,HttpServletRequest request,HttpServletResponse response,Model m) {
		News news = newsService.selectNewsById(id);
//		System.out.println(id);
		if(news==null) {
//			System.out.println("null");
			response.setStatus(404);
			return "404";
		}
		m.addAttribute("news",news);
		return "news_detail";
	}
	
	@RequestMapping(value="/list/{page}",method=RequestMethod.GET)
	public String newsList(@PathVariable int page,HttpServletRequest request,HttpServletResponse response,Model m) {
		PageInfo p=PageInfo.getPageInfo(3, page);
		List<News> news=newsService.listBaseNewsFromAllChannel(p);
		m.addAttribute("list",news);
		m.addAttribute("page",p);
		return "news_list";
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String newsAdd(HttpServletRequest request,HttpServletResponse response,Model m) {
		return "news_add";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String newsAddCheck(@ModelAttribute News news,HttpServletRequest request,HttpServletResponse response,Model m) {
		User user=(User)request.getSession().getAttribute("user");
		if(user==null)return "404";
		news.setN_date(new Date());
		news.setN_author(user.getU_id());
		boolean p=false;
		try {
			p=newsService.insertNews(news);
		}catch(NoPrivilegeException e) {
			response.setStatus(404);
			return "404";
		}
		if(p) {
			m.addAttribute("success",true);
			m.addAttribute("info","发布成功");
		}else {
			m.addAttribute("success",false);
			m.addAttribute("info","发布失败");
		}
		return "info";
	}
}
