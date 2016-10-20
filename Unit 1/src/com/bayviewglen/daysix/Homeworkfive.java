package com.bayviewglen.daysix;

public class Homeworkfive {

	public static void main(String[] args) {
		int wins = 110;
		int losses = 44;
		
		double winningPercentage = (double)wins / (wins + losses);
		double winningPercentageRounded = (int)(winningPercentage * 1000)/1000.0;
		
		System.out.println("The 1927 New York Yankees had a winning percentage of " + winningPercentageRounded);

	}

}
