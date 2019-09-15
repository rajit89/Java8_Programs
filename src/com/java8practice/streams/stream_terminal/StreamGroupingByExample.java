package com.java8practice.streams.stream_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamGroupingByExample {
	
	public static Map<String,List<Student>> getGenderGroupBy() {
		Map<String,List<Student>> mapStudent = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.groupingBy(Student :: getGender));
		return mapStudent;
	}
	
	public static Map<String,List<Student>> getCustomGroupBy(){
		Map<String,List<Student>> mapStudent = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "Average" ));
		return mapStudent;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getGenderGroupBy());
		
		System.out.println(getCustomGroupBy());
	}

}
