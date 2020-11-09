package com.jspiders.designpattern.prototype;

public class Mainclass {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("karnataka", "Bengaluru", 560019);
		Person person = new Person(101, "adi", address);
		Person person2 = (Person) person.clone();
		person2.name = "aditya";
		person2.address.pincode = 560018;
		System.out.println(person);
		System.out.println(person2);
	}
}
