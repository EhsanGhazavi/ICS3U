package com.bayviewglen.daytwo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {
	
	public static final int SECONDS_PER_MINUTE = 60;

	public static void main(String[] args) {	
		Scanner keyboard = new Scanner (System.in);

		//Runner 1 Information
		System.out.print("Please enter your first and last name: "); 
		String runner1 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner1 + ", please enter your time for mile one: ");
		String runner1Mile1 = keyboard.nextLine();
		System.out.print(runner1 + ", please enter your time to the end of the second mile: ");
		String runner1Mile2 = keyboard.nextLine();
		System.out.print(runner1 + ", please enter your total time to complete your 5km run: ");
		String runner1TotalTime = keyboard.nextLine();
		
		//Runner 1 Splits Conversion
		double runner1Split1 = convertToSeconds(runner1Mile1);
		double runner1Split2 = convertToSeconds(runner1Mile2) - runner1Split1;
		double runner1Split3 = convertToSeconds(runner1TotalTime) - (runner1Split1 + runner1Split2);
		
		//Format Runner 1 Splits
		int runner1Split1Min = (int) runner1Split1 / SECONDS_PER_MINUTE;
		String runner1Split1Sec = numberFormat(runner1Split1 % SECONDS_PER_MINUTE);
		int runner1Split2Min = (int) runner1Split2 / SECONDS_PER_MINUTE;
		String runner1Split2Sec = numberFormat(runner1Split2 % SECONDS_PER_MINUTE);
		int runner1Split3Min = (int) runner1Split3 / SECONDS_PER_MINUTE;
		String runner1Split3Sec = numberFormat (runner1Split3 % SECONDS_PER_MINUTE);
		int runner1TimeMin = (int) (runner1Split1 + runner1Split2 + runner1Split3) / SECONDS_PER_MINUTE;
		String runner1TimeSec = numberFormat((runner1Split1 + runner1Split2 + runner1Split3)% SECONDS_PER_MINUTE);
		System.out.println("/n");
		
		//Runner 1 Summary
		System.out.println("runner1 summary");
		System.out.println("Time for first mile: " + runner1Mile1);
		System.out.println("Time for second mile: " + runner1Mile2);
		System.out.println("Time for total: " + runner1TotalTime);
		System.out.println("/n");
		
		//Runner 2 Information
		System.out.print("Please enter your first and last name: "); 
		String runner2 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner2 + ", please enter your timne for mile one: ");
		String runner2Mile1 = keyboard.nextLine();
		System.out.print(runner2 + ", please enter your time to the end of the second mile: ");
		String runner2Mile2 = keyboard.nextLine();
		System.out.print(runner2 + ", please enter your total time to complete your 5km run: ");
		String runner2TotalTime = keyboard.nextLine();
		
		//Runner 2 Splits Conversion
		double runner2Split1 = convertToSeconds(runner2Mile1);
		double runner2Split2 = convertToSeconds(runner2Mile2) - runner2Split1;
		double runner2Split3 = convertToSeconds(runner2TotalTime) - (runner2Split1 + runner2Split2);
		
		//Format Runner 2 Splits
		int runner2Split1Min = (int) runner2Split1 % SECONDS_PER_MINUTE;
		String runner2Split1Sec = numberFormat(runner2Split1 % SECONDS_PER_MINUTE);
		int runner2Split2Min = (int) runner2Split2 % SECONDS_PER_MINUTE;
		String runner2Split2Sec = numberFormat(runner2Split2 % SECONDS_PER_MINUTE);
		int runner2Split3Min = (int) runner2Split3 % SECONDS_PER_MINUTE;
		String runner2Split3Sec = numberFormat(runner2Split3 % SECONDS_PER_MINUTE);
		int runner2TimeMin = (int) (runner2Split1 + runner2Split2 + runner2Split3) / SECONDS_PER_MINUTE;
		String runner2TimeSec = numberFormat((runner2Split1 + runner2Split2 + runner2Split3) % SECONDS_PER_MINUTE);
		System.out.println("/n");
		
		//Runner 2 Summary
		System.out.println("runner2 summary");
		System.out.println("Time for first mile: " + runner1Mile1);
		System.out.println("Time for second mile: " + runner1Mile2);
		System.out.println("Time for total: " + runner2TotalTime);
		System.out.println("/n");
		
		//Runner 3 Information
		System.out.print("Please enter your first and last name: "); 
		String runner3 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner3 + ", please enter your timne for mile one: ");
		String runner3Mile1 = keyboard.nextLine();
		System.out.print(runner3 + ", please enter your time to the end of the second mile: ");
		String runner3Mile2 = keyboard.nextLine();
		System.out.print(runner3 + ", please enter your total time to complete your 5km run: ");
		String runner3TotalTime = keyboard.nextLine();
		
		//Runner Splits 3 Conversion
		double runner3Split1 = convertToSeconds(runner3Mile1);
		double runner3Split2 = convertToSeconds(runner3Mile2) - runner3Split1;
		double runner3Split3 = convertToSeconds(runner3TotalTime) - (runner3Split1 + runner3Split2);
		
		//Format Runner 3 Splits
		int runner3Split1Min = (int) runner3Split1 % SECONDS_PER_MINUTE;
		String runner3Split1Sec = numberFormat(runner2Split1 % SECONDS_PER_MINUTE);
		int runner3Split2Min = (int) runner3Split2 % SECONDS_PER_MINUTE;
		String runner3Split2Sec = numberFormat(runner3Split2 % SECONDS_PER_MINUTE);
		int runner3Split3Min = (int) runner3Split3 % SECONDS_PER_MINUTE;
		String runner3Split3Sec = numberFormat(runner3Split3 % SECONDS_PER_MINUTE);
		int runner3TimeMin = (int) (runner3Split1 + runner3Split2 + runner3Split3) / SECONDS_PER_MINUTE;
		String runner3TimeSec = numberFormat((runner3Split1 + runner3Split2 + runner3Split3) % SECONDS_PER_MINUTE);
		System.out.println("/n");
		
		//Runner 3 Summary
		System.out.println("runner3 summary");
		System.out.println("Time for first mile: " + runner3Mile1);
		System.out.println("Time for second mile: " + runner3Mile2);
		System.out.println("Time for total: " + runner3TotalTime);
		System.out.println("/n");
		
		//Runner 4 Information
		System.out.print("Please enter your first and last name: "); 
		String runner4 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner4 + ", please enter your timne for mile one: ");
		String runner4Mile1 = keyboard.nextLine();
		System.out.print(runner4 + ", please enter your time to the end of the second mile: ");
		String runner4Mile2 = keyboard.nextLine();
		System.out.print(runner4 + ", please enter your total time to complete your 5km run: ");
		String runner4TotalTime = keyboard.nextLine();
		
		//Runner 4 Splits Conversion
		double runner4Split1 = convertToSeconds(runner4Mile1);
		double runner4Split2 = convertToSeconds(runner4Mile2) - runner4Split1;
		double runner4Split3 = convertToSeconds(runner4TotalTime) - (runner4Split1 + runner4Split2);
		
		//Format Runner 4 Splits
		int runner4Split1Min = (int) runner4Split1 % SECONDS_PER_MINUTE;
		String runner4Split1Sec = numberFormat(runner4Split1 % SECONDS_PER_MINUTE);
		int runner4Split2Min = (int) runner4Split2 % SECONDS_PER_MINUTE;
		String runner4Split2Sec = numberFormat(runner4Split2 % SECONDS_PER_MINUTE);
		int runner4Split3Min = (int) runner4Split3 % SECONDS_PER_MINUTE;
		String runner4Split3Sec = numberFormat(runner4Split3 % SECONDS_PER_MINUTE);
		int runner4TimeMin = (int) (runner4Split1 + runner4Split2 + runner4Split3) / SECONDS_PER_MINUTE;
		String runner4TimeSec = numberFormat((runner4Split1 + runner4Split2 + runner4Split3) % SECONDS_PER_MINUTE);
		System.out.println("/n");
		
		//Runner 4 Summary
		System.out.println("runner4 summary");
		System.out.println("Time for first mile: " + runner4Mile1);
		System.out.println("Time for second mile: " + runner4Mile2);
		System.out.println("Time for total: " + runner4TotalTime);
		System.out.println("/n");
		
		//Runner 5 Information
		System.out.print("Please enter your first and last name: "); 
		String runner5 = keyboard.nextLine();
		System.out.println("Please enter all times in the format: min:sec.millisec");
		System.out.print( runner5 + ", please enter your timne for mile one: ");
		String runner5Mile1 = keyboard.nextLine();
		System.out.print(runner5 + ", please enter your time to the end of the second mile: ");
		String runner5Mile2 = keyboard.nextLine();
		System.out.print(runner1 + ", please enter your total time to complete your 5km run: ");
		String runner5TotalTime = keyboard.nextLine();
		
		//Runner 5 Splits Conversion
		double runner5Split1 = convertToSeconds(runner5Mile1);
		double runner5Split2 = convertToSeconds(runner5Mile2) - runner5Split1;
		double runner5Split3 = convertToSeconds(runner5TotalTime) - (runner5Split1 + runner5Split2);
		
		//Format Runne 5 Splits
		int runner5Split1Min = (int) runner5Split1 % SECONDS_PER_MINUTE;
		String runner5Split1Sec = numberFormat(runner5Split1 % SECONDS_PER_MINUTE);
		int runner5Split2Min = (int) runner4Split2 % SECONDS_PER_MINUTE;
		String runner5Split2Sec = numberFormat(runner5Split2 % SECONDS_PER_MINUTE);
		int runner5Split3Min = (int) runner5Split3 % SECONDS_PER_MINUTE;
		String runner5Split3Sec = numberFormat(runner5Split3 % SECONDS_PER_MINUTE);
		int runner5TimeMin = (int) (runner5Split1 + runner5Split2 + runner5Split3) / SECONDS_PER_MINUTE;
		String runner5TimeSec = numberFormat((runner5Split1 + runner5Split2 + runner5Split3) % SECONDS_PER_MINUTE);
		System.out.println("/n");
		
		//Runner 5 Summary
		System.out.println("runner5 summary");
		System.out.println("Time for first mile: " + runner5Mile1);
		System.out.println("Time for second mile: " + runner5Mile2);
		System.out.println("Time for total: " + runner5TotalTime);
		System.out.println("/n");
		
		
		//Summary in Chart
		System.out.printf(" -%25s %14s %14s %14s %14s \n", "Runner Name", "Split 1", "Split 2", "Split 3", "Total Time");
		System.out.printf(" -%25s %7d:%06.3f %7d:%06.3f %7d:%06.3f %7d:%06.3f \n", runner1, runner1Split1Min, runner1Split1 % SECONDS_PER_MINUTE, runner1Split2Min, runner1Split2
				% SECONDS_PER_MINUTE, runner1Split3Min, runner1Split3 % SECONDS_PER_MINUTE, runner1TimeMin, (runner1Split1 + runner1Split2 + runner1Split3) % SECONDS_PER_MINUTE);
		System.out.printf(" -%25s %7d:%06.3f %7d:%06.3f %7d:%06.3f %7d:%06.3f \n", runner2, runner2Split1Min, runner2Split1 % SECONDS_PER_MINUTE, runner2Split2Min, runner2Split2
				% SECONDS_PER_MINUTE, runner2Split3Min, runner2Split3 % SECONDS_PER_MINUTE, runner2TimeMin, (runner2Split1 + runner2Split2 + runner2Split3) % SECONDS_PER_MINUTE);
		System.out.printf(" -%25s %7d:%06.3f %7d:%06.3f %7d:%06.3f %7d:%06.3f \n", runner3, runner3Split1Min, runner3Split1 % SECONDS_PER_MINUTE, runner3Split2Min, runner3Split2
				% SECONDS_PER_MINUTE, runner3Split3Min, runner3Split3 % SECONDS_PER_MINUTE, runner3TimeMin, (runner3Split1 + runner3Split2 + runner3Split3) % SECONDS_PER_MINUTE);
		System.out.printf(" -%25s %7d:%06.3f %7d:%06.3f %7d:%06.3f %7d:%06.3f \n", runner4, runner4Split1Min, runner4Split1 % SECONDS_PER_MINUTE, runner4Split2Min, runner4Split2
				% SECONDS_PER_MINUTE, runner4Split3Min, runner4Split3 % SECONDS_PER_MINUTE, runner4TimeMin, (runner4Split1 + runner4Split2 + runner4Split3) % SECONDS_PER_MINUTE);
		System.out.printf(" -%25s %7d:%06.3f %7d:%06.3f %7d:%06.3f %7d:%06.3f \n", runner5, runner5Split1Min, runner5Split1 % SECONDS_PER_MINUTE, runner5Split2Min, runner5Split2
				% SECONDS_PER_MINUTE, runner5Split3Min, runner5Split3 % SECONDS_PER_MINUTE, runner5TimeMin, (runner5Split1 + runner5Split2 + runner5Split3) % SECONDS_PER_MINUTE);

		
		keyboard.close();
		
	}
		
		// to extract runner's first name for prompting
		static String runnerName(String name) {
			int position = name.indexOf(' ');
			String finalName = name.substring(0, position);
			return finalName;
			
		}
		
		
		// to convert splits in to seconds
		static double convertToSeconds(String time) {
			int position = time.indexOf(':');
			String min = time.substring(0, position);
			String sec = time.substring(position + 1);
			int minFinal = Integer.valueOf(min);
			double secFinal = Double.valueOf(sec);
			double finalTime = minFinal * SECONDS_PER_MINUTE + secFinal;
			return finalTime;
			
			
		}
		
		
		// to format all times so that they have only 3 decimal places
		static String numberFormat(double format) {
			DecimalFormat Formatter = new DecimalFormat("00.###");
			return Formatter.format(format);
		
		
	}}

