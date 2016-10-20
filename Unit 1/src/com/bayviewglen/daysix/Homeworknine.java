package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homeworknine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of items sold: ");
		int numberSold = keyboard.nextInt();
		
		double commisionPerUnit = 0.27;
		double commision = commisionPerUnit * numberSold;
		
		double commisionFormatted = (int)(commision * 100)/100.0;
		
		System.out.println("The total commision for selling " + numberSold + " units is $" + commisionFormatted);
		
		keyboard.close();

	}

}
