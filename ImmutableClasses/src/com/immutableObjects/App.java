package com.immutableObjects;

public class App {

	public static void main(String[] args) {

		Address homeAddress=new Address("blr","Karnataka","India");
		Student abhilash =new Student(1,"Shubham",homeAddress);
		System.out.println(abhilash);
		System.out.println("Hascode" + homeAddress.hashCode());


		// In the line below we are again able to change the state of immutable class
		//	by passing the reference of mutable class	
		Address address=abhilash.getAddress(); //this will  clone the address object we are not changing the original address object

		address.setCity("Ranchi");
		address.setState("Jharkhand");
		System.out.println(abhilash);

		System.out.println("Hascode" + address.hashCode());

	}

}
