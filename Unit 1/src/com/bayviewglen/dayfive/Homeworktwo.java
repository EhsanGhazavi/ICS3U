package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Homeworktwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
	int studentMark, testTotal;
	
	System.out.print("Enter the mark the student got: ");
	studentMark = scanner.nextInt();
	
	System.out.print("Enter the mark the test is out of: ");
	testTotal = scanner.nextInt();
	
	double testPercentage = ((double)studentMark/(double)testTotal) *100;
	
	System.out.println("The student got a percentage of: " +(int)(testPercentage));
	
	
	
	
	}

}
