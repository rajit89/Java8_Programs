package com.java8practice.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateExample {
	
	public static void main(String[] args) {
		
		Stream<String> streamOf = Stream.of("one","two","Three");
		streamOf.forEach(System.out::println);
		
		Stream.iterate(1, x -> x * 2)
				.limit(10)
				.forEach(System.out::println);
		
		// Created a Stream
		Supplier<Integer> supplierStream = new Random() :: nextInt;
		
		Stream.generate(supplierStream)
				.limit(10)
				.forEach(System.out::println);
		
	}

}
