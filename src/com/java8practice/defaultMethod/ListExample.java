package com.java8practice.defaultMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {
	
	static List<String> myList = Arrays.asList("Rajesh","Susil","Rakesh","Barsa");
	
	public static void main(String[] args) {
		Collections.sort(myList);
		
		System.out.println("Prior java 8 Collection "+myList);
		
		myList.sort(Comparator.naturalOrder());
		
		System.out.println("Java 8 Collection "+myList);
		
		myList.sort(Comparator.reverseOrder());
		
		System.out.println("Java 8 Collection reverse order "+myList);
	}
}
