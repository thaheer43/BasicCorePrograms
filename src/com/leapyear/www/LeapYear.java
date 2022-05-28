package com.leapyear.www;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year to find if leap year: ");
		int year = scanner.nextInt();
		if (year > 999 && year < 10000) {
			if (year % 4 == 0)
				System.out.println(year + " is a leap year ");
			else
				System.out.println(year + " is not a leap year ");
		} else
			System.out.println("enter a valid year");
	}
}
