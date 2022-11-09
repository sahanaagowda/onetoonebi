package com.ty.onetoonebi_2.controller;

import com.ty.onetoonebi_2.dao.PersonDao;
import com.ty.onetoonebi_2.dto.AdharCard;
import com.ty.onetoonebi_2.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
//		Person person=new Person();
//		person.setName("ajith");
//		person.setGender("male");
//		person.setAddress("begur");
//		person.setAge(65);
//
//		AdharCard adharCard=new AdharCard();
//		adharCard.setName("abay");
//		adharCard.setAdharnum("ABC456VHG");
//		person.setCard(adharCard);
//		adharCard.setPerson(person);
//
//		PersonDao dao=new PersonDao();
//		dao.savePerson(person);
//		

		PersonDao dao1=new PersonDao();
	Person person=dao1.findPerson(1);
	System.out.println(person);
		

	}

}
