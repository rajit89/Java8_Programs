package com.java8practice.streams;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamFlatMapExample {
	
	public static List<String> getStudentList() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>>
						.flatMap(List::stream)  //Stream<String>
						.collect(toList());
		return studentActivities;
	}
	public static Set<String> getStudentSet() {
		Set<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>
						.flatMap(List::stream)  //Stream<String>
						.collect(toSet());
		return studentActivities;
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentList());
		
		System.out.println(getStudentSet());
	}
}
