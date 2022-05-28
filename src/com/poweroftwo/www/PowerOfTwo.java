package com.poweroftwo.www;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of power N:");
		int powerN = scanner.nextInt();
		int temp = 2;
		int num = 2;

		for (int i = 1; i <= powerN; i++) {
			temp = num * i;
			System.out.println(num + " ^ " + i + " = " + temp);

		}

	}
}