package com.practice;

import java.util.Scanner;

public class Binaryrepresation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//String toCalculate = Integer.toBinaryString(input);
		// String toCalculate = "10011001";
		int ans = findBinaryGap(input);
		sc.close();
	}

	private static int findBinaryGap(int N) {
		String toCalculate = Integer.toBinaryString(N);
		int count = 0;
		int max = 0;
		boolean one_flag = false;
		for (int i = 0; i < toCalculate.length(); i++) {
			if (toCalculate.charAt(i) == '1') {
				one_flag = true;
				if (i < (toCalculate.length() - 1) && toCalculate.charAt(i + 1) == '1') {
					one_flag = false;
					continue;
				}
				count = count + 1;
				if (max < count)
					max = count;
				count = 0;
			} else {
				if (one_flag == true) {
					count = count + 1;
				}
			}
		}
		return (max - 1);
	}
}
