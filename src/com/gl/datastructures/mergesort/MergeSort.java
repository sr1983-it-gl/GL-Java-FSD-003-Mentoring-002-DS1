package com.gl.datastructures.mergesort;

import com.gl.datastructures.common.DataStructureUtils;

public class MergeSort {

	// {3, 10, 2, 18, 9, 42, 1}
	
	// {3}, {10}, {2}, {18}, {9}, {42}, {1}
	public static void mergeSort(int [] array, 
		int startIndex, int endIndex) {

		if (startIndex < endIndex) {

			// MidPointIndex = (0 + 6) / 2 = 3
			int midPointIndex = (startIndex + endIndex) / 2;
			
			// [0, 3]
			mergeSort(array, startIndex, midPointIndex);
			
			// [4, 6]
			mergeSort(array, (midPointIndex + 1), endIndex);
		
			// merge / accumulation
			accumulate(array, startIndex, midPointIndex, endIndex);			
		}		
	}
	
	
	private static void accumulate(int [] array, int startIndex,
		int midPointIndex, int endIndex) {
		
		// {10, 7, 8} Left Array
		// {3, 2} Right Array
		
		int tempArray[] = new int [endIndex - startIndex + 1];
		
		int leftArrayIndex = startIndex;
		int rightArrayIndex = midPointIndex + 1;
		
		int tempArrayIndex = 0;
		
		while (leftArrayIndex <= midPointIndex &&
			rightArrayIndex <= endIndex) {
			
			int leftValue = array[leftArrayIndex];
			int rightValue = array[rightArrayIndex];
			
			if (leftValue <= rightValue) {
				
				tempArray[tempArrayIndex] = leftValue;
				tempArrayIndex ++;
				leftArrayIndex ++;
				
			}else if (leftValue > rightValue) {
				
				tempArray[tempArrayIndex] = rightValue;
				tempArrayIndex ++;
				rightArrayIndex ++;
			}
		}
		
		//
		while (leftArrayIndex <= midPointIndex) {
			
			tempArray[tempArrayIndex] = array[leftArrayIndex];
			tempArrayIndex ++ ;
			leftArrayIndex ++;
		}
		
		while (rightArrayIndex <= endIndex) {
			
			tempArray[tempArrayIndex] =array[rightArrayIndex];
			tempArrayIndex ++;
			rightArrayIndex ++;
		}
		
		// 
		for (leftArrayIndex = startIndex; leftArrayIndex <= endIndex;
			leftArrayIndex ++) {
			
			int tempArrayIndex2 = leftArrayIndex - startIndex;
			array[leftArrayIndex] = tempArray[tempArrayIndex2];
		}
	}

	// {3, 10, 2, 18, 9, 42, 1}
	public static void mergeSortv2(int [] array, 
		int startIndex, int endIndex) {

		// MidPointIndex = (0 + 6) / 2 = 3
		int midPointIndex = (startIndex + endIndex) / 2;
		
		// [0, 3]
		mergeSort(array, startIndex, (midPointIndex - 1));
		
		// [4, 6]
		mergeSort(array, midPointIndex, endIndex);
	}

	public static void main(String[] args) {
		
		int [] array = DataStructureUtils.generateRandomArray(10);
		
		DataStructureUtils.print(array);
		
		MergeSort.mergeSort(array, 0, (array.length - 1));
		DataStructureUtils.print(array);		
	}
}
