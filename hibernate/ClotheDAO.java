package com.xworkz.Dao;

import com.xworkz.entity.ClotheEntity;

public interface ClotheDAO {

		
		public ClotheEntity saveData(ClotheEntity clotheEntity);

		public ClotheEntity getByClotheId(Integer clotheId);
		
		public ClotheEntity upadteBrandByPrice(String brand,Integer price);
		public ClotheEntity deleteById(Integer clotheId);
	}



