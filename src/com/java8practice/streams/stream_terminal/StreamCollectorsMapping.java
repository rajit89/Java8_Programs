package com.java8practice.streams.stream_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamCollectorsMapping {
	
	public static List<String> getStudentName() {
		
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.mapping(Student::getName,Collectors.toList()));
		
	}
	
	public static Set<String> getStudentNameSet() {
		
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.mapping(Student::getName,Collectors.toSet()));
		
	}
	
	public static List<String> getStudentNameTraditional() {
		
		return StudentDataBase.getAllStudents()
						.stream()
						.map(Student :: getName)
						.collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		System.out.println("AS List:  "+getStudentName());
		System.out.println("As Set:  "+getStudentNameSet());
		
		System.out.println("Traditional Way :  "+getStudentNameTraditional());
	}

}
