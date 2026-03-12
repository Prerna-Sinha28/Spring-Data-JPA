package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Component
public class TestOprRunner implements CommandLineRunner {
@Autowired
private StudentRepository repo;

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println(repo.getClass().getName());
	Student sob=new Student();
	sob.setStdId(101);
	sob.setStdName("Prerna");
	sob.setStdFee(50000.00);
	repo.save(sob);
	
}


}
