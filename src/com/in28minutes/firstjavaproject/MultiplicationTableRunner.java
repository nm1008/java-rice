package com.in28minutes.firstjavaproject;

public class MultiplicationTableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		SumOfSquares square = new SumOfSquares();
//
//		square.calculateSumOfSquares(2);

//		Binumber numbers = new Binumber(2, 3);
//
//		System.out.println(numbers.add());
//		System.out.println(numbers.multiply());
//
//		numbers.doubleValue();
//
//		System.out.println(numbers.getNumber1());
//		System.out.println(numbers.getNumber2());

//		Encapsulation ducati = new Encapsulation();
//		Encapsulation honda = new Encapsulation();

//		honda.speed(125);
//		honda.start();

//		ducati.start();
//		ducati.setSpeed(250);
//		ducati.start();

//		Encapsulation ducati = new Encapsulation("Ducati");
//		Encapsulation honda = new Encapsulation("Honda");

//		ducati.start();
//		System.out.println(ducati.getName());

//		ducati.start();
//		System.out.println(ducati.getName());
//		ducati.setName("New Ducati");
//		System.out.println(ducati.getName());

//		ducati.setSpeed(1);
//		ducati.increaseSpeed(149);
//		ducati.start();
//		ducati.decreaseSpeed(200);
//		ducati.start();

//		StudentGrades grade = new StudentGrades(39);
//		grade.start();
//
//		System.out.println(grade.assignGrade());

//		char letterGrade = grade.assignGrade();
//		System.out.println("Letter Grade: " + letterGrade);

//		WeatherAdviser temperature = new WeatherAdviser(30);
//
//		System.out.println(temperature.Forecast());

		StudentMarks student = new StudentMarks("Nikko", new int[] { 92, 93, 100 });
		student.start();

		System.out.println("Min grade is: " + student.getMinimumMark());
		System.out.println("Max grade is: " + student.getMaxmimumMark());
		System.out.println("Total sum is: " + student.getTotalSumOfMarks());
		System.out.println("Number of grades: " + student.getNumberOfMarks());
		System.out.println("Total average grade: " + student.getAverageMarks());

	}
}
