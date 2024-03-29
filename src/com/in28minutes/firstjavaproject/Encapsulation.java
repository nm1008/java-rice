package com.in28minutes.firstjavaproject;

public class Encapsulation {

	private int speed;
	private String name;

	// constructor
	public Encapsulation(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void start() {
		if (this.speed < 0) {
			System.out.println("Starting, Invalid bike speed");
		}

		System.out.println(this.name + " Bike start");
		System.out.println(this.speed);

	};

	void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
//		this.speed = this.speed + howMuch; //same as decreaseSpeed
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

}
