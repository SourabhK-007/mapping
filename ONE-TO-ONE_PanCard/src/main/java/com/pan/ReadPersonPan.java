package com.pan;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadPersonPan {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("exam");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	
	//fetch person based on panNo.
	// use subquery
	Query query=entityManager.createQuery("select p from Person p where p.id=(select a.id from Pan a where a.panNo=?1)");
	query.setParameter(1, "xyz456");
	List<Person> per1 =query.getResultList();
	for (Person person : per1) {
		
		System.out.println(person.getName());
	}
	
	
	
	
	
	
}
}
