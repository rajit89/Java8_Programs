package com.java8practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNumericMapToObject {

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 25)
						.mapToObj((i) -> new Integer(i))
						.collect(Collectors.toList());
	}

	public static long mapToLong() {
		return IntStream.rangeClosed(1, 25).mapToLong((i) -> i).sum();
	}

	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 25).mapToDouble((i) -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println("mapToObj " + mapToObj());

		System.out.println("mapToLong  " + mapToLong());

		System.out.println("mapToDouble " + mapToDouble());
	}
}
