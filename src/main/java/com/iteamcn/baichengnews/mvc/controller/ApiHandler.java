package com.iteamcn.baichengnews.mvc.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.iteamcn.baichengnews.entity.Channel;
import com.iteamcn.baichengnews.entity.News;
import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.entity.local.LoginMessage;
import com.iteamcn.baichengnews.entity.local.Message;
import com.iteamcn.baichengnews.entity.local.NewsGroup;
import com.iteamcn.baichengnews.entity.local.RegisterMessage;
import com.iteamcn.baichengnews.service.ChannelService;
import com.iteamcn.baichengnews.service.NewsService;
import com.iteamcn.baichengnews.service.UserService;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PageInfo;

@Controller
@CrossOrigin(origins= {"http://localhost","http://localhost:63342"})
@RequestMapping(value="/api")
public class ApiHandler {
	@Resource
	private UserService user;
	@Resource
	private NewsService news;
	@Resource
	private ChannelService channel;
	
	@ResponseBody
	@RequestMapping(value="/user/detail",method=RequestMethod.POST)
	public JSONObject userDetail(@RequestBody JSONObject json) {
//		JSONObject json=JSON.parseObject(str);
		int userId=json.getIntValue("userId");
		Message msg=new Message();
		try {
			msg.setObject(user.userAdvDetailByID(userId));
			msg.setCode(Message.SUCCESS);
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			msg.setCode(Message.ERROR_AUTHORIZATION);
			msg.setInfo(Message.ERROR_AUTHORIZATION_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/index/hot",method=RequestMethod.POST)
	public JSONObject hotNews() {
		Message msg=new Message();
		NewsGroup newsg=news.selectIndexHotNews();
		msg.setCode(Message.SUCCESS);
		msg.setObject(newsg);
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/index/channelNews",method=RequestMethod.POST)
	public JSONObject channelNews(@RequestBody JSONObject json) {
		int channelId=0;
		Message msg=new Message();
		try {
			if(!json.containsKey("channelId")) throw new JSONException();
			channelId=json.getIntValue("channelId");
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		}catch(Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		NewsGroup newsg=news.selectIndexChannelNews(channelId);
		msg.setCode(Message.SUCCESS);
		msg.setObject(newsg);
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/channel/list",method=RequestMethod.POST)
	public JSONObject listChannel() {
		Message msg=new Message();
		List<Channel> list=channel.selectAllChannel();
		msg.setCode(Message.SUCCESS);
		msg.setObject(list);
		return (JSONObject) JSON.toJSON(msg);
	}
	
	@ResponseBody
	@RequestMapping(value="/news/detail",method=RequestMethod.POST)
	public JSONObject newsDetail(@RequestBody JSONObject json) {
		int newsId=0;
		Message msg=new Message();
		try {
			if(!json.containsKey("newsId")) throw new JSONException();
			newsId=json.getIntValue("newsId");
			msg.setObject(news.selectNewsById(newsId));
			msg.setCode(Message.SUCCESS);
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		}catch(Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/news/list",method=RequestMethod.POST)
	public JSONObject newsList(@RequestBody JSONObject json) {
		List<News> list=null;
		Message msg=new Message();
		try {
			if(!json.containsKey("page")) throw new JSONException();
			int page=json.getIntValue("page");
			PageInfo pageInfo=PageInfo.getPageInfo(10, page);
			if(json.containsKey("channelId")) {
				int channelId=json.getIntValue("channelId");
				try {
					list=news.selectAdvNewsByChannel(pageInfo, channelId);
				}catch(NoPrivilegeException e) {
					list=news.selectBaseNewsByChannel(pageInfo, channelId);
				}
				
			}else {
				try {
					list=news.listAdvNewsFromAllChannel(pageInfo);
				}catch(NoPrivilegeException e) {
					list=news.listBaseNewsFromAllChannel(pageInfo);
				}
			}
			JSONObject jo=new JSONObject();
			jo.put("page", pageInfo);
			jo.put("list", list);
			msg.setObject(jo);
			msg.setCode(Message.SUCCESS);
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		}catch(Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/news/add",method=RequestMethod.POST)
	public JSONObject newsAdd(@RequestBody JSONObject json,HttpServletRequest request) {
		News newsO=JSONObject.toJavaObject(json, News.class);
		Message msg=new Message();
		try {
			User u=(User)request.getSession().getAttribute("user");
			if(u==null) throw new NoPrivilegeException();
			newsO.setN_id(null);
			newsO.setN_author(u.getU_id());
			newsO.setN_date(new Date());
			boolean b=news.insertNews(newsO);
			if(b) {
				msg.setInfo("添加成功");
			}else {
				msg.setInfo("添加失败");
			}
			msg.setCode(Message.SUCCESS);
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			msg.setCode(Message.ERROR_AUTHORIZATION);
			msg.setInfo(Message.ERROR_AUTHORIZATION_INFO);
		}catch(DataIntegrityViolationException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
//		try {
//			newsId=json.getIntValue("newsId");
//			msg.setObject(news.selectNewsById(newsId));
//			msg.setCode(Message.SUCCESS);
//		}catch(JSONException e) {
//			msg.setCode(Message.ERROR_ARGUMENTS);
//			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
//		}catch(Exception e) {
//			msg.setCode(Message.ERROR);
//			msg.setInfo(Message.ERROR_INFO);
//		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/news/edit",method=RequestMethod.POST)
	public JSONObject newsEdit(@RequestBody JSONObject json) {
		News newsO=JSONObject.toJavaObject(json, News.class);
		Message msg=new Message();
		try {
			boolean b=news.editNews(newsO);
			if(b) {
				msg.setInfo("修改成功");
			}else {
				msg.setInfo("修改失败");
			}
			msg.setCode(Message.SUCCESS);
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			msg.setCode(Message.ERROR_AUTHORIZATION);
			msg.setInfo(Message.ERROR_AUTHORIZATION_INFO);
		}catch(DataIntegrityViolationException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/news/delete",method=RequestMethod.POST)
	public JSONObject newsDelete(@RequestBody JSONObject json) {
		Message msg=new Message();
		try {
			if(!json.containsKey("newsId")) throw new JSONException();
			int newsId=json.getIntValue("newsId");
			boolean b=news.deleteNews(newsId);
			if(b) {
				msg.setInfo("删除成功");
			}else {
				msg.setInfo("删除失败");
			}
			msg.setCode(Message.SUCCESS);
		} catch (NoPrivilegeException e) {
			// TODO Auto-generated catch block
			msg.setCode(Message.ERROR_AUTHORIZATION);
			msg.setInfo(Message.ERROR_AUTHORIZATION_INFO);
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public JSONObject userLogin(@RequestBody JSONObject json,HttpServletRequest request) {
//		JSONObject json=JSON.parseObject(str);
		String username=null;
		String password=null;
		Message msg=new Message();
		try {
			if(!json.containsKey("username")&&!json.containsKey("password")) throw new JSONException();
			username=json.getString("username");
			password=json.getString("password");
			User dUser=user.userAdvDetailByNameWithPrivilege(username);
			Message m;
			if(dUser!=null) {
				User u=new User();
				u.setU_name(username);
				u.setU_password(password);
				m=user.userLoginCheck(dUser,u);
				if(m.getCode()==LoginMessage.SUCCESS) {
					request.getSession().setAttribute("user", dUser);
					request.getSession().setAttribute("privilege", dUser.getU_groupObject().getG_privilege());
					dUser.setU_groupObject(null);
				}
			}else {
				m=new Message();
				m.setCode(LoginMessage.USER_NOT_EXIST); 
				m.setInfo(LoginMessage.USER_NOT_EXIST_INFO); 
			}
			msg.setObject(m);
			msg.setCode(Message.SUCCESS);
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public JSONObject userRegister(@RequestBody JSONObject json) {
//		JSONObject json=JSON.parseObject(str);
		String username=null;
		String password=null;
		String nick=null;
		Message msg=new Message();
		Message m=new Message();
		try {
			if(!json.containsKey("username")&&
					!json.containsKey("password")&&
					!json.containsKey("nick")) throw new JSONException();
			username=json.getString("username");
			password=json.getString("password");
			nick=json.getString("nick");
			User dUser=user.userBaseDetailByNameWithPrivilege(username);
			if(dUser==null) {
				User u=new User();
				u.setU_name(username);
				u.setU_password(password);
				u.setU_nick(nick);
				boolean b=user.userRegister(u);
				if(b) {
					m.setCode(RegisterMessage.SUCCESS);
				}
			}else {
				m.setCode(RegisterMessage.USER_NAME_EXIST); 
				m.setInfo(RegisterMessage.USER_NAME_EXIST_INFO); 
			}
			msg.setObject(m);
			msg.setCode(Message.SUCCESS);
		}catch(JSONException e) {
			msg.setCode(Message.ERROR_ARGUMENTS);
			msg.setInfo(Message.ERROR_ARGUMENTS_INFO);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
	@ResponseBody
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public JSONObject userLogout(HttpServletRequest request) {
		request.getSession().invalidate();
		Message m=new Message();
		m.setCode(Message.SUCCESS);
		m.setInfo("注销成功");
		return (JSONObject)JSON.toJSON(m);
	}
	@ResponseBody
	@RequestMapping(value="/loginCheck",method=RequestMethod.POST)
	public JSONObject loginCheck(HttpServletRequest request) {
//		JSONObject json=JSON.parseObject(str);
		User user=null;
		Message msg=new Message();
		try {
			user=(User) request.getSession().getAttribute("user");
			msg.setObject(user);
			msg.setCode(Message.SUCCESS);
		} catch (Exception e) {
			msg.setCode(Message.ERROR);
			msg.setInfo(Message.ERROR_INFO);
			e.printStackTrace();
		}
		return (JSONObject) JSON.toJSON(msg);
	}
}
