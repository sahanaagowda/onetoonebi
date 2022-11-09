package com.ty.onetoonebi_2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi_2.dto.AdharCard;
import com.ty.onetoonebi_2.dto.Person;

public class PersonDao {
	public void savePerson(Person person) {
		EntityManagerFactory entiEntityManagerFactory=Persistence.createEntityManagerFactory("car");
		EntityManager entityManager=entiEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		AdharCard adharCard=person.getCard();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(adharCard);
		entityTransaction.commit();
	}
public Person findPerson(int id) {
	EntityManagerFactory entiEntityManagerFactory=Persistence.createEntityManagerFactory("car");
	EntityManager entityManager=entiEntityManagerFactory.createEntityManager();
	Person person=entityManager.find(Person.class, id);
	return person;
}
}
