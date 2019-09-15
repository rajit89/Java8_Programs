package com.java8practice.streams.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Parallelstream_ex {
	
	private static long getTimetaken(Supplier<Integer> supplier,int noOfTimes) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<noOfTimes;i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
		
	}
	
	private static int getIntSumvalue_sequential() {
		
		int value = IntStream.range(1, 1000000)
							.sum();
		return value;
	}
	
	private static int getIntSumvalue_parallel() {
		
		int value = IntStream.range(1, 1000000)
							.parallel()
							.sum();
		return value;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Avaialble processor :" +Runtime.getRuntime().availableProcessors());
		
		System.out.println("Sequentail :"+getTimetaken(Parallelstream_ex :: getIntSumvalue_parallel,20));
		System.out.println("Parallel :"+getTimetaken(Parallelstream_ex :: getIntSumvalue_sequential,20));
	}

}
