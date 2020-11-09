package com.jspiders.designpattern.singleton;

public class Product {
	private static final Product product =  new Product();
	/* static Product product = null; */
	private Product()
	{
		System.out.println("Object Created");
	}
	
	/*
	 * public static Product getInstance() { if(product==null) { product = new
	 * Product(); return product; } return product;
	 * 
	 * }
	 */
	 public static Product getInstance() { return product; }
	 
	}
