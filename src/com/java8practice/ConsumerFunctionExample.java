package com.java8practice;

import java.util.List;
import java.util.function.Consumer;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class ConsumerFunctionExample {
	
	static Consumer<Student> studentImpl = (student) -> System.out.println(student);
	static Consumer<Student> studentName = (student) -> System.out.print(student.getName() + ":");
	static Consumer<Student> studentActivities = (student) -> System.out.println(student.getActivities());
	
	static List<Student> getAllStudent = StudentDataBase.getAllStudents();
	
	public static void printallStudent() {
		getAllStudent.forEach(studentImpl);
	}
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		getAllStudent.forEach(studentName.andThen(studentActivities));
	}
	
	public static void printNameAndActivitieswithCondition() {
		getAllStudent.forEach((student) -> {
									if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
									System.out.println(student);
			});
	}
	
	public static void main(String[] args) {
		//Consumer<String> consumerImpl = (x) -> System.out.println(x.toUpperCase());
		//consumerImpl.accept("java8");
		//printallStudent();
		
		//printNameAndActivities();
		
		printNameAndActivitieswithCondition();
		
	}
}
