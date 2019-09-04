package com.java8practice.streams;

import java.util.Optional;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class StreamFindFirstExample {
	
	public static Optional<Student> findFirstvalue() {
		return StudentDataBase.getAllStudents().stream()
						.filter(s -> s.getGradeLevel() > 1)
						.findFirst();
	}
	
	public static Optional<Student> findAny() {
		return StudentDataBase.getAllStudents().stream()
						.filter(s -> s.getGradeLevel() > 1)
						.findAny();
	}
	
	
	public static void main(String[] args) {
		Optional<Student> myStudent = StreamFindFirstExample.findFirstvalue();
		if(myStudent.isPresent()) 
			System.out.println("myStudent  "+myStudent.get());
		
		Optional<Student> myStudentOpt = StreamFindFirstExample.findAny();
		
		if(myStudentOpt.isPresent()) 
			System.out.println("myStudentOpt  "+myStudentOpt.get());
	}

}
