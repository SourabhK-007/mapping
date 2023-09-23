package com.bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savebank {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("exam");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Bank bank1=new Bank();
	bank1.setName("SBI");
	bank1.setPh(9845984555l);
	bank1.setNobranch(2);
	bank1.setWebsite("www.sbi.com");
	
	Bank bank2=new Bank();
	bank2.setName("Axis");
	bank2.setPh(9845984577l);
	bank2.setNobranch(2);
	bank2.setWebsite("www.axis.com");
	
	Branch b1=new Branch();
	b1.setName("Basavngudi");
	b1.setAddress("VasaviRoad");
	b1.setifsc("sbi000123");
	
	
	Branch b2=new Branch();
	b2.setName("Kormangla");
	b2.setAddress("beside Royal Pub");
	b2.setifsc("sbi000456");
	
	
	Branch b3=new Branch();
	b3.setName("Rajajinagar");
	b3.setAddress("opp navarang");
	b3.setifsc("axis000123");
	
	
	Branch b4=new Branch();
	b4.setName("JP nagar");
	b4.setAddress("Beside MetroStation");
	b4.setifsc("axis000456");
	
	
	List<Branch> branchlist1=new ArrayList<Branch>();
	branchlist1.add(b1);
	branchlist1.add(b2);
	
	List<Branch> branchlist2=new ArrayList<Branch>();
	branchlist2.add(b3);
	branchlist2.add(b4);
	
	bank1.setBranches(branchlist1);
	bank2.setBranches(branchlist2);
	
	b1.setBanks(bank1);
	b2.setBanks(bank1);
	b3.setBanks(bank2);
	b4.setBanks(bank2);
	
	entityTransaction.begin();
	entityManager.persist(b1);
	entityManager.persist(b2);
	entityManager.persist(b3);
	entityManager.persist(b4);   
	entityManager.persist(bank1);
	entityManager.persist(bank2);
	entityTransaction.commit();
	
}
}
