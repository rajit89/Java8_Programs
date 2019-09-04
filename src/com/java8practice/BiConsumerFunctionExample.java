package com.java8practice;

import java.util.List;
import java.util.function.BiConsumer;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class BiConsumerFunctionExample {

	static BiConsumer<String, List<String>> studentList = (name,activities) -> System.out.println(name +" : "+activities);
	
	static List<Student> getAllStudent = StudentDataBase.getAllStudents();
	
	
	public static void main(String[] args) {
		//calculation();
		
		getAllStudent.forEach(student -> studentList.accept(student.getName(),student.getActivities()));
		
	}
	
	public static void calculation() {
		BiConsumer<Integer, Integer> multiply = (i,j) -> System.out.println(i*j);
		BiConsumer<Integer, Integer> division = (i,j) -> System.out.println(i/j);
		multiply.andThen(division).accept(10, 5);
	}
}
