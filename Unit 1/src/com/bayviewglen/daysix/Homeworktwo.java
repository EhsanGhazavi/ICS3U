package com.bayviewglen.daysix;

public class Homeworktwo {

	public static void main(String[] args) {
		double length = 4.5;
		double width = 2.3;
		
		double area = length * width;
		double perimeter = 2*length + 2*width;
		
		double areaRounded = (int)(area * 10)/10.0;
		double perimeterRounded = (int)(perimeter * 10)/10.0;
		
		System.out.println("The area is: " + areaRounded);
		System.out.println("The perimeter is: " + perimeterRounded);

	}

}
