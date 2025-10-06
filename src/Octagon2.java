//Assignment 1: Octagon using Dialog Boxes Input Method Challenge #11 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
import java.lang.Math; 

public class Octagon2 {

	public static void main(String[] args) {
		String input; 
		input = JOptionPane.showInputDialog("Enter the side length of your octagon"); 
		double sideLength = Double.parseDouble(input); 
		
		double perimeter = 8 * sideLength; 
		double area = 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength,  2); 
		
		JOptionPane.showMessageDialog(null, "The perimeter of your hexagon is " + perimeter + "\n" + 
		"The area of your hexagon is " + area); 
		
		System.exit(0);

	}

}
