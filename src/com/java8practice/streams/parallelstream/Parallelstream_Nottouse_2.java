package com.java8practice.streams.parallelstream;

import java.util.stream.IntStream;

class sumClient {
	public int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public void performSum(int input) {
		total+= input;
	}
}
public class Parallelstream_Nottouse_2 {
	
	
	public static void main(String[] args) {
		sumClient sum = new sumClient();
		IntStream.rangeClosed(1, 1000)
				//.parallel()   // not to use it will show different output each time
				.forEach(sum :: performSum);
		
		System.out.println(sum.getTotal());
	}

}
