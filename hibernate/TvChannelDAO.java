package com.xworkz.tv.Dao;

import com.xworkz.tv.entity.TvChannel;

//public interface TvChannelDAO {
//
//	public void saveChannel(TvChannel tvchannel);
//
//	public TvChannel getChannelYId(Integer channelId);
//	public void updateChannelById(double)
//	
//	
//	package com.xworkz.tv.entity;

	public interface TvChannelDAO {
		
		public void save(TvChannel channelEntity);
		public TvChannel getbyId(Integer channelId);
		public void upadate(Integer price,Integer channelId);
		public void deleteById(Integer ChannelId);

	}






