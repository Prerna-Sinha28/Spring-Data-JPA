package com.example.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
@Entity
public class Product {
	@Id
	@Column(name="pid")
	private Integer proId;
	@Column(name="pcode")
	private String prodCode;
	
	@ElementCollection
	@CollectionTable(
			name="product_colors",
			joinColumns=@JoinColumn(name="pidfk")
			)
	@OrderColumn(name="pos")
	@Column(name="data")
	private List<String>colors;
	
	@ElementCollection
	@CollectionTable(
			name="product_models",
			joinColumns=@JoinColumn(name="pidfk")
			
			)
	private Set<String>models;

	@ElementCollection
	@CollectionTable(
			name="product_details",// table name
			joinColumns=@JoinColumn(name="pidfk")
			)
	@MapKeyColumn(name="code")//index
	@Column(name="details")
	private Map<String, String>details;

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}
	
}
