package com.java8practice.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamFlatMapSortedDistictCountExample {
	
	public static List<String> getStudentList() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>>
						.flatMap(List::stream)  //Stream<String>
						.distinct()
						.sorted()
						.collect(toList());
		return studentActivities;
	}
	public static Long getActivitiesCount() {
		Long activitiesCount = StudentDataBase.getAllStudents().stream()//Stream<Student>
						.map(Student :: getActivities) // Stream<List<String>>
						.flatMap(List::stream)  //Stream<String>
						.distinct()
						.count();
		return activitiesCount;
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentList());
		System.out.println("Count  .."+getActivitiesCount());
	}
}
