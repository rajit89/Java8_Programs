package com.java8practice.optional.customimplementation;

public interface Interface1 {
	default void methodA() {
		System.out.println("Interface1" +Interface1.class);
	}
}
