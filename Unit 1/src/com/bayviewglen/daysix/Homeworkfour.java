package com.bayviewglen.daysix;

public class Homeworkfour {

	public static void main(String[] args) {
		double lightPerSecond = 3E8;		
		int secondPerMinute = 60;
		int minutesPerHour = 60;
		int hoursPerDay = 24;
		int daysPerYear = 365;
		
		double lightPerYear = secondPerMinute * minutesPerHour * hoursPerDay * daysPerYear * lightPerSecond;
		
		// I have casted lightPerYear as a long because int is too small to handle this.
		System.out.println("In one year light would travel " + (long)lightPerYear + " meters.");
		
		// Left this as a double and it displays as scientific notation.
		System.out.println("In one year light would travel " + lightPerYear + " meters.");

	}

}
