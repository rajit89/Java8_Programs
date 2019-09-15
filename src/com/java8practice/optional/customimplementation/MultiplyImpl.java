package com.java8practice.optional.customimplementation;

import java.util.List;

public class MultiplyImpl implements Multiply {

	@Override
	public int multiply(List<Integer> multiList) {
		return multiList.stream().reduce(1,(x,y) -> x*y);
	}
	
	// Can be overrided as it is defualt in interface
	@Override
	public int size(List<Integer> multiList) {
		return multiList.get(1);
	}
}
