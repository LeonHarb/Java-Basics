//Assignment 1: Octagon using Scanner Input Method Challenge #11 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.lang.Math; 

public class Octagon1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the side length of your octagon"); 
		double sideLength = input.nextDouble(); 

		double perimeter = 8 * sideLength; 
		double area = 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength,  2); 
		
		double number = input.nextInt();
		System.out.println(number);
		System.out.println("The perimeter of your octagon is " + perimeter); 
		System.out.println("The area of your octagon is " + area); 
		
		input.close(); 

	}

}
