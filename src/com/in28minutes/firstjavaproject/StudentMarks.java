package com.in28minutes.firstjavaproject;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	// constructor
	public StudentMarks(String name, int... listOfMarks) {
		this.name = name;
		for (int mark : listOfMarks) {
			this.marks.add(mark);
		}
	}

	void start() {
		System.out.println("test");
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;

		for (int i = 0; i < marks.size(); i++) {
			sum += marks.get(i);
		}
		return sum;
	}

	public int getMaxmimumMark() {
//		int max = 0;
//		for (int i = 0; i < marks.size(); i++) {
//			if (max < marks.get(i)) {
//				max = marks.get(i);
//			}
//		}
//		return max;

		return Collections.min(marks);
	}

	public int getMinimumMark() {
//		int min = marks.get(0);
//		for (int i = 0; i < marks.size(); i++) {
//			if (min > marks.get(i)) {
//				min = marks.get(i);
//			}
//		}
//		return min;

		return Collections.min(marks);
	}

	public float getAverageMarks() {
		float sum = getTotalSumOfMarks() / getNumberOfMarks();
		return sum;
	}

	public String getStudentMarks() {
		return this.name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

	public void clearStudentMarks() {
		marks.clear();
	}
}
