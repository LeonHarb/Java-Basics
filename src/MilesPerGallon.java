//Assignment 1: MilesPerGallon Challenge #7 by Leon Harb

package challenges;

import javax.swing.JOptionPane; 
public class MilesPerGallon {

	public static void main(String[] args) {
		String input; 
		input = JOptionPane.showInputDialog("Please enter the number of miles driven");
		int milesDriven = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Please enter the gallons of gas used");
		double gallonsOfGasUsed = Double.parseDouble(input); 
		
		double milesPerGallon = milesDriven / gallonsOfGasUsed; 
		
		JOptionPane.showMessageDialog(null, "The miles-per-gallon is " + milesPerGallon);
		
		System.exit(0);
		

	}

}
