package com.ty.onetoonebi_2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
public class AdharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String adharnum;
	
	@OneToOne
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharnum() {
		return adharnum;
	}
	public void setAdharnum(String adharnum) {
		this.adharnum = adharnum;
	}
	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", name=" + name + ", adharnum=" + adharnum + ", person=" + person + "]";
	}
	
	

}
