package com.headortail;

import java.util.Random;

public class HeadOrTail {

	public static void main(String[] args) {
		double noOfTimeFlipCoin = 10;

		int head = 0;
		int tail = 0;
		double percentageOfHead = 0;
		double percentageOfTail = 0;

		for (int i = 0; i < noOfTimeFlipCoin; i++) {
			Random random = new Random();
			int num = random.nextInt(2);
			System.out.println(num);

			if (num > 0.5) {
				System.out.println("HEAD");
				head = head + 1;
			} else {
				System.out.println("TAIL");
				tail = tail + 1;
			}
		}
		System.out.println("No of head= " + head);
		System.out.println("No of tail= " + tail);
		percentageOfHead = head / noOfTimeFlipCoin * 100;
		System.out.println("Percentage of head=" + percentageOfHead + "%");
		percentageOfTail = tail / noOfTimeFlipCoin * 100;
		System.out.println("Percentage of tail=" + percentageOfTail + "%");
	}

}
