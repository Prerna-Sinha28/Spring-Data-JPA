package com.example.demo.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.SpringBootDataJpaFirstProjectApplication;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepository;

@Component
public class TestOprRunner implements CommandLineRunner {

    private final SpringBootDataJpaFirstProjectApplication springBootDataJpaFirstProjectApplication;
@Autowired
private ProductRepository repo;

    TestOprRunner(SpringBootDataJpaFirstProjectApplication springBootDataJpaFirstProjectApplication) {
        this.springBootDataJpaFirstProjectApplication = springBootDataJpaFirstProjectApplication;
    }

@Override
public void run(String... args) throws Exception {
	Product p1=new Product(10,"P1", 100.00);
	Product p2=new Product(11,"P2", 200.00);
	Product p3=new Product(12,"P2", 300.00);
	
	repo.saveAll(Arrays.asList(p1,p2,p3));
    Iterable<Product>data=repo.findAll();
    for(Product pob: data) {
    	System.out.println(pob);
    }
    
    data.forEach(ob->System.out.println(ob));
    
    Optional<Product>opt= repo.findById(11);
    if(opt.isPresent()) {
    	Product p=opt.get();
    	System.out.println(p);
    }else {
    	System.out.println("Data not found");
    }
    
    Iterable<Product>list=repo.findAllById(Arrays.asList(10,23,12,34,45));
    list.forEach(System.out::println);
    

	// TODO Auto-generated method stub
	//System.out.println(repo.getClass().getName());
	}


}
