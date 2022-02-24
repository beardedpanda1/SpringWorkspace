/**
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
@Scope(value="prototype")
public class MTA {
	private double fare;
	private String network;
	/**
	 * 
	 */
	public MTA() {
		// TODO Auto-generated constructor stub
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	
	public void display() {
		System.out.println("fare: " + fare + ", network: " + network + "");
	}
	
}
