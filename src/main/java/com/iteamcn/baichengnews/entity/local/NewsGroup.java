package com.iteamcn.baichengnews.entity.local;

import java.util.List;

import com.iteamcn.baichengnews.entity.News;

public class NewsGroup {
	private List<News> textNews;
	private List<News> imgNews;
	public List<News> getTextNews() {
		return textNews;
	}
	public void setTextNews(List<News> textNews) {
		this.textNews = textNews;
	}
	public List<News> getImgNews() {
		return imgNews;
	}
	public void setImgNews(List<News> imgNews) {
		this.imgNews = imgNews;
	}
	public NewsGroup(List<News> textNews, List<News> imgNews) {
		super();
		this.textNews = textNews;
		this.imgNews = imgNews;
	}
	
}
