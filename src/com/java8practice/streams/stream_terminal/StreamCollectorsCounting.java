package com.java8practice.streams.stream_terminal;

import java.util.stream.Collectors;

import com.consumerfunctionexample.StudentDataBase;

public class StreamCollectorsCounting {
	
	public static long countNoOfStudent() {
		return StudentDataBase.getAllStudents()
						.stream()
						.filter(student -> student.getGpa() >= 3.9)
						.collect(Collectors.counting());
						//.count();
		
	}
	public static void main(String[] args) {
		System.out.println(countNoOfStudent());
	}
}
