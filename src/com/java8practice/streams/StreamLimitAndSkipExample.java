package com.java8practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipExample {
	
	public static Optional<Integer> limit(List<Integer> myList) {
		return myList.stream()
			.limit(2)
			.reduce((a,b) -> a + b);
	}
	
	public static Optional<Integer> skip(List<Integer> myList) {
		return myList.stream()
			.skip(2)
			.reduce((a,b) -> a + b);
	}
	
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(2,3,4,5);
		Optional<Integer> myOutputLimit = StreamLimitAndSkipExample.limit(myList);
		if(myOutputLimit.isPresent())
			System.out.println(myOutputLimit.get());
		
		Optional<Integer> myOutputSkip = StreamLimitAndSkipExample.skip(myList);
		if(myOutputSkip.isPresent())
			System.out.println("myOutputSkip  "+myOutputSkip.get());
	}

}
