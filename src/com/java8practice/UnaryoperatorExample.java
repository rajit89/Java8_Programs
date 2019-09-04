package com.java8practice;

import java.util.function.UnaryOperator;

public class UnaryoperatorExample {
	
	static UnaryOperator<String> unaryOperator = s -> s.concat("dafault");
	
	public static void main(String[] args) {
		System.out.println(unaryOperator.apply("Test"));
	}

}
