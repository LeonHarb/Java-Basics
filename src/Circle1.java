//Assignment 1: Circle using Scanner Input Method Challenge #9 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.lang.Math; 
public class Circle1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the radius of the circle"); 
		double radius = input.nextDouble();
		
		double diameter = radius * 2; 
		double circumference = 2 * Math.PI * radius; 
		double area = Math.PI * Math.pow(radius, 2); 
		
		System.out.println("The circle's radius is " + radius); 
		System.out.println("The circle's diameter is " + diameter); 
		System.out.println("The circle's circumference is " + circumference); 
		System.out.println("The circle's area is " + area); 
		
		input.close(); 
	}

}
