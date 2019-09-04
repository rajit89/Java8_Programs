package com.java8practice.streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamComparator {
	
	public static List<Student> StudentNameCompare() {
		return StudentDataBase.getAllStudents().stream()
										.sorted(Comparator.comparing(Student :: getName))
										.collect(toList());
	}

	public static List<Student> StudentCgpaNameCompare() {
		return StudentDataBase.getAllStudents().stream()
					//.sorted(Comparator.comparing(Student :: getName).thenComparing(Student :: getGpa).reversed())
				.sorted(Comparator.comparing(Student :: getGpa).reversed())
										.collect(toList());
	}
	public static void main(String[] args) {
		StreamComparator.StudentNameCompare().forEach(System.out :: println);
		System.out.println("Cgpa and Name========================");
		StreamComparator.StudentCgpaNameCompare().forEach(System.out::println);
		
	}

}
