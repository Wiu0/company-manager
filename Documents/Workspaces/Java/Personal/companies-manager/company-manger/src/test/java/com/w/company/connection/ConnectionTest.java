package com.w.company.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionTest {

	static EntityManagerFactory emf;
	static EntityManager em;
	
	public static void init() {
		System.out.println("Init");
		emf = Persistence.createEntityManagerFactory("COMPANY");
		em = emf.createEntityManager();
	}
	
	public static void closeAll() {
		em.close();
		emf.close();
		System.out.println("Close");
	}
	
	
	public static void main(String[] args) {
		init();
		closeAll();
	}
	
}
