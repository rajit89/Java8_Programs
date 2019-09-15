package com.java8practice.optional;

import java.util.Optional;

public class OptionalExampleIfPresent {
	
	public static void main(String[] args) {
		
		Optional<String> myOptional = Optional.ofNullable("Hello optional");
		System.out.println("If Present "+myOptional.isPresent());
		
		if(myOptional.isPresent()) {
			System.out.println(myOptional.get());
		}
		myOptional.ifPresent(s -> System.out.println(s));
	}
}
