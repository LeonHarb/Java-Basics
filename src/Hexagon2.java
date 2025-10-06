//Assignment 1: Hexagon using Dialog Boxes Input Method Challenge #10 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
import java.lang.Math; 

public class Hexagon2 {

	public static void main(String[] args) {
		String input; 
		input = JOptionPane.showInputDialog("Enter the side length of your hexagon"); 
		double sideLength = Double.parseDouble(input); 
		
		double perimeter = 6 * sideLength; 
		double area = (3 * Math.sqrt(3))/2 * Math.pow(sideLength,  2); 
		
		JOptionPane.showMessageDialog(null, "The perimeter of your hexagon is " + perimeter + "\n" + 
		"The area of your hexagon is " + area);
		
		System.exit(0); 

	}

}
