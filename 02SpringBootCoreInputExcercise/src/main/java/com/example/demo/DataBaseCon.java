package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DataBaseCon {
	
	//$ indicates reading the data from properties so here we don't need to write property source
	
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db.user}")
	private String user;
	
	@Value("${my.db.pwd}")
	private String password;

	@Override
	public String toString() {
		return "DataBaseCon [driver=" + driver + ", user=" + user + ", password=" + password + "]";
	}
	

}
