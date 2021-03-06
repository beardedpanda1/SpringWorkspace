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
public class Subway {
	private char sline;
	private boolean aboveGround;
	private String borough;
	private boolean transfer;
	private int seating;
	/**
	 * 
	 */
	@Autowired
	private MTA mta;
	public Subway() {
		// TODO Auto-generated constructor stub
	}
	public char getSline() {
		return sline;
	}
	public void setSline(char sline) {
		this.sline = sline;
	}
	public boolean isAboveGround() {
		return aboveGround;
	}
	public void setAboveGround(boolean aboveGround) {
		this.aboveGround = aboveGround;
	}
	public String getBorough() {
		return borough;
	}
	public void setBorough(String borough) {
		this.borough = borough;
	}
	public boolean isTransfer() {
		return transfer;
	}
	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
	public int getSeating() {
		return seating;
	}
	public void setSeating(int seating) {
		this.seating = seating;
	}
	public MTA getMta() {
		return mta;
	}
	@Autowired
	public void setMta(MTA mta) {
		this.mta = mta;
	}
	
}
