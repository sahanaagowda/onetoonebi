package com.ty.onetoonebi_2.controller;

import com.ty.onetoonebi_2.dao.AdharCardDao;
import com.ty.onetoonebi_2.dto.AdharCard;

public class AdharCardMain {

	public static void main(String[] args) {
 AdharCardDao dao=new AdharCardDao();
 AdharCard adharCard=dao.findAdharCard(1);
 System.out.println(adharCard);
		 }

}
