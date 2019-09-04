package com.java8practice;

import java.util.function.Function;
import java.util.function.Supplier;

import com.consumerfunctionexample.Student;

public class ConstructorReferenceExample {
	
	static Supplier<Student> constructorReference = Student::new;
	
	static Function<String,Student> constructorTwoReference = Student :: new;

	public static void main(String[] args) {
		System.out.println(constructorReference.get());
		System.out.println(constructorTwoReference.apply("ABC"));
	}
}
