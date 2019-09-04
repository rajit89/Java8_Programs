package com.java8practice.streams.stream_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamCollectorsMinByMaxBy {
	
	public static Optional<Student> getMinBy(){
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> getMaxBy(){
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {
		System.out.println("Min cgpa : "+getMinBy());
		
		System.out.println("Max cgpa : "+getMaxBy());
	}

}
