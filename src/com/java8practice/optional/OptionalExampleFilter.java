package com.java8practice.optional;

import java.util.Optional;

import com.consumerfunctionexample.Bike;
import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class OptionalExampleFilter {
	
	public static void getOptionalFilter() {
		Optional<Student> studentOpt = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		studentOpt.filter(student -> student.getGpa() > 3.9)
				.ifPresent(s->System.out.println(s));
	}
	public static void getOptionalMap() {
		Optional<Student> studentOpt = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<String> myString = studentOpt.filter(student -> student.getGpa() > 3.5)
				.map(Student :: getName);
		
		System.out.println(myString.isPresent() ? myString.get() : "NA");
	}
	
	public static void getOptionalFlatMap() {
		
		Optional<Student> optStudent  = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> bikeName = optStudent.filter(student -> student.getGpa() > 3.5)
				.flatMap(Student :: getBike)
				.map(Bike :: getName);
				
		System.out.println(bikeName.isPresent() ? bikeName.get() : "NA");
	}
	
	public static void main(String[] args) {
		getOptionalFilter();
		
		getOptionalMap();
		
		getOptionalFlatMap();
	}

}
