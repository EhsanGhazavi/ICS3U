package Example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		
		double length, width, height;
		double surfaceArea;
		
		System.out.print("Please enter the length: ");
		length = in.nextDouble();
		
		System.out.print("Please enter the width: ");
		width = in.nextDouble();
		
		System.out.print("Please enter the height: ");
		height = in.nextDouble();
		
		surfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * height);
		
		System.out.println("The surface area of a box with (width, length, height) of (" + width + ", " + length + ", "+ height + ") is "  + surfaceArea);
		
		
		}

}
