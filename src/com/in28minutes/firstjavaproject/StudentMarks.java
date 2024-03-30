package com.in28minutes.firstjavaproject;

public class StudentMarks {

	private String name;
	private int[] listOfMarks;

	// constructor
	public StudentMarks(String name, int[] listOfMarks) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}

	void start() {
		System.out.println("test");
	}

	public int getNumberOfMarks() {
		return listOfMarks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;

		for (int i = 0; i < listOfMarks.length; i++) {
			sum += listOfMarks[i];
		}
		return sum;
	}

	public int getMaxmimumMark() {
		int max = 0;
		for (int i = 0; i < listOfMarks.length; i++) {
			if (max < listOfMarks[i]) {
				max = listOfMarks[i];
			}
		}
		return max;
	}

	public int getMinimumMark() {
		int min = listOfMarks[0];
		for (int i = 0; i < listOfMarks.length; i++) {
			if (min > listOfMarks[i]) {
				min = listOfMarks[i];
			}
		}
		return min;
	}

	public float getAverageMarks() {
		float sum = getTotalSumOfMarks() / getNumberOfMarks();
		return sum;
	}
}
