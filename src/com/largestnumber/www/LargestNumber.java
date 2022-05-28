package com.largestnumber.www;

public class LargestNumber {
	public static void main(String[] args) {
		int a = 45, b = 100, c = 11;
		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		else
			System.out.println(c + " is the largest number");
	}
}
