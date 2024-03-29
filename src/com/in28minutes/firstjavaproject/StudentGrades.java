package com.in28minutes.firstjavaproject;

public class StudentGrades {

	private int grade;

	public StudentGrades(int grade) {
		this.grade = grade;
	}

	void start() {
		System.out.println("start");
	}

	public char assignGrade() {
		if (grade < 0 || grade > 100) {
			return 'X';
		}

		if (grade >= 90) {
			return 'A';
		} else if (grade >= 80) {
			return 'B';
		} else if (grade >= 70) {
			return 'C';
		} else if (grade >= 60) {
			return 'D';
		} else if (grade >= 50) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
