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
public class Bus {
	private String busLine;
	private boolean express;
	private int seating;
	private boolean interborough;
	/**
	 * 
	 */
	@Autowired
	private MTA mta;
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public String getBusLine() {
		return busLine;
	}
	public void setBusLine(String busLine) {
		this.busLine = busLine;
	}
	public boolean isExpress() {
		return express;
	}
	public void setExpress(boolean express) {
		this.express = express;
	}
	public int getSeating() {
		return seating;
	}
	public void setSeating(int seating) {
		this.seating = seating;
	}
	public boolean isInterborough() {
		return interborough;
	}
	public void setInterborough(boolean interborough) {
		this.interborough = interborough;
	}
	public MTA getMta() {
		return mta;
	}
	@Autowired
	public void setMta(MTA mta) {
		this.mta = mta;
	}
	
}
