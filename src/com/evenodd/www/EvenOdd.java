package com.evenodd.www;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check wether a no. is even/odd:");
		int num = scanner.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}
}
