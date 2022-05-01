package com.xworkz.runner;

import java.sql.Date;

import com.xworkz.Dao.ClotheDAOImp;
import com.xworkz.entity.ClotheEntity;

public class ClotheTester {

	public ClotheTester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
			Date date=new Date(0);
			ClotheEntity clotheEntity = new ClotheEntity();
			ClotheDAOImp clotheDAOImp = new ClotheDAOImp();
			clotheEntity.setClotheId(1);
			clotheEntity.setBrand("livies");
			clotheEntity.setPrice(3);
			//clotheEntity.setManifacturedYear(localeString);
			clotheDAOImp.saveData(clotheEntity);
			System.out.println("data saved");
			System.out.println("----------------------------------");
			System.out.println(clotheDAOImp.getByClotheId(1));
			System.out.println("..........................");
			clotheDAOImp.upadteBrandByPrice("nam brand", 0);
			System.out.println("<><><><><><><><><><><><><><><><><><><><<>");
			clotheEntity.getClotheId();
			clotheDAOImp.deleteById(1);
		}

	}


