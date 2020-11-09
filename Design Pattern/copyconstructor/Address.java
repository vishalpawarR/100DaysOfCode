package com.jspiders.designpattern.copyconstructor;

public class Address {
	String state;
	String city;
	int pincode;

	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Address(Address address) {
		this(address.state, address.city, address.pincode);
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
