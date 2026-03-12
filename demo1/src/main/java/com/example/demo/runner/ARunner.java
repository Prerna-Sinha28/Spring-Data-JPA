package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(101)
public class ARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner A");
		
	}
	

}
