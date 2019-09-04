package com.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class SupplierExample {
	
	static Supplier<Student> inputStudent = () -> new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));

	static Supplier<List<Student>> studentList = () -> StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		System.out.println(inputStudent.get());
		
		System.out.println(studentList.get());
	}
}
