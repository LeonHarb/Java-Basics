//Assignment 1: ComputeBMI Challenge #8 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
import java.lang.Math;

public class ComputeBMI {

	public static void main(String[] args) {
		String input; 
		input = JOptionPane.showInputDialog("Enter your weight in pounds");
		double weightInPounds = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter your height in inches");
		double heightInInches = Double.parseDouble(input);
		
		double weightInKilograms = 0.45359237 * weightInPounds; 
		double heightInMeters = 0.0254 * heightInInches; 
		
		double bodyMassIndex = weightInKilograms / Math.pow(heightInMeters,  2);
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bodyMassIndex);
		
		System.exit(0);

	}

}
