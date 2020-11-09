package com.jspiders.designpattern.copyconstructor;

public class Mainclass {
	public static void main(String[] args) {
		Address address = new Address("karnataka", "Bengaluru", 560019);
		Person person = new Person(101, "king", address);
		Person person2 = new Person(person);
		person2.name = "queen";
		person2.address.pincode = 50018;
		System.out.println(person);
		System.out.println(person2);
	}
}