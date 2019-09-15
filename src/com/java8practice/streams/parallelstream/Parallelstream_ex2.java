package com.java8practice.streams.parallelstream;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class Parallelstream_ex2 {
	
	public static List<String> getStudentList_sequential() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>>
						.flatMap(List::stream)  //Stream<String>
						.distinct()
						.sorted()
						.collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential Time taken "+ (endTime - startTime));
		return studentActivities;
	}
	
	public static List<String> getStudentList_parallel() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>>
						.flatMap(List::stream)  //Stream<String>
						.distinct()
						.sorted()
						.collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel Time taken "+ (endTime - startTime));
		return studentActivities;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Avaialble processor :" +Runtime.getRuntime().availableProcessors());
		
		getStudentList_sequential();
		getStudentList_parallel();
	}

}
