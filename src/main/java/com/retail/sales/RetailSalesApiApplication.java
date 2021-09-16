package com.retail.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetailSalesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailSalesApiApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("application started");
	}
}
