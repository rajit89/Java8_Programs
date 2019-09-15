package com.java8practice.optional.customimplementation;

import java.util.List;

public interface Multiply {
	// Custom implementation as this is the general interface contract
	int multiply(List<Integer> multiList);
	
	// Can be overrided
	default int size(List<Integer> multiList) {
		return multiList.size();
	}
	
	// Can not be overrided
	static boolean isEmpty(List<Integer> multiList) {
		return multiList != null && multiList.size() < 0;
	}
}
