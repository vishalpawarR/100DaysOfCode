package com.jspiders.designpattern.builderpattern;

public class Person 
{
	// name
	String firstName;
	String middleName;
	String lastName;
	// address
	String state;
	String city;
	int pincode;
	// job
	String company;
	String position;
	double salary;

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", state="
				+ state + ", city=" + city + ", pincode=" + pincode + ", company=" + company + ", position=" + position
				+ ", salary=" + salary + "]";
	}

}
