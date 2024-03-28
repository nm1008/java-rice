package com.in28minutes.firstjavaproject;

public class SumOfSquares {
	void calculateSumOfSquares(int n) {
		if (n < 0) {
			System.out.println("-1");

		}

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println(sum);
			sum += n * n;
		}
		System.out.println(sum);
	}
}
