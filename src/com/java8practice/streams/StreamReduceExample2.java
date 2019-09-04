package com.java8practice.streams;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamReduceExample2 {
	
	public static Student getMaxCgpa() {
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1,s2)-> s1.getGpa() > s2.getGpa() ? s1 : s2).get();
	}
	
	public static void main(String[] args) {
		
		System.out.println(StreamReduceExample2.getMaxCgpa());	
	}

}
