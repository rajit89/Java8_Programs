package com.java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,3,4,4,5,5,6,7,8,8);
		//Iterative ways 
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer output : myList) {
			if(!uniqueList.contains(output)) {
				uniqueList.add(output);
			}
		}
		System.out.println("Iterative ways output " +uniqueList);
		
		//Declarative ways output
		List<Integer> uniqueList1 = new ArrayList<>();
		
		uniqueList1 = myList.stream()
							//.parallelStream()
							.distinct()
							.collect(Collectors.toList());
		
		System.out.println("Declarative ways output "+uniqueList1);
	}
}
