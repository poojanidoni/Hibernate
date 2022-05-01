package com.xworkz.tv.runner;

import com.xworkz.tv.Dao.TvChannelDAO;
import com.xworkz.tv.Dao.TvChannelDAOImp;
//import com.xworkz.tv.Dao.TvChannelDAOImpl;
import com.xworkz.tv.entity.TvChannel;

public class MainClass {
	
//	
//	public static void main(String[] args) {
//		TvChannel channelEntity=new TvChannel();
//		channelEntity.setChannelId(1);
//		channelEntity.setChannel_name("Time now");
//		channelEntity.setIsfree(false);
//		channelEntity.setLanguage("English");
//		channelEntity.setPrice(129.99);
//		
//		TvChannelDAO dao=new TvChannelDAOImpl();
//		dao.saveChannel(channelEntity);
//		System.out.println("success");
//		
	//package com.xworkz.tv.entity;

	public static class TvTester {
		public static void main(String[] args) {
			TvChannel entity = new TvChannel();
			TvChannelDAOImp daoImp = new TvChannelDAOImp();
			entity.setChannelId(1);
			entity.setChannel_name("Time now");
			entity.setPrice(2000.3);
			daoImp.save(entity);
			System.out.println("data saved successfully");
			entity.getChannelId();
			System.out.println(daoImp.getbyId(1));
			daoImp.upadate(1990, 1);
			System.out.println("upadted........successfully");
			daoImp.deleteById(1);
		}

	}

		
	}



