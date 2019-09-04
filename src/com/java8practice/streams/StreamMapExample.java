package com.java8practice.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamMapExample {
	
	static Predicate<Student> predicateGetGpa = (student) -> student.getGpa() >= 3.9;
	
	static Predicate<Student> predicateGradelevel = (student) -> student.getGradeLevel() >= 3;
	
	public static void main(String[] args) {
		
	Map<String,List<String>> ouputMap = StudentDataBase.getAllStudents()
						.stream()
						.filter(predicateGetGpa.and(predicateGradelevel))//Streams of students intermediate operation
						//.filter(predicateGradelevel)
						.collect(Collectors.toMap(Student::getName, Student::getActivities));// Terminal Operation
	
	System.out.println(ouputMap);
	}

}
