package com.java8practice;

import java.util.function.Consumer;

public class LambdaVariablesExample {
	
	public static void main(String[] args) {
		
		Integer i = 4;
		
		// Here i not allowed in functional Interface as this is already defined need to change the variable name
		// changed i1 from i
		Consumer<Integer> myConsumer = (i1) -> {

				System.out.println(i1+4);
		};
		mydata(i);
		
		myConsumer.accept(3);
		
	}

	private static void mydata(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
