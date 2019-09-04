package com.java8practice;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class PredicateStudentBiconsumerExample {
	
	static Predicate<Student> predicateStudentGpaFilter = (student) -> student.getGpa() >= 3.9;
	static Predicate<Student> predicateStudentGradeLevelFilter = (student) -> student.getGradeLevel() >= 3;
	
	static BiPredicate<Integer,Double> bi_predicateStudentGradeLevelFilter = (gradeLevel,gpaLevel) -> gradeLevel >= 3 && gpaLevel >= 3.9;
	
	static BiConsumer<String, List<String>> studentListBiConsumer = (name,activities) -> System.out.println(name +" : "+activities);
	
	static Consumer<Student> studentConsumer = student -> {
		if(predicateStudentGradeLevelFilter.and(predicateStudentGpaFilter).test(student))
			studentListBiConsumer.accept(student.getName(), student.getActivities());
	};
	
	static Consumer<Student> studentConsumer_bipredicate = student -> {
		
		if(bi_predicateStudentGradeLevelFilter.test(student.getGradeLevel(), student.getGpa())) {
			studentListBiConsumer.accept(student.getName(), student.getActivities());
		}
			
	};
	
	public static void printData(List<Student> studentList) {
		//studentList.forEach(studentConsumer);
		studentList.forEach(studentConsumer_bipredicate);
	}

	public static void main(String[] args) {
		List<Student> totalList = StudentDataBase.getAllStudents();
		printData(totalList);
	}
}
