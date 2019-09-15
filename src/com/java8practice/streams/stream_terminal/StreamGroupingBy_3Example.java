package com.java8practice.streams.stream_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamGroupingBy_3Example {
	
	private static LinkedHashMap<String,Set<Student>> threeArugemtGroupingBy() {
		
		LinkedHashMap<String,Set<Student>> myStudent = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.groupingBy(Student :: getName,LinkedHashMap :: new,Collectors.toSet()));
		
		return myStudent;
	}
	
	private static Map<String,Optional<Student>> threeArugemtGroupingByMax() {
		
		Map<String,Optional<Student>> myStudentWithGroupBy_1 = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.groupingBy(Student :: getName,
								Collectors.maxBy(Comparator.comparing(Student :: getGradeLevel))));
		
		return myStudentWithGroupBy_1;
	}
	private static Map<String,Student> threeArugemtGroupingByMaxCollectAndThen() {
		
		Map<String,Student> myStudentWithGroupBy_2 = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.groupingBy(Student :: getName,
							Collectors.collectingAndThen(Collectors
									.maxBy(Comparator.comparing(Student :: getGradeLevel)), Optional:: get)));
		
		return myStudentWithGroupBy_2;
	}
	
	public static void main(String[] args) {
		System.out.println(threeArugemtGroupingBy());
		
		System.out.println(threeArugemtGroupingByMax());
		
		System.out.println(threeArugemtGroupingByMaxCollectAndThen());
	}
}
