package com.java8practice;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> myFunction = (input) -> input.toUpperCase();
	
	static Function<String, String> myFunction1 = (input) -> input.toUpperCase().concat("default");
	
	public static void main(String[] args) {
		
		System.out.println(myFunction.apply("java8"));
		
		System.out.println(myFunction1.apply("java8"));
		
		System.out.println(myFunction.andThen(myFunction1).apply("Test"));
		
		// IN Compose first myFunction1 will execute then myFunction will execute
		System.out.println(myFunction.compose(myFunction1).apply("Test"));
	}
}
