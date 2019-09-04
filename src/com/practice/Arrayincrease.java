package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution11 {

	public int[] solution(int K, int M, int[] A) {

		int noOfLoop = (A.length - K) + 1;

		int nextCount = K;

		int[] tobeChanged = new int[A.length];

		List<int[]> myArr = new ArrayList<>();

		for (int j = 0; j < noOfLoop; j++) {

			Integer[] subArray = IntStream.range(j, j + nextCount).mapToObj(i -> A[i] + 1).toArray(Integer[]::new);

			int[] intArray = Arrays.stream(subArray).mapToInt(Integer::intValue).toArray();

			// System.out.println(Arrays.toString(intArray));

			tobeChanged = A.clone();

			System.arraycopy(intArray, 0, tobeChanged, j, K);

			myArr.add(tobeChanged);

			System.out.println("Value of after increasing " + Arrays.toString(tobeChanged));

			// intArray = null;

			// tobeChanged = A;
		}
		// System.out.println(Arrays.toString(myArr.toArray()));
		findOutPut(myArr, A.length, K);
		return null;

	}

	private int[] findOutPut(List<int[]> myArr, int sizeOfInputArray, int segement) {

		int haflOfArray = sizeOfInputArray / 2;

		System.out.println("Size of the array ... " + haflOfArray);

		List<Integer> myList = new ArrayList<Integer>();

		for (int[] myarr : myArr) {

			List<Integer> numbers = Arrays.stream(myarr).boxed().collect(Collectors.toList());

			Integer curr = null;
			int count = 0;

			System.out.print("{");
			//int valueiii = 0;

			for (int val : numbers) {
				//valueiii = val;
				if (curr == null) {
					curr = val;
					count = 1;
				} else if (curr != val) {
					System.out.print("(" + curr + ", " + count + ")");
					if (segement <= Collections.frequency(numbers, val)) {
						if (count >= haflOfArray) {
							System.out.print("my count " + curr + ", " + count + ")");
							myList.add(curr);
						}
					}

					curr = val;
					count = 1;
				} else {
					++count;
				}
			}
			System.out.print("****  (" + curr + ", " + count + ")");
			System.out.print("}");
			System.out.println(";;;;");
			System.out.println("kkkkk  "+Collections.frequency(numbers, curr));
			if (segement <= Collections.frequency(numbers, curr)) {
				if (count >= haflOfArray) {
					myList.add(curr);
				}
			}
		}
		System.out.println(myList);

		return null;
	}

}

public class Arrayincrease {

	public static void main(String[] args) {
		Solution11 s = new Solution11();
		int[] myArr = { 1, 2, 2, 1, 2 };
		// int[] myArr = { 2, 1, 3, 1, 2, 2, 3 };
		// Integer[] myArr = {1};
		int[] output = s.solution(4, 2, myArr);
		// int[] output = s.solution(3, 5, myArr);

		System.out.println(Arrays.toString(output));
	}
}