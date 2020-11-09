package com.jspiders.designpattern.builderpattern;

public class Mainclass {

	public static void main(String[] args) {
		
		PersonBuilder pb = new PersonBuilder();
		NameBuilder nb = pb.name();
		nb.firstName("Aditya");
		nb.middleName("Narayan");
		nb.lastName("Bhat");

		JobBuilder jb = pb.works();
		jb.companyIs("Google");
		jb.positionIs("Java Developer");
		jb.salaryIs(100000.00);
		
		AddressBuilder ab = pb.lives();
		ab.stateIn("Karnataka");
		ab.cityIn("Bengaluru");
		ab.pincodeIs(560018);
		
		Person person = pb.build();
		System.out.println(person);
	}

}
