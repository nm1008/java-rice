package com.in28minutes.firstjavaproject;

public class WeatherAdviser {

	private int temp;

	public WeatherAdviser(int temperature) {
		this.temp = temperature;
	}

	public String Forecast() {
		if (temp <= 0) {
			return "It's freezing! Wear a heavy coat.";
		} else if (temp > 0 && temp < 10) {
			return "It's cold! Bundle up.";
		} else if (temp > 10 && temp < 20) {
			return "It's cool! A light jacket will do";
		} else if (temp > 20) {
			return "It's warm! Enjoy the day";
		}
		return "";
	}

}
