package com.java8practice.optional;

import java.util.Optional;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class OptionalExample {
	
	private static String getStudentName() {
		//Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		if(student != null)
			return student.getName();
		return null;
	}
	private static Optional<String> getStudentNameWithOptional() {
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> student = Optional.ofNullable(null);
		if(student.isPresent())
			return student.map(Student :: getName);
		else
			return Optional.empty();
	}
	
	public static void main(String[] args) {
		// Give you null pointer exception
		
		/*String nameValue = getStudentName();
		System.out.println(nameValue.length());*/
		
		Optional<String> optionalStringValue = getStudentNameWithOptional();
		
		if(optionalStringValue.isPresent())
			System.out.println(optionalStringValue.get().length());
		else
			System.out.println(optionalStringValue.empty());
	}

}
