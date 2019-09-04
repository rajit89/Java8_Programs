package com.java8practice.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamFilter {
	
	public static List<Student> getFilterName(){
		
		return StudentDataBase.getAllStudents().stream()
						.filter(s -> s.getName().startsWith("J"))
						.filter(s -> s.getGpa() > 3)
						.collect(toList());
	}
	public static void main(String[] args) {
		StreamFilter.getFilterName().forEach(System.out::println);
	}
}
