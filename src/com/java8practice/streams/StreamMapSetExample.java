package com.java8practice.streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamMapSetExample {
	
	public static List<String> getStudentList() {
		
		List<String> studentList = StudentDataBase.getAllStudents()
						.stream()
						.map(Student :: getName)
						.map(String::toUpperCase)
						.collect(toList());
		return studentList;
	}
	public static Set<String> getStudentSet() {
		
		Set<String> studentList = StudentDataBase.getAllStudents()
						.stream()
						.map(Student :: getName)
						.map(String::toUpperCase)
						.collect(toSet());
		return studentList;
	}
	public static void main(String[] args) {
		System.out.println(getStudentList());
		System.out.println(getStudentSet());
	}
}
