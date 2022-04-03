package com.gl.datastructures.arrayrotation;

import com.gl.datastructures.common.DataStructureUtils;

public class ArrayRotationLeftSide {

	public static void rotate(int []array, int howManySteps) {
	
//		if (array.length == howManySteps) {
//			return;
//		}
		
		for (int index = 0; index < howManySteps; index ++) {
			rotate(array);
		}
	}
	
	public static void rotate(int []array) {
		
		int size = array.length;
		int firstItem = array[0];
		
		for (int index = 0; index < (size -1); index ++) {
			
			// Take out the next element
			int nextElement = array[index + 1];			
			
			// Put the next element in the current position
			array[index] = nextElement;
		}
		
		// Last Position, place the first item
		array[size - 1] = firstItem;
	}
	
	public static void main(String[] args) {
		
//		int [] array = {1, 8, 19, 35, 43};
		int [] array = DataStructureUtils.generateRandomArray(5);
		DataStructureUtils.print(array);
		
		ArrayRotationLeftSide.rotate(array, 2);
		
		ArrayRotationLeftSide.rotate(array);
		ArrayRotationLeftSide.rotate(array);
		ArrayRotationLeftSide.rotate(array);
		
		
//		ArrayRotation.rotate(array);
		DataStructureUtils.print(array);		
	}
}
