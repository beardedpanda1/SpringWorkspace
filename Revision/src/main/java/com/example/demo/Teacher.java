/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author siddi
 *
 */
@Component
public class Teacher {

	//Properties
	
	private int tage;
	private String tname;
	private char tgender;
	private String subject;
	private boolean substitute;
	
	
	/**
	 * 
	 */
	//brings in School class to this class
	@Autowired
	private School school;
	
	


	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public void schoolinfo() {
		school.display();
	}
	
	public int getTage() {
		return tage;
	}


	public void setTage(int tage) {
		this.tage = tage;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public char getTgender() {
		return tgender;
	}


	public void setTgender(char tgender) {
		this.tgender = tgender;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public boolean isSubstitute() {
		return substitute;
	}


	public void setSubstitute(boolean substitute) {
		this.substitute = substitute;
	}
	
	public School getSchool() {
		return school;
	}

	@Autowired
	public void setSchool(School school) {
		this.school = school;
	}
	
	
	
}
