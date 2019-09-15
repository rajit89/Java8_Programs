package com.java8practice.optional;

import java.util.Optional;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class OptionalExampleOrElseScenario {
	
	private static String getOrElse() {
		Optional<Student> nameValue  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String name = nameValue.map(Student :: getName).orElse("Default");
		return name;
	}
	private static String getOrElseGet() {
		Optional<Student> nameValue  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		String name = nameValue.map(Student :: getName).orElseGet(() -> "Default");
		return name;
	}
	private static String getOrElseThrow() {
		//Optional<Student> nameValue  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> nameValue  = Optional.ofNullable(null);
		String name = nameValue.map(Student :: getName).orElseThrow(() -> new RuntimeException("Not available"));
		return name;
	}
	public static void main(String[] args) {
		System.out.println(getOrElse());
		
		System.out.println(getOrElseGet());
		
		System.out.println(getOrElseThrow());
	}
	
}
