package com.bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Read {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("exam");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Query q=entityManager.createQuery("select b from Branch b where b.ifsc=?1");
	q.setParameter(1, "axis000123");
	Branch bch=(Branch)q.getSingleResult();
	
	Bank bank=bch.getBanks();
	
	
	
	if(bank!=null)
	{bank.setPh(90087698987l);
		entityTransaction.begin();
		entityManager.merge(bank);
		entityTransaction.commit();
	}
	
	else {
		System.out.println("bank not fouynd");
	}
}
}
