package com.java8practice.optional.customimplementation;

import java.util.Arrays;
import java.util.List;

public class MultiplyImplMainMethod {
	
	static List<Integer> multiListInput = Arrays.asList(1,2,3,4,5);
	
	public static void main(String[] args) {
		MultiplyImpl multiplyImpl = new MultiplyImpl();
		System.out.println(multiplyImpl.multiply(multiListInput));
		
		// Can be overrided as it is defualt in interface
		System.out.println("default method.. "+ multiplyImpl.size(multiListInput));
		
		System.out.println("static method.. "+ Multiply.isEmpty(multiListInput));
	}

}
