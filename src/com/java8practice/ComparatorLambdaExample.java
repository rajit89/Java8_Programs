package com.java8practice;

import java.util.Comparator;

public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		
		Comparator<Integer> myComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Compare to implementation "+myComparator.compare(4, 3));
		

		Comparator<Integer> java8Comparator = (Integer i1,Integer i2) -> i1.compareTo(i2);
		
		System.out.println("Compare to java8Comparator implementation "+java8Comparator.compare(4, 3));
		
		Comparator<Integer> java8NewComparator = (i1,i2) -> i1.compareTo(i2);
		
		System.out.println("Compare to java8NewComparator implementation "+java8NewComparator.compare(4, 3));
	}
}
