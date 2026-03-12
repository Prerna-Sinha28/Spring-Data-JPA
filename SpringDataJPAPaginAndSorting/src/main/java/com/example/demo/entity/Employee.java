package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@Column
	private Integer empId; 
	
	@Column
	private String empName;
	
	@Column
	private Double empSal;
	
	@Column
	private String empDept;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Employee(Integer empId, String empName, Double empSal, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}

	public Employee() {
		super();
	}
	
	

}
