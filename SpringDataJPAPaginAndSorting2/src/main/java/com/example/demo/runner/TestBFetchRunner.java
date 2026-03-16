package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
//import org.springframework.data.domain.Sort.Order;

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
		//case 1
	Iterable<Employee>list2=erepo1.findAll(Sort.by(Direction.ASC, "empSal"));
		list2.forEach(System.out::println);
//		
//		//case2-->column desc order
		Iterable<Employee>list3=erepo1.findAll(Sort.by(Direction.DESC, "empSal"));
		list3.forEach(System.out::println);
		
		//case3--> n column same order
		Iterable<Employee>list4=erepo1.findAll(
				Sort.by(Direction.DESC, "empSal","empDept")
				);
		list4.forEach(System.out::println);
		
		Iterable<Employee> list5 =
		        erepo1.findAll(Sort.by(
		                Sort.Order.asc("empSal"),
		                Sort.Order.desc("empDept")
		        ));

		list5.forEach(System.out::println);
		list5.forEach(System.out::println);
	}

}
