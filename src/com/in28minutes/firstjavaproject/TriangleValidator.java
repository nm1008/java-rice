package com.in28minutes.firstjavaproject;

public class TriangleValidator {
	void isValidTriangle(int angle1, int angle2, int angle3) {
		int triangle = 180;

		if (triangle == angle1 + angle2 + angle3) {
			System.out.println("valid triangle");
			System.out.println(true);
		} else {
			System.out.println("not valid triangle");
			System.out.println(false);
		}
	}
}
