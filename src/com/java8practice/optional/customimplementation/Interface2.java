package com.java8practice.optional.customimplementation;

public interface Interface2 extends Interface1{
	default void methodA() {
		System.out.println("Interface2 A"+Interface2.class);
	}
	default void methodB() {
		System.out.println("Interface2 B"+Interface2.class);
	}
}
