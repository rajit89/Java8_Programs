package com.java8practice.streams.stream_terminal;

import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StudentStreamSummingInt {
	
	private static int summing_int() {
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	private static double average_int() {
		return StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {
		System.out.println("Summing of value of "+summing_int());
		
		System.out.println("Average of value "+average_int());
	}
}
