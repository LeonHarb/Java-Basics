//Assignment 1: FindAverage Challenge #5 by Leon Harb

package challenges;

import java.util.Scanner;
public class FindAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter a number");
		double num1 = input.nextDouble();
		System.out.println("Please ener another number");
		double num2 = input.nextDouble();
		System.out.println("Please ener another number");
		double num3 = input.nextDouble();
		
		double average = (num1 + num2 + num3)/3;
		System.out.println("The average of " + num1 + " and " + num2 + " and " + num3 + " is " + average);
		
		input.close();
	}

}
