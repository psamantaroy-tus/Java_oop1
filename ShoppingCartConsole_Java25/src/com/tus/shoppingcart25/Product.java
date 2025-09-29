package com.tus.shoppingcart25;


public abstract class Product {
	//properties declared private for abstract class
	private String ProductName;
	private int id;
	private double price;
	
	//constructor
	public  Product(String ProductName, int id,double price) {
		this.id=id;
		this.ProductName=ProductName;
		this.price=price;		
	}	
	
	//encapsulation use getter setter to access private properties
	public int getId() {
		return id;
	}
	public String getProductName() {
		return ProductName;
	}
	public double getPrice() {
		return price;
	}
	
	//abstract method to be overridden To String method to get details
	public abstract String getDetails();
	
	
	

}
