package com.string;

public class stringBufferDemo {

	public static void main(String[] args) {


		//String Buffer are mutable so it will return me the same string and will not create a new string	

		StringBuffer str =new StringBuffer("Shubham");
		System.out.println(str.hashCode());

		StringBuffer str1= str.append("saurav");
		System.out.println(str1.hashCode());

		//This will return the same Hashcode
	}

}
