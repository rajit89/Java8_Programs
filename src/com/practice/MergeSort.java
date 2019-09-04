package com.practice;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] myArr = {2,4,1,12,8,7,9};
		mergeLeftRight(myArr,0,myArr.length);
		System.out.println(Arrays.toString(myArr)); 
	}
	private static void mergeLeftRight(int[] input, int start, int end) {
		if((end - start) < 2) {
			return;
		}
		int middle = (start + end)/2;
		mergeLeftRight(input,start,middle);
		mergeLeftRight(input,middle,end);
		mergeTwoArray(input,start,middle,end);
	}
	private static void mergeTwoArray(int[] input, int startIndex, int middleIndex, int endIndex) {
		if(input[middleIndex -1] < input[middleIndex])
			return;
		int start = startIndex;
		int middle = middleIndex;
		
		int tempIndex = 0;
		int[] tempArray = new int[endIndex - startIndex];
		
		while(start < middleIndex && middle < endIndex) {
			tempArray[tempIndex++] = input[start] <= input[middle] ? input[start++] : input[middle++];
		}
		System.arraycopy(input, start, input, startIndex + tempIndex, middleIndex - start);
		System.arraycopy(tempArray, 0, input, startIndex, tempIndex);
	}

}
