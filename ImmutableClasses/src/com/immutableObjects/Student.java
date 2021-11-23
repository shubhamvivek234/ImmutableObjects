package com.immutableObjects;

public class Student {

	final private int id;
	final private String studentName;

	final private Address address;    //Mutable Reference in Immutable class


	public Student(int id, String studentName, Address address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address=address;
	}


	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	//1.
	//	public Address getAddress() {
	//		return address;
	//	}


	// 2.	
	// Fix to make the class Immutable even after passing the mutable Reference
	// earlier we were returning the address directly ,so now we will create a new address object
	// with the same content and will return it back to the calling method

	//	public Address getAddress() {
	//		return new Address(address.getCity(),address.getState());
	//	}


	// 3.
	public Address getAddress() {
		return new Address(address);
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", address=" + address + "]";
	}









}
