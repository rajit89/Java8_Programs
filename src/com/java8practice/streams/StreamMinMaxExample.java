package com.java8practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static Integer getMax(List<Integer> intList) {
		return intList.stream().reduce(1, (a, b) -> a > b ? a : b);
	}
	// To get actual value use Optional<Integer> 
	//otherwise if we put identity "1" as above then it will return as it is small value
	public static Optional<Integer> getMin(List<Integer> intList) {
		return intList.stream().reduce((a, b) -> a < b ? a : b);
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, 6, 7, 8, 10);

		System.out.println("Max Value " + StreamMinMaxExample.getMax(intList));

		Optional<Integer> value = StreamMinMaxExample.getMin(intList);
		if (value.isPresent())
			System.out.println(value.get());
	}
}
