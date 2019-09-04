package com.java8practice;

import java.util.List;
import java.util.function.Predicate;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class PredicateStudentExample {
	
	static Predicate<Student> predicateStudentGpaFilter = (student) -> student.getGpa() >= 3.0;
	static Predicate<Student> predicateStudentGradeLevelFilter = (student) -> student.getGradeLevel() >= 3.9;
	
	static List<Student> totalList = StudentDataBase.getAllStudents();
	
	public static void printStudentGpaFilter() {
		totalList.forEach(student -> {
			predicateStudentGpaFilter.test(student);
			System.out.println(student);
		});
	}
	public static void printStudentGpaAndGradeFilter() {
		System.out.println("printStudentGpaAndGradeFilter()...");
		totalList.forEach(student -> {
			predicateStudentGpaFilter.and(predicateStudentGradeLevelFilter).test(student);
			System.out.println(student);
		});
	}
	public static void printStudentGpaAndGradeNotPassFilter() {
		System.out.println("printStudentGpaAndGradeNotPassFilter()...");
		totalList.forEach(student -> {
			if(predicateStudentGpaFilter.and(predicateStudentGradeLevelFilter).negate().test(student))
				System.out.println(student);
			else
				System.out.println(student);
		});
	}
	public static void main(String[] args) {
		printStudentGpaFilter();
		printStudentGpaAndGradeFilter();
		printStudentGpaAndGradeNotPassFilter();
	}

}
