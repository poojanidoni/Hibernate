package com.xworkz.RestarunantDAO;

import java.lang.module.Configuration;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.xworkz.entity.RestarunantEntity;

import jakarta.transaction.Transaction;

public class RestarunantDAO {
	public void saveRestarunant(RestarunantEntity entity) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sessionFactory = cfg.buidsessionEactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		 session).persist(entity);
		tx.commit();
	}
}