package com.pan;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonsPan {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("exam");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Person p1=new Person();
	p1.setAge(23);
	p1.setGender('m');
	p1.setName("Alpha");
	p1.setPh(8888899999l);
	
	
	Pan s1=new Pan();
	s1.setCountry("ind");
	s1.setPanNo("xyz123");
	s1.setState("Karnataka");
	
	Person p2=new Person();
	p2.setAge(42);
	p2.setGender('m');
	p2.setName("Beta");
	p2.setPh(8888899998l);
	
	
	Pan s2=new Pan();
	s2.setCountry("ind");
	s2.setPanNo("xyz456");
	s2.setState("Maharashtra");
	
	p1.setPan(s1);
	p2.setPan(s2);
	
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(p1);
	entityManager.persist(p2);
	entityTransaction.commit();
}
}
