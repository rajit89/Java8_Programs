package com.java8practice.streams;

import com.consumerfunctionexample.StudentDataBase;

public class StreamAnyNoneAllMatchExample {

	public static boolean getAllMatch() {

		return StudentDataBase.getAllStudents().stream().allMatch(s -> s.getGpa() >= 4.0);
	}

	public static boolean getAnyMatch() {

		return StudentDataBase.getAllStudents().stream().anyMatch(s -> s.getGpa() >= 4.0);
	}

	public static boolean getNoneMatch() {

		return StudentDataBase.getAllStudents().stream().noneMatch(s -> s.getGpa() >= 4.0);
	}

	public static void main(String[] args) {
		System.out.println("getAllMatch... " + StreamAnyNoneAllMatchExample.getAllMatch());

		System.out.println("getAnyMatch... " + StreamAnyNoneAllMatchExample.getAnyMatch());

		System.out.println("getNoneMatch... " + StreamAnyNoneAllMatchExample.getNoneMatch());
	}
}
