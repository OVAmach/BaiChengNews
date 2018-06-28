package com.iteamcn.baichengnews.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iteamcn.baichengnews.dao.ChannelMapper;
import com.iteamcn.baichengnews.entity.Channel;

@Service("channelService")
public class ChannelService {
	@Resource
	private ChannelMapper dao;
	
	public List<Channel> selectAllChannel(){
		return dao.selectAllChannel();
	}
}
