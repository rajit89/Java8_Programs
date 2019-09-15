package com.java8practice.streams.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parallelstream_nottouse {
	
	private static int validate_sequential(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum_sequential = integerList.stream()
				.reduce(0,(x,y) -> x+y);
		long endTime = System.currentTimeMillis();;
		System.out.println(endTime - startTime);
		return sum_sequential;
	}
	
	private static int validate_parallel(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum_parallel = integerList.stream()
									  .parallel()
									  .reduce(0,(x,y) -> x+y);
		long endTime = System.currentTimeMillis();;
		System.out.println(endTime - startTime);
		return sum_parallel;
		
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = IntStream.range(0, 10000)
											.boxed()
											.collect(Collectors.toList());
		validate_sequential(integerList);
		validate_parallel(integerList);
	}

}
