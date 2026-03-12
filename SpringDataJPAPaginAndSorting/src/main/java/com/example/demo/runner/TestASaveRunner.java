package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
@Order(12)
public class TestASaveRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository erepo;

	@Override
	public void run(String... args) throws Exception {
		
		erepo.saveAll( Arrays.asList(
				new Employee (10,"Prerna" ,100.0,"aa"),
				new Employee (11,"Mini" ,200.0,"bb"),
				new Employee (12,"Arpana" ,300.0,"cc"),
				new Employee (13,"Simmi" ,400.0,"dd"),
				new Employee (14,"Rishabh" ,500.0,"ee")
				
				));
		 
	}
	

}
