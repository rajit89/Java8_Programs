package com.java8practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class FunctionMapExample {
	
	static Function<List<Student>,Map<String,Double>> studentMap = (students -> {
		Map<String,Double> resultMap = new HashMap<>();
		students.forEach(student -> {
			if(PredicateStudentExample.predicateStudentGpaFilter.test(student))
				resultMap.put(student.getName(), student.getGpa());
		});
		return resultMap;
	});
	public static void main(String[] args) {
		System.out.println(studentMap.apply(StudentDataBase.getAllStudents()));
	}

}
