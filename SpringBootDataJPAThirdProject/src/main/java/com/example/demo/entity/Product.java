package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
@Data 
@NoArgsConstructor
@AllArgsConstructor

@Entity

@Table(name="product_tab")
public class Product {

    @Id
    @Column(name="pid")
    private Integer prodId;

    @Column(name="pname")
    private String proName;

    @Column(name="pcost")
    private Double prodCost;

    public Product() {
    }

    public Product(Integer prodId, String proName, Double prodCost) {
        this.prodId = prodId;
        this.proName = proName;
        this.prodCost = prodCost;
    }
}