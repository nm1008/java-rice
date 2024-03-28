package com.in28minutes.firstjavaproject;

public class ExamResult {
	void isPass(int marks) {
		if (marks > 50) {
			System.out.println("Student has passed the test");
			System.out.println(true);
		} else {
			System.out.println("Student has faileed the test");
			System.out.println(false);
		}
	}
}
