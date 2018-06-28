package com.iteamcn.baichengnews.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iteamcn.baichengnews.dao.NewsMapper;
import com.iteamcn.baichengnews.entity.News;
import com.iteamcn.baichengnews.entity.local.NewsGroup;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PageInfo;
import com.iteamcn.baichengnews.util.Privilege;

@Service("newsService")
public class NewsService {
	@Resource
	private NewsMapper dao;
	@Privilege("news_list_adv")
	public List<News> listAdvNewsFromAllChannel(PageInfo page) throws NoPrivilegeException{
		return dao.selectAllListPage(page);
	}
	public List<News> listBaseNewsFromAllChannel(PageInfo page){
		return dao.selectBaseAllListPage(page);
	}
	@Privilege("news_add")
	public boolean insertNews(News news) throws NoPrivilegeException{
		if(dao.insertSelective(news)>0) {
			return true;
		}
		return false;
	}
	@Privilege("news_edit")
	public boolean editNews(News news) throws NoPrivilegeException{
		if(dao.updateByPrimaryKeyWithBLOBs(news)>0) {
			return true;
		}
		return false;
	}
	@Privilege("news_delete")
	public boolean deleteNews(Integer id) throws NoPrivilegeException{
		if(dao.deleteByPrimaryKey(id)>0) {
			return true;
		}
		return false;
	}
	public News selectNewsById(Integer id) {
		return dao.selectByPrimaryKey(id);
	}
	public NewsGroup selectIndexHotNews() {
		List<News> textNews=dao.selectBaseAllWithLimit(8);
		List<News> imgNews=dao.selectBaseAllWithImgLimit(5);
		return new NewsGroup(textNews, imgNews);
	}
	public NewsGroup selectIndexChannelNews(Integer channelId){
		List<News> textNews=dao.selectBaseByChannelWithLimit(channelId,13);
		List<News> imgNews=dao.selectBaseByChannelWithImgLimit(channelId, 4);
		return new NewsGroup(textNews, imgNews);
	}
	public List<News> selectBaseNewsByChannel(PageInfo page,Integer channelId){
		return dao.selectBaseAllByChannelListPage(page, channelId);
	}
	@Privilege("news_list_adv")
	public List<News> selectAdvNewsByChannel(PageInfo page,Integer channelId) throws NoPrivilegeException{
		return dao.selectAllByChannelListPage(page, channelId);
	}
}
