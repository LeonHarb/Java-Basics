//Assignment 1: Hexagon using Scanner Input Method Challenge #10 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.lang.Math; 

public class Hexagon1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side length of your hexagon"); 
		double sideLength = input.nextDouble();
		
		double perimeter = 6 * sideLength; 
		double area = (3 * Math.sqrt(3))/2 * Math.pow(sideLength,  2); 
		
		System.out.println("The perimeter of your hexagon is " + perimeter); 
		System.out.print("The area of your hexagon is " + area);
		
		input.close(); 
		
	}

}
