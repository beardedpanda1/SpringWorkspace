/**This is something thats shared between teacher and student classes
 * 
 */
package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author siddi
 *
 */
@Component
@Scope(value="prototype") //allows multiple beans to show without being overwritten
public class School {

	//Properties
	private String sname;
	private String slocation;
	private int districtnum;
	/**
	 * 
	 */
	public School() {
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSlocation() {
		return slocation;
	}
	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}
	public int getDistrictnum() {
		return districtnum;
	}
	public void setDistrictnum(int districtnum) {
		this.districtnum = districtnum;
	}
	
	public void display() {
		System.out.println( "School Name:" + sname + ", Location:" + slocation + ", District:" + districtnum + "");
	}
	

}
