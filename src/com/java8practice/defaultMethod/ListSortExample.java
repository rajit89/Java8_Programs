package com.java8practice.defaultMethod;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.consumerfunctionexample.Student;
import com.consumerfunctionexample.StudentDataBase;

public class ListSortExample {
	
	static Consumer<Student> studentConsumer = (student -> System.out.println(student));
	
	static Comparator<Student> sortNameComparator = Comparator.comparing(Student :: getName);
	
	static Comparator<Student> sortGradeComparator = Comparator.comparing(Student :: getGradeLevel);
	
	static Comparator<Student> sortGradeNullFirstComparator = Comparator.nullsFirst(sortNameComparator);
	
	static Comparator<Student> sortGradeNullLastComparator = Comparator.nullsLast(sortNameComparator);
	
	public static void sortByName(List<Student> studentList) {
		studentList.sort(Comparator.comparing(Student :: getName));
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGrade(List<Student> studentList) {
		System.out.println("Sort by grade level....");
		Comparator<Student> sortGrade = Comparator.comparing(Student :: getGradeLevel);
		studentList.sort(sortGrade);
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		System.out.println("Sort by comparatorChaining....");
		
		Comparator<Student> sortGradeChaining = sortNameComparator.thenComparing(sortGradeComparator);
		studentList.sort(sortGradeChaining);
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorNullFirstLast(List<Student> studentList) {
		System.out.println("Sort by comparatorNullFirst....");
		
		// null first
		studentList.sort(sortGradeNullFirstComparator);
		
		// null last
		studentList.sort(sortGradeNullLastComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		/*sortByName(studentList);
		sortByGrade(studentList);
		
		comparatorChaining(studentList);*/
		comparatorNullFirstLast(studentList);
	}

}
