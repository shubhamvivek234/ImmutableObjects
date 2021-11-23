package com.immutableObjects;

    //Mutable class
public class Address {

	private String city;
	private String state;

	// later adding another field here we will have to do changes is all the other classes
	//  who are having address object reference as it violates the design principles 
	//example if teacher class is extending or headmaster class

	private String country;


	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country=country;
	}

	//Copy Constructor
	public Address(Address address)     
	{
		this(address.getCity(),address.getState(),address.getCountry());
	}


	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
