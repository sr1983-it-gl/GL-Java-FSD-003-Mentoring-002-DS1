package com.gl.datastructures.arrayrotation;

public class ArrayRotationRightSide {

	public static void rotate(int[] array) {
		
		int size = array.length;
		int lastItem = array[size - 1];
		
		for (int index = (size - 1); index > 0; index --) {
			
			int nextElement = array[index - 1];
			int currentPosition = index;
			
			array[currentPosition] = nextElement;
		}
		
		array[0] = lastItem;
	}
}
