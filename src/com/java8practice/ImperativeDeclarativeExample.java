package com.java8practice;

import java.util.stream.IntStream;

public class ImperativeDeclarativeExample {
	
	public static void main(String[] args) {
		// Imperative approach
		int sum = 0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println("Value of Sum Imperative approach  "+sum);
		
		//Declarative approach
		int sum1 = IntStream.rangeClosed(0, 100)
							//.parallel()
							.sum();
		
		System.out.println("Value of Sum Declarative approach  "+sum1);
	}
}
