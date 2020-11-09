package com.jspiders.designpattern.prototype;

public class Person implements Cloneable{
	int id;
	String name;
	Address address;

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Person(id, name, (Address) address.clone());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
