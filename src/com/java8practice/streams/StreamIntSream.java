package com.java8practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamIntSream {
	
		public static int sumOfArrayList(List<Integer> inputList) {
			
			return inputList.stream()
					.reduce(0,(x,y) -> x+y);
		}
		
		public static int sumOfArrayListInstream() {
			
			return IntStream.rangeClosed(1, 6)
							.sum();
		}
		public static void main(String[] args) {
			List<Integer> inputList = Arrays.asList(1,2,3,4,5,6);
			
			System.out.println(StreamIntSream.sumOfArrayList(inputList));
			
			System.out.println(StreamIntSream.sumOfArrayListInstream());
		}

}
