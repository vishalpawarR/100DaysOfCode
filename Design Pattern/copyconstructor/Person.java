package com.jspiders.designpattern.copyconstructor;

public class Person {
	int id;
	String name;
	Address address;

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person(Person person) {
		this(person.id, person.name, new Address(person.address));
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
