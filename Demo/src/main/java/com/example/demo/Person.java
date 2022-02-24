package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Person {
	private String Name;
	private String Sport;
	private int Number;
	private boolean isAvtive;
	
	@Autowired
	private Address addr;
	
	public Player(String name, String sport, int number, boolean isActive) {
		super();
		Name = name;
		Sport = sport;
		Number = number;
		this.isActive = isActive;
	}
	
	@Autowired
	public void setAddr(Address addr) {
		
	}
}
