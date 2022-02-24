package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepInjHwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DepInjHwApplication.class, args);
		Bus b1 = context.getBean(Bus.class);
		Subway s1 = context.getBean(Subway.class);
		MTA t1 = context.getBean(MTA.class);
		t1.setFare(2.75);
		t1.setNetwork("MTA");
		s1.setBorough("Queens");
		s1.setSline('F');
		s1.setSeating(200);
		s1.setTransfer(true);
		s1.setAboveGround(false);
		b1.setBusLine("Q30");
		b1.setExpress(false);
		b1.setInterborough(false);
		b1.setSeating(48);
		
	}

}
