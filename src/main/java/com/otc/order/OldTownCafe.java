package com.otc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OldTownCafe {

	public static void main(String[] args) {
		SpringApplication.run(OldTownCafe.class, args);
		
		System.out.println("Old Town Cafe Application Has Started on Docker");
	}

}
