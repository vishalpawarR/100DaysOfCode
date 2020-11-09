package com.jspiders.designpattern.builderpattern;

public class AddressBuilder extends PersonBuilder 
{

	public AddressBuilder(Person person) {
		this.person=person;
	}

	public void stateIn(String state) {
		person.state = state;
	}

	public void cityIn(String city) {
		person.city = city;
	}

	public void pincodeIs(int pincode) {
		person.pincode = pincode;
	}

}
