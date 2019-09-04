package com.java8practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNumericBoxingUnboxing {
	
	public static List<Integer> boxing() {
		
		return IntStream.rangeClosed(1, 10)
				.boxed()
				.collect(Collectors.toList());
	}
	public static int unBoxing(List<Integer> integerValue) {
		
		return integerValue.stream()
							.mapToInt(Integer :: intValue)
							.sum();
	}
	public static void main(String[] args) {
		System.out.println(StreamNumericBoxingUnboxing.boxing());
		List<Integer> integerValue = boxing();
		System.out.println(StreamNumericBoxingUnboxing.unBoxing(integerValue));
	}
}
