package com.jspiders.designpattern.builderpattern;

public class JobBuilder extends PersonBuilder 
{
	public JobBuilder(Person person) {
		this.person=person;
	}

	public void companyIs(String company) {
		person.company = company;
	}

	public void positionIs(String position) {
		person.position = position;
	}

	public void salaryIs(double salary) {
		person.salary = salary;
	}
}
