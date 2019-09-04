package com.java8practice;

import java.util.function.Predicate;

public class PredicateNegateExample {
	static Predicate<Integer> myPredicate = (i) -> i%2==0;
	
	static Predicate<Integer> myPredicateOdd = (i) -> i%5==0;
	
	public static void getData() {
		System.out.println(myPredicate.test(8));
	}
	
	public static void getDataFalseTrue() {
		System.out.println(myPredicateOdd.test(9));
	}
	public static void getNegate() {
		System.out.println(myPredicateOdd.negate().test(9));
	}
	
	public static void main(String[] args) {
		getData();
		getDataFalseTrue();
		getNegate();
		
		System.out.println(myPredicate.and(myPredicateOdd).test(10));
		System.out.println(myPredicate.or(myPredicateOdd).test(6));
	}

}
