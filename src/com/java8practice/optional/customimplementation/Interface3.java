package com.java8practice.optional.customimplementation;

public interface Interface3 extends Interface2{
	default void methodA() {
		System.out.println("Interface3"+Interface3.class);
	}
}
