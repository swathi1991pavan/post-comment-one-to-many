package com.cglia.postcommentmappings.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")  
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int pid;
    private String productName;
    private int quantity;
    private int price;
    
    public Product() { }
	
    public Product(int pid, String productName, int qty, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return quantity;
	}
	public void setQty(int qty) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}