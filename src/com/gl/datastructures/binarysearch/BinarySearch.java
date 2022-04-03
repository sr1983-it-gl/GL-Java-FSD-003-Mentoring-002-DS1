package com.gl.datastructures.binarysearch;

import com.gl.datastructures.common.DataStructureUtils;

public class BinarySearch {

	public static int normalSearch(int[] array, int searchValue) {
		
		for (int index = 0; index < array.length -1; index ++) {
			
			int currentValue = array[index];
			if (currentValue == searchValue) {
				return index;
			}else {
				continue;
			}
		}
		return -1;
	}
	
	// { 9, 11, 20, 21, 24, 30, 34 }
	// Size - 7
	// Search Value - 21
	// Search Value - 11
	// Search Value - 34
	public static int binarySearch(int[] array, int searchValue) {
				
		int startIndex = 0;
		int endIndex = (array.length - 1);
		
		while (startIndex <= endIndex) {
			
			// Mid Point Index = (0 + 6) / 2 = 3		
			// Mid Point Index = (4 + 6) / 2 = 5
			// Mid Point index = (6 + 6) / 2 = 6
			int midPointIndex = (startIndex + endIndex) /2;
			
			// 21
			// 24
			
			// Search Value - 34
			int midPointValue = array[midPointIndex];
			
			if (midPointValue == searchValue) {
				return midPointIndex;
			}else if (midPointValue > searchValue) {
			
				// Which array - Left
				// 21 (MidpointValue) 11 (Search Value)
				endIndex = midPointIndex - 1;
			}else if (midPointValue < searchValue) {
				
				// Which array - Right
				// 21 (Midpoint Value) 34 (Search Value)
				// 21 < 34
				startIndex = midPointIndex + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
			
		int [] array = { 9, 11, 20, 21, 24, 30, 34 };
		
//		int array [] 
//				= DataStructureUtils.generateRandomSortedArray(7);
		DataStructureUtils.print(array);
		
		int index = BinarySearch.binarySearch(array, 21);
		System.out.println("Element " + 21 + " is present at index " 
			+ index);		

		index = BinarySearch.binarySearch(array, 11);
		System.out.println("Element " + 11 + " is present at index " 
			+ index);		

		index = BinarySearch.binarySearch(array, 34);
		System.out.println("Element " + 34 + " is present at index " 
			+ index);		

		index = BinarySearch.binarySearch(array, 9999);
		System.out.println("Element " + 9999 + " is present at index " 
			+ index);		
		
	}
}
