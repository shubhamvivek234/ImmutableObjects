package com.string;

public class stringDemo {

	public static void main(String[] args) {


		// Strings are immutable so whenever we add 2 string or create a substring out of a string
		// we always create a new string  and doesn't return the same string

		String str ="Shubham";
		System.out.println(str.hashCode());

		String str1= str.concat("saurav");
		System.out.println(str1.hashCode());


		//Hash Codes will be different

	}

}
