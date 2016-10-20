package com.bayviewglen.dayfive;

import java.util.Scanner;

public class DayFiveHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double x, y, z;
		System.out.print("Please enter three integers: ");
		
		x = scanner.nextInt(); // Grabs the next integer
		y = scanner.nextInt(); // Grabs the next integer
		z = scanner.nextInt(); // Grabs the next integer
		
		System.out.println("The numbers are: " + x + ", " + y + " and " + z);
		
		double xSquare = x*x;
		double ySquare = y*y;
		double zSquare = z*z;
		
		System.out.println("The squares of the numbers are: " + xSquare + ySquare + zSquare);
	
	}

}
