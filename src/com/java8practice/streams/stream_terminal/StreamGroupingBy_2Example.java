package com.java8practice.streams.stream_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamGroupingBy_2Example {
	
	private static Map<Integer,Map<String,List<Student>>> getGroupbyMapOfMap() {
		
		Map<Integer,Map<String,List<Student>>> mapOfmapStudent = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student :: getGradeLevel,
					Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "Average" )));
		return mapOfmapStudent;
	}
	
  private static Map<Integer,Integer> getSumminInt() {
		
		Map<Integer,Integer> mapOfmapStudentSummingInt = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student :: getGradeLevel,
					Collectors.summingInt(Student :: getNoteBooks)));
		return mapOfmapStudentSummingInt;
	}

	public static void main(String[] args) {
		System.out.println(getGroupbyMapOfMap());
		
		System.out.println(getSumminInt());
	}
}
