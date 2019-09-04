package com.java8practice;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryoperatorExample {

	static Comparator<Integer> comparator = ((a,b) -> a.compareTo(b));
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
		
		System.out.println(binaryOperator.apply(3, 5));
		
		BinaryOperator<Integer> binaryOperatorModify = BinaryOperator.maxBy(comparator);
		
		System.out.println(binaryOperatorModify.apply(3, 5));
		
		BinaryOperator<Integer> binaryOperatorModifyMin = BinaryOperator.minBy(comparator);
		
		System.out.println(binaryOperatorModifyMin.apply(76, 12));
	}
}
