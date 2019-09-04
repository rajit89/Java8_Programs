package com.java8practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static Integer getMultiplication(List<Integer> intList) {
		return intList.stream().reduce(1, (a, b) -> a * b);
	}
	
	public static Optional<Integer> getMultiplicationWithOptonal(List<Integer> intList) {
		return intList.stream().reduce((a, b) -> a * b);
	}

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 4, 5, 6);
		System.out.println(StreamReduceExample.getMultiplication(myList));
		
		System.out.println("With Optional");
		Optional<Integer> valuePresent = StreamReduceExample.getMultiplicationWithOptonal(myList);
		if(valuePresent.isPresent()) {
			System.out.println(valuePresent.get());
		}
		
	}
}
