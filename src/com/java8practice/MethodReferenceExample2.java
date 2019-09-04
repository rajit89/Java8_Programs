package com.java8practice;

import java.util.function.Consumer;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class MethodReferenceExample2 {
	
	static Consumer<Student> studentConsumer =  (student) -> System.out.println(student);
	
	static Consumer<Student> studentConsumerMethodReference =  Student :: getActivities;
	
	static Consumer<Student> studentConsumerMethodReference_1 =  Student :: printListOfActivities;

	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(studentConsumer);
		
		StudentDataBase.getAllStudents().forEach(studentConsumerMethodReference);
		
		StudentDataBase.getAllStudents().forEach(studentConsumerMethodReference_1);
	}

}
