package com.jspiders.designpattern.builderpattern;

public class NameBuilder extends PersonBuilder 
{	
	public NameBuilder(Person person) {
		this.person=person;
	}

	public void firstName(String fname) {
		person.firstName = fname;
	}

	public void middleName(String mname) {
		person.middleName = mname;
	}

	public void lastName(String lname) {
		person.lastName = lname;
	}
	
}
