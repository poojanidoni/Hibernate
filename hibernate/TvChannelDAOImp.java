package com.xworkz.tv.Dao;

import com.xworkz.tv.entity.TvChannel;

//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;

//public  class TvChannelDAOImpl implements TvChannelDAO {
//	
//	private EntityMAnagerFactory = persistance
//	
//	public void saveChannel(TvChannel tvchannel) {
//		EntityManagerFactory factory = null;
//		EntityManager entityManager = null;
//		EntityTransaction tx = null;
//		try {
//			factory = Persistence.createEntityManagerFactory("tv");
//			entityManager = factory.createEntityManager();
//			tx = entityManager.getTransaction();
//			tx.begin();
//			entityManager.persist(tvchannel);
//			tx.commit();
//		} catch (Exception e) {
//				    tx.rollback();
//				    e.printStackTrace();
//			   }
//		
//		finally {
//			if (factory != null) {
//				factory.close();
//			}
//			if (entityManager != null) {
//				entityManager.clear();
//			}
//
//		}
//
//	}
//
//	public TvChannel getChannelYId(Integer channelId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void updateChannelById() {
//		// TODO Auto-generated method stub
//		
//	}
	
	//package com.xworkz.tv.entity;

	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;
	import jakarta.transaction.Transaction;

	public class TvChannelDAOImp implements TvChannelDAO {

		private EntityManagerFactory factory = Persistence.createEntityManagerFactory("tv");

		public void save1(TvChannel channelEntity) {
			EntityManager manager = null;
			EntityTransaction transaction = null;
			try {

				manager = factory.createEntityManager();
				transaction = manager.getTransaction();
				transaction.begin();
				manager.persist(channelEntity);
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}
		}

		//@Override
		public TvChannel getbyId1(Integer channelId) {

			EntityManager manager = null;
			TvChannel entity = null;
			try {

				manager = factory.createEntityManager();
				entity = manager.find(TvChannel.class, channelId);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}
			return entity;
		}

		public void upadate(Integer price, Integer channelId) {
			System.out.println("upadted method is started...........");
			EntityManager manager = null;
			EntityTransaction transaction = null;
			TvChannel channelEntity = null;
			try {
				System.out.println("try block is executing........");
				manager = factory.createEntityManager();
				channelEntity = manager.find(TvChannel.class, channelId);
				if (channelEntity != null) {
					transaction = manager.getTransaction();
					transaction.begin();
					channelEntity.setPrice(price);
					manager.merge(channelEntity);
					transaction.commit();
					System.out.println("upadated....successfully");
				}
			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();

				}
			}

		}

		public void deleteById(Integer ChannelId) {
			System.out.println("deleteById........is started");
			EntityManager manager = null;
			//EntityTransaction transaction = null;
			TvChannel channelEntity = null;
			try {
				System.out.println("try block is executing........");
				manager = factory.createEntityManager();
				channelEntity = manager.find(TvChannel.class, ChannelId);
				
				if (channelEntity != null) {
					//transaction = manager.getTransaction();
					//transaction.begin();
					channelEntity=manager.find(TvChannel.class, channelEntity);
					manager.remove(channelEntity);
					//.commit();
					System.out.println("deleted..........successfully");
				}
			}catch (Exception e) {
				//transaction.rollback();
				e.printStackTrace();
			}finally {
				if (manager != null) {
					manager.close();
				}
			}

		}

		public void save(TvChannel channelEntity) {
			// TODO Auto-generated method stub
			
		}

		public TvChannel getbyId(Integer channelId) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	
	
	
	
	