package com.jsp.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetMobile {
	public static void main(String[]args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rutuja");
		   EntityManager entityManager= entityManagerFactory.createEntityManager();
		   EntityTransaction entityTransaction=entityManager.getTransaction();
		   
		   Mobile mobile=entityManager.find(Mobile.class,5);
		   mobile.setName("Iphone 14 pro max");
		   
		   if(mobile != null) {
		   entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
		System.out.println("Value Updated");
		   } else {
			System.out.println("Value not Updated");
		}
		}
	}




