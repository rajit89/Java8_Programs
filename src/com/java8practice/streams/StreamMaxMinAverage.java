package com.java8practice.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamMaxMinAverage {
	
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Value of sum - "+sum);
		
		OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
		
		System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);
		
		OptionalInt optionalIntWithZero = IntStream.rangeClosed(0, 0).max();
		System.out.println(optionalIntWithZero.isPresent() ? optionalIntWithZero.getAsInt() : 0);
		
		System.out.println(IntStream.rangeClosed(0, 0).count());
		
		OptionalLong optionalLongMin = LongStream.rangeClosed(50, 100).min();
		System.out.println(optionalLongMin.isPresent() ? optionalLongMin.getAsLong() : 0);
		
		OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
		System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);
	}

}
