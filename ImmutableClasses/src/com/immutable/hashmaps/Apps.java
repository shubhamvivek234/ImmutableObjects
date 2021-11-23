package com.immutable.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Apps {
	
	public static void main(String[] args)
	{

	HashMap<student, String> map = new HashMap<>();
	student s1=new student("Abhilash");
	map.put(s1,"India");
	
	s1.setName("Shubham"); 
	
	
	System.out.println(map.get(s1));

	
	
	
	
	
	
	
	}
}
