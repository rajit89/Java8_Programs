package com.java8practice;

import java.util.function.Predicate;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class MethodReferenceExample3 {
	
	static Predicate<Student> predicateUsingLambda = MethodReferenceExample3 :: getGradeLevel;
	
	public static boolean getGradeLevel(Student student) {
		return student.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		System.out.println(predicateUsingLambda.test(StudentDataBase.studentSupplier.get()));
	}

}
