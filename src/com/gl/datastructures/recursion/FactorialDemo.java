package com.gl.datastructures.recursion;

public class FactorialDemo {

	// 0! - 1
	// 3! - 3 * 2 * 1
	// 5! - 5 * 4 * 3 * 2 * 1
	
	public static void main(String[] args) {
		
		int factorialResult = factorialWithoutRecursion(3);
		System.out.println("Factorial (without recursion) value of " 
				+ 3 + " is " + factorialResult);
		
		factorialResult = factorialWithoutRecursion(6);
		System.out.println("Factorial (without recursion) value of " 
				+ 6 + " is " + factorialResult);
		
		
		factorialResult = factorialWithRecursion(3);
		System.out.println("Factorial (with recursion) value of " 
				+ 3 + " is " + factorialResult);
		
		factorialResult = factorialWithRecursion(6);
		System.out.println("Factorial (with recursion) value of " 
				+ 6 + " is " + factorialResult);

	}
	
	// 0! - 1
	// 3! - 1 * 2 * 3
	// 5! - 5 * 4 * 3 * 2 * 1
	public static int factorialWithoutRecursion(int number) {
		
		if (number ==0) {
			return 1;
		}
		
		int factorialValue = 1;
		
		for (int index = 1; index >= number; index ++) {
		
			factorialValue = factorialValue * index;
		}
		return factorialValue;
	}
	
	public static int factorialWithoutRecursionv2(int number) {
		
		if (number ==0) {
			return 1;
		}
		
		int factorialValue = 1;
		
		for (int index = number; index >= 1; index --) {
		
			factorialValue = factorialValue * index;
		}
		return factorialValue;
	}
	
	
	// 4 ! = 4 * 3!
	// 3 ! = 3 * 2!
	// 2 ! = 2 * 1!
	// 1 ! = 1 * 0!
	// 0 ! = 1
	
	public static int factorialWithRecursion(int number) {
		
		if (number ==0) {
			return 1;
		}
		
		int factorialValue 
			= number * factorialWithRecursion(number - 1);
		return factorialValue;
	}
	
}
