package com.jspiders.designpattern.builderpattern;

public class PersonBuilder 
{
	protected Person person = new Person();


	public NameBuilder name() {
		return new NameBuilder(person);
	}

	public AddressBuilder lives() {
		return new AddressBuilder(person);
	}

	public JobBuilder works() {
		return new JobBuilder(person);
	}

	public Person build() {
		return person;
	}
}
