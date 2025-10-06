//Assignment 1: Circle using Dialog Boxes Input Method Challenge #9 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
import java.lang.Math; 
public class Circle2 {

	public static void main(String[] args) {
		String input; 
		input = JOptionPane.showInputDialog("Enter the radius of the circle"); 
		double radius = Double.parseDouble(input); 
		
		double diameter = radius * 2; 
		double circumference = 2 * Math.PI * radius; 
		double area = Math.PI * Math.pow(radius, 2); 
		
		//First Option: 1 output message box for all the values
		JOptionPane.showMessageDialog(null, "The Circle's radius is " + radius + "\n" 
		+ "The circle's diameter is " + diameter + "\n" + "The circle's circumference is " + circumference
		+ "\n" + "The circle's area is " + area);
		
		//Second Option: 4 different boxes for each value
		//JOptionPane.showMessageDialog(null, "The Circle's radius is " + radius); 
		//JOptionPane.showMessageDialog(null, "The Circle's diameter is " + diameter);
		//JOptionPane.showMessageDialog(null, "The Circle's circumference is " + circumference);
		//JOptionPane.showMessageDialog(null, "The Circle's area is " + area);
		
		System.exit(0);

	}

}
