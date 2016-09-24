package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewGlenPools {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		int linerCost; 
		int volumeOfPool;
		int amountOfLiner;
		
		int lengthOfPool;
		System.out.println("Please enter the length of the pool: ");
		lengthOfPool = scanner.nextInt();
		
		int widthOfPool;
		System.out.println("Please enter the width of the pool: ");
		widthOfPool = scanner.nextInt();
		
		int depthOfShallowEnd;
		System.out.println("Please enter the depth of the shallow end: ");
		depthOfShallowEnd = scanner.nextInt(); 
				
		int depthOfDeepEnd;
		System.out.println("Please enter the depth of the deep end: ");
		depthOfDeepEnd = scanner.nextInt();
		
		int lengthOfTransitionBetweenShallowAndDeep;
		System.out.println("Please enter the length of the transition between the shallow and deep end: ");
		lengthOfTransitionBetweenShallowAndDeep = scanner.nextInt();
		
		int lengthOfTheShallowEnd;
		System.out.println("Please enter the length of the shallow end: ");
		lengthOfTheShallowEnd = scanner.nextInt();
		
		int linerOne;
		System.out.println("Please enter the price of liner number one: ");
		linerOne = scanner.nextInt();
		
		int linerTwo;
		System.out.println("Please enter the price of liner number two: ");
		linerTwo = scanner.nextInt();
		
		int linerThree;
		System.out.println("Please enter the price of liner number three");
		linerThree = scanner.nextInt();
		
		linerCost = linerOne + linerTwo + linerThree; 
		
		volumeOfPool = ((depthOfDeepEnd - depthOfShallowEnd)*(lengthOfTheShallowEnd + lengthOfTransitionBetweenShallowAndDeep) * widthOfPool) + ((lengthOfTheShallowEnd + lengthOfTransitionBetweenShallowAndDeep) * widthOfPool * depthOfShallowEnd);
		
		amountOfLiner = widthOfPool * (lengthOfTheShallowEnd + lengthOfTransitionBetweenShallowAndDeep) + widthOfPool * depthOfShallowEnd * 2 + (lengthOfTheShallowEnd + lengthOfTransitionBetweenShallowAndDeep) * depthOfShallowEnd * 2 + widthOfPool * (depthOfDeepEnd - depthOfShallowEnd) + (depthOfDeepEnd * lengthOfTransitionBetweenShallowAndDeep); 
		
		System.out.println("The cost of the liners with (linerOne, linerTwo, linerThree) of (" + linerOne + ","+ linerTwo +","+ linerThree +")is" + linerCost);  
		
		System.out.println("The volume of the pool(90%) with (lengthOfPool, widthOfPool, depthOfShallowEnd, depthOfDeepEnd, lengthOfTransitionBetweenShallowAndDeep, lengthOfTheShallowEnd) of (" + lengthOfPool + "," + widthOfPool + "," + depthOfShallowEnd + "," + depthOfDeepEnd + "," + lengthOfTransitionBetweenShallowAndDeep + "," + lengthOfTheShallowEnd + ")is" + volumeOfPool);		
		
		System.out.println("The amount of liners needed with (widthOfPool, lengthOfTheShallowEnd, lengthOfTransitionBetweenShallowAndDeep, depthOfShallowEnd) of (" + widthOfPool + "," + lengthOfTheShallowEnd + "," + lengthOfTransitionBetweenShallowAndDeep + "," + depthOfShallowEnd + ")is" + amountOfLiner);
		
		 scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
