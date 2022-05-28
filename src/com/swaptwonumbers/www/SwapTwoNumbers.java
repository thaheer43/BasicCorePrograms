package com.swaptwonumbers.www;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int temp = 0;
		System.out.println("Enter the value of 1st and 2nd no. ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("before swapping numbers: num1= " + num1 + " num2=  " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: num1= " + num1 + " num2= " + num2);

	}

}
