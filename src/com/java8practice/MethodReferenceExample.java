package com.java8practice;

import java.util.function.Function;

public class MethodReferenceExample {
	
	static Function<String,String> toUpperCaseFunction = (s) -> s.toUpperCase();
	
	static Function<String,String> toUpperCaseFunctionMethodReference = String::toUpperCase;
	
	public static void main(String[] args) {
		System.out.println(toUpperCaseFunction.apply("Java 8"));
		
		System.out.println(toUpperCaseFunctionMethodReference.apply("Java 8 Function"));
	}

}
