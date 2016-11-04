package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssignment2 {

	public static final int SECONDS_PER_MINUTE = 60;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		

		//Runner 1 Information
		System.out.print("Please enter your first and last name: "); 
		String runner1 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner1 + ", please enter your time for mile one: ");
		String runner1Mile1 = keyboard.nextLine();
		
		int colonPos = runner1Mile1.indexOf(':');
		int minutes = Integer.parseInt(runner1Mile1.substring(0,colonPos));
		double seconds = Double.parseDouble(runner1Mile1.substring(colonPos+1));
		double runner1MileOneSec = seconds;
		int runner1MileOneMin = minutes;
		double totalTimeMileOneSec = (minutes*60) + seconds;
		
		
		
		System.out.print(runner1 + ", please enter your time to the end of the second mile: ");
		String runner1Mile2 = keyboard.nextLine();
		colonPos = runner1Mile2.indexOf(':');
		minutes = Integer.parseInt(runner1Mile2.substring(0,colonPos));
		seconds = Double.parseDouble(runner1Mile2.substring(colonPos+1));
		double runner1MileTwoSec = seconds;
		int runner1MileTwoMin = minutes;
		double totalTimeMileTwoSec = (minutes*60) + seconds;
		
		System.out.print(runner1 + ", please enter your total time to complete your 5km run: ");
		String runner1TotalTime = keyboard.nextLine();
		colonPos = runner1TotalTime.indexOf(':');
		minutes = Integer.parseInt(runner1TotalTime.substring(0,colonPos));
		seconds = Double.parseDouble(runner1TotalTime.substring(colonPos+1));
		int runner1FinishMin = minutes;
		double runner1FinishSec = seconds;
		double runner1TotalTimeSec = (minutes*60) + seconds;
		
		
		double runner1Split2TotalSec = totalTimeMileTwoSec - totalTimeMileOneSec;	// correct
		int runner1Split2Min = (int)(runner1Split2TotalSec/60);						// correct
		double runner1Split2Sec = runner1Split2TotalSec - runner1Split2Min * 60;	// correct
		
		
		double runner1Split3Sec = runner1TotalTimeSec - totalTimeMileTwoSec * 60;
		int runner1Split3Min = (int)(runner1FinishMin/60);
		
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner1, runner1MileOneMin, runner1MileOneSec,  runner1MileTwoMin, runner1MileTwoSec, runner1FinishMin, runner1FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner1, runner1MileOneMin, runner1MileOneSec,  runner1MileTwoMin, runner1MileTwoSec, runner1FinishMin, runner1FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner1, runner1MileOneMin, runner1MileOneSec,  runner1MileTwoMin, runner1MileTwoSec, runner1FinishMin, runner1FinishSec);

	       System.out.printf("%-17s%d:%-10.3f%n", "Split Two:", runner1Split2Min, runner1Split2Sec);
	       System.out.printf("%-17s%d:%-10.3f%n", "Split Three:", runner1Split3Min, runner1Split3Sec);

		
	       System.out.println("Runner 1 Summary");
	       System.out.println("Time for first mile: " + runner1Mile1);
	       System.out.println("Time for second mile: " + runner1Mile2);
	       System.out.println("Time for total: " + runner1TotalTime);
		
		
		
		//Runner 2 Information
		System.out.print("Please enter your first and last name: "); 
		String runner2 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner2 + ", please enter your timne for mile one: ");
		
		
		String runner2Mile1 = keyboard.nextLine();
		 colonPos = runner2Mile1.indexOf(':');
		 minutes = Integer.parseInt(runner2Mile1.substring(0,colonPos));
		 seconds = Double.parseDouble(runner2Mile1.substring(colonPos+1));
		double runner2MileOneSec = seconds;
		int runner2MileOneMin = minutes;
		double runner2TotalTimeMileOneSec = (minutes*60) + seconds;
		
		
		System.out.print(runner2 + ", please enter your time to the end of the second mile: ");
		String runner2Mile2 = keyboard.nextLine();
		colonPos = runner2Mile2.indexOf(':');
		minutes = Integer.parseInt(runner2Mile2.substring(0,colonPos));
		seconds = Double.parseDouble(runner2Mile2.substring(colonPos+1));
		double runner2MileTwoSec = seconds;
		int runner2MileTwoMin = minutes;
		double runner2TotalTimeMileTwoSec = (minutes*60) + seconds;
		           
		
		System.out.print(runner2 + ", please enter your total time to complete your 5km run: ");
		String runner2TotalTime = keyboard.nextLine();
		colonPos = runner2Mile1.indexOf(':');
		minutes = Integer.parseInt(runner2TotalTime.substring(0,colonPos));
		seconds = Double.parseDouble(runner2TotalTime.substring(colonPos+1));
		int runner2FinishMin = minutes;
		double runner2FinishSec = seconds;
		double runner2TotalTimeSec = (minutes*60) + seconds;
		
		
		double runner2Split2TotalSec = runner2TotalTimeMileTwoSec - totalTimeMileOneSec;	// correct
		int runner2Split2Min = (int)(runner2Split2TotalSec/60);						// correct
		double runner2Split2Sec = runner2Split2TotalSec - runner2Split2Min * 60;	// correct
		
		
		double runner2Split3Sec = runner2TotalTimeSec - runner2TotalTimeMileTwoSec * 60;
		int runner2Split3Min = (int)(runner2FinishMin/60);
		
		 System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner2, runner2MileOneMin, runner2MileOneSec,  runner2MileTwoMin, runner2MileTwoSec, runner2FinishMin, runner2FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner2, runner2MileOneMin, runner2MileOneSec,  runner2MileTwoMin, runner2MileTwoSec, runner2FinishMin, runner2FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner2, runner2MileOneMin, runner2MileOneSec,  runner2MileTwoMin, runner2MileTwoSec, runner2FinishMin, runner2FinishSec);

	       System.out.printf("%-17s%d:%-10.3f%n", "Split Two:", runner2Split2Min, runner2Split2Sec);
	       System.out.printf("%-17s%d:%-10.3f%n", "Split Three:", runner2Split3Min, runner2Split3Sec);

		
		
		//Runner 3 Information
		System.out.print("Please enter your first and last name: "); 
		String runner3 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner3 + ", please enter your timne for mile one: ");
		String runner3Mile1 = keyboard.nextLine();
		
		
		colonPos = runner3Mile1.indexOf(':');
		 minutes = Integer.parseInt(runner3Mile1.substring(0,colonPos));
		 seconds = Double.parseDouble(runner3Mile1.substring(colonPos+1));
		double runner3MileOneSec = seconds;
		int runner3MileOneMin = minutes;
		double runner3TotalTimeMileOneSec = (minutes*60) + seconds;
		
		
		System.out.print(runner3 + ", please enter your time to the end of the second mile: ");
		String runner3Mile2 = keyboard.nextLine();
		colonPos = runner3Mile2.indexOf(':');
		minutes = Integer.parseInt(runner3Mile2.substring(0,colonPos));
		seconds = Double.parseDouble(runner3Mile2.substring(colonPos+1));
		double runner3MileTwoSec = seconds;
		int runner3MileTwoMin = minutes;
		double runner3TotalTimeMileTwoSec = (minutes*60) + seconds;
		
		
		
		
		System.out.print(runner3 + ", please enter your total time to complete your 5km run: ");
		String runner3TotalTime = keyboard.nextLine();
		colonPos = runner3TotalTime.indexOf(':');
		minutes = Integer.parseInt(runner3TotalTime.substring(0,colonPos));
		seconds = Double.parseDouble(runner3TotalTime.substring(colonPos+1));
		int runner3FinishMin = minutes;
		double runner3FinishSec = seconds;
		double runner3TotalTimeSec = (minutes*60) + seconds;
		
		double runner3Split2TotalSec = runner3TotalTimeMileTwoSec - totalTimeMileOneSec;	// correct
		int runner3Split2Min = (int)(runner3Split2TotalSec/60);						// correct
		double runner3Split2Sec = runner3Split2TotalSec - runner3Split2Min * 60;	// correct
		
		
		double runner3Split3Sec = runner3TotalTimeSec - runner3TotalTimeMileTwoSec * 60;
		int runner3Split3Min = (int)(runner3FinishMin/60);
		
		 System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner3, runner3MileOneMin, runner3MileOneSec,  runner3MileTwoMin, runner3MileTwoSec, runner3FinishMin, runner3FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner3, runner3MileOneMin, runner3MileOneSec,  runner3MileTwoMin, runner3MileTwoSec, runner3FinishMin, runner3FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner3, runner3MileOneMin, runner3MileOneSec,  runner3MileTwoMin, runner3MileTwoSec, runner3FinishMin, runner3FinishSec);

	       System.out.printf("%-17s%d:%-10.3f%n", "Split Two:", runner3Split2Min, runner3Split2Sec);
	       System.out.printf("%-17s%d:%-10.3f%n", "Split Three:", runner3Split3Min, runner3Split3Sec);


		//Runner 4 Information
		System.out.print("Please enter your first and last name: "); 
		String runner4 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner4 + ", please enter your timne for mile one: ");
		String runner4Mile1 = keyboard.nextLine();
		

		colonPos = runner4Mile1.indexOf(':');
		 minutes = Integer.parseInt(runner4Mile1.substring(0,colonPos));
		 seconds = Double.parseDouble(runner4Mile1.substring(colonPos+1));
		double runner4MileOneSec = seconds;
		int runner4MileOneMin = minutes;
		double runner4TotalTimeMileOneSec = (minutes*60) + seconds;
		
		
		System.out.print(runner4 + ", please enter your time to the end of the second mile: ");
		String runner4Mile2 = keyboard.nextLine();
		
		colonPos = runner4Mile2.indexOf(':');
		minutes = Integer.parseInt(runner4Mile2.substring(0,colonPos));
		seconds = Double.parseDouble(runner4Mile2.substring(colonPos+1));
		double runner4MileTwoSec = seconds;
		int runner4MileTwoMin = minutes;
		double runner4TotalTimeMileTwoSec = (minutes*60) + seconds;
		
		
		System.out.print(runner4 + ", please enter your total time to complete your 5km run: ");
		String runner4TotalTime = keyboard.nextLine();
		
		colonPos = runner4TotalTime.indexOf(':');
		minutes = Integer.parseInt(runner4TotalTime.substring(0,colonPos));
		seconds = Double.parseDouble(runner4TotalTime.substring(colonPos+1));
		int runner4FinishMin = minutes;
		double runner4FinishSec = seconds;
		double runner4TotalTimeSec = (minutes*60) + seconds;
		
		double runner4Split2TotalSec = runner4TotalTimeMileTwoSec - totalTimeMileOneSec;	// correct
		int runner4Split2Min = (int)(runner4Split2TotalSec/60);						// correct
		double runner4Split2Sec = runner4Split2TotalSec - runner4Split2Min * 60;	// correct
		
		
		double runner4Split3Sec = runner4TotalTimeSec - runner4TotalTimeMileTwoSec * 60;
		int runner4Split3Min = (int)(runner4FinishMin/60);
		
		 System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner4, runner4MileOneMin, runner4MileOneSec,  runner4MileTwoMin, runner4MileTwoSec, runner4FinishMin, runner4FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner4, runner4MileOneMin, runner4MileOneSec,  runner4MileTwoMin, runner4MileTwoSec, runner4FinishMin, runner4FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner4, runner4MileOneMin, runner4MileOneSec,  runner4MileTwoMin, runner4MileTwoSec, runner4FinishMin, runner4FinishSec);

	       System.out.printf("%-17s%d:%-10.3f%n", "Split Two:", runner4Split2Min, runner4Split2Sec);
	       System.out.printf("%-17s%d:%-10.3f%n", "Split Three:", runner4Split3Min, runner4Split3Sec);

		
		//Runner 5 Information
		System.out.print("Please enter your first and last name: "); 
		String runner5 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner5 + ", please enter your timne for mile one: ");
		String runner5Mile1 = keyboard.nextLine();
		

		colonPos = runner5Mile1.indexOf(':');
		 minutes = Integer.parseInt(runner5Mile1.substring(0,colonPos));
		 seconds = Double.parseDouble(runner5Mile1.substring(colonPos+1));
		double runner5MileOneSec = seconds;
		int runner5MileOneMin = minutes;
		double runner5TotalTimeMileOneSec = (minutes*60) + seconds;
		
		
		System.out.print(runner5 + ", please enter your time to the end of the second mile: ");
		String runner5Mile2 = keyboard.nextLine();
		
		colonPos = runner5Mile2.indexOf(':');
		minutes = Integer.parseInt(runner5Mile2.substring(0,colonPos));
		seconds = Double.parseDouble(runner5Mile2.substring(colonPos+1));
		double runner5MileTwoSec = seconds;
		int runner5MileTwoMin = minutes;
		double runner5TotalTimeMileTwoSec = (minutes*60) + seconds;
		
		
		System.out.print(runner5 + ", please enter your total time to complete your 5km run: ");
		String runner5TotalTime = keyboard.nextLine();
		
		colonPos = runner5TotalTime.indexOf(':');
		minutes = Integer.parseInt(runner5TotalTime.substring(0,colonPos));
		seconds = Double.parseDouble(runner5TotalTime.substring(colonPos+1));
		int runner5FinishMin = minutes;
		double runner5FinishSec = seconds;
		double runner5TotalTimeSec = (minutes*60) + seconds;
		
		double runner5Split2TotalSec = runner5TotalTimeMileTwoSec - totalTimeMileOneSec;	// correct
		int runner5Split2Min = (int)(runner5Split2TotalSec/60);						// correct
		double runner5Split2Sec = runner5Split2TotalSec - runner5Split2Min * 60;	// correct
		
		
		double runner5Split3Sec = runner5TotalTimeSec - runner5TotalTimeMileTwoSec * 60;
		int runner5Split3Min = (int)(runner5FinishMin/60);
		
		 System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner5, runner5MileOneMin, runner5MileOneSec,  runner5MileTwoMin, runner5MileTwoSec, runner5FinishMin, runner5FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner5, runner5MileOneMin, runner5MileOneSec,  runner5MileTwoMin, runner5MileTwoSec, runner5FinishMin, runner5FinishSec);
	       System.out.printf("%-20s%5d:%.3f%5d:%.3f%5d:%.3f\n",runner5, runner5MileOneMin, runner5MileOneSec,  runner5MileTwoMin, runner5MileTwoSec, runner5FinishMin, runner5FinishSec);

	       System.out.printf("%-17s%d:%-10.3f%n", "Split Two:", runner5Split2Min, runner5Split2Sec);
	       System.out.printf("%-17s%d:%-10.3f%n", "Split Three:", runner5Split3Min, runner5Split3Sec);
		

	       keyboard.close();
	}

}
