package com.bayviewglen.dayone;

import java.util.Scanner;

public class Exampleone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("The length of the sentence is: " + sentence.length());
		int middleIndex = sentence.length()/2;
		System.out.println("The character in the middle of the sentence is: " + sentence.charAt(middleIndex));
		
		System.out.println("Please enter a word in the sentence: ");
		String word = input.nextLine();
		
		System.out.println("The word" + word + " is located at the index " + sentence.indexOf(word) + " of the sentence. ");
		
		input.close(); 
		
		
		
	}

}
