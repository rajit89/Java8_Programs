package com.java8practice.optional;

import java.util.Optional;

public class OptionalExampleOfNullable {
	
	
	private static Optional<String> getOfNullable() {
		Optional<String> value = Optional.ofNullable("Hello");
		//Optional<String> value = Optional.ofNullable(null);
		return value;
	}
	
	private static Optional<String> getOf() {
		Optional<String> value = Optional.of("Hello");
		//Optional<String> value = Optional.of(null);
		return value;
	}
	private static Optional<String> getEmpty() {
		Optional<String> value = Optional.empty();
		return value;
	}
	
	public static void main(String[] args) {
		System.out.println(getOfNullable());
		
		System.out.println(getOf());
		
		System.out.println(getEmpty());
	}

}
