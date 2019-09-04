package com.java8practice.streams;

import com.consumerfunctionexample.StudentDataBase;

public class StreamMapFilter {
	
	public static int getNoOfNotebook() {
		return StudentDataBase.getAllStudents().stream()
						.filter(s->s.getGradeLevel() > 3)
						.map(s -> s.getNoteBooks())
						.reduce(0,Integer::sum);
						//.reduce(0,(a,b) -> a+b);
	}
	public static void main(String[] args) {
		System.out.println(StreamMapFilter.getNoOfNotebook());
	}

}
