package com.java8practice.streams.stream_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamPartioningExample {
	
	private static Map<Boolean,List<Student>> getDataUsingPartioning_1() {
		
		Predicate<Student> studentPredicate = student -> student.getGpa() > 3.8;
		
		Map<Boolean,List<Student>> studentPartioning_1 = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.partitioningBy(studentPredicate));
		
		return studentPartioning_1;
	}
	
	private static Map<Boolean,Set<Student>> getDataUsingPartioning_2() {
		
		Predicate<Student> studentPredicate = student -> student.getGpa() > 3.8;
		
		Map<Boolean,Set<Student>> studentPartioning_2 = StudentDataBase.getAllStudents()
						.stream()
						.collect(Collectors.partitioningBy(studentPredicate,Collectors.toSet()));
		
		return studentPartioning_2;
	}
	
	public static void main(String[] args) {
		System.out.println(getDataUsingPartioning_1());	
		
		System.out.println(getDataUsingPartioning_2());
	}

}
