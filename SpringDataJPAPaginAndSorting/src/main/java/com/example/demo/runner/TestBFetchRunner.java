package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
@Order(20)
public class TestBFetchRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository erepo1;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Iterable<Employee>list=erepo1.findAll();
		list.forEach(System.out::println);
	}

}
