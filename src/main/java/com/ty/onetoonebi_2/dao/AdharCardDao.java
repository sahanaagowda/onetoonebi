package com.ty.onetoonebi_2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi_2.dto.AdharCard;

public class AdharCardDao {
public AdharCard findAdharCard(int id) {
	EntityManagerFactory entiEntityManagerFactory=Persistence.createEntityManagerFactory("car");
	EntityManager entityManager=entiEntityManagerFactory.createEntityManager();
	
	AdharCard adharCard=entityManager.find(AdharCard.class, id);
			return adharCard;
}
}
