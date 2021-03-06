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
public class Student {
	//Properties
	private String stuname;
	private int stuage;
	private int stuid;
	private double score;
	@Autowired //use autowired to "link" parent to child
	private School school;
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public School getSchool() {
		return school;
	}
	@Autowired //use autowired around setters too
	public void setSchool(School school) {
		this.school = school;
	}
	
}
