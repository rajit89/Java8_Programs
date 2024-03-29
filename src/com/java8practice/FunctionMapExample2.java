package com.java8practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class FunctionMapExample2 {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> bifunction = ((students,studentPredicate) -> {
		Map<String,Double> studentGradeMap = new HashMap<>();
		
		students.forEach(student -> {
			if(studentPredicate.test(student))
				studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	});
	public static void main(String[] args) {
		System.out.println(bifunction.apply(StudentDataBase.getAllStudents(), 
				PredicateStudentExample.predicateStudentGpaFilter));
	}

}
