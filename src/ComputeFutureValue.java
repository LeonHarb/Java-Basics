//Assignment 1: ComputeFutureValue Challenge #6 by Leon Harb

package challenges;

import java.util.Scanner; 
import java.lang.Math; 

public class ComputeFutureValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an investment amount");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter the annual interest rate");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Enter the number of years");
		int numberOfYears = input.nextInt(); //We could make this a double (6 and half years)
		
		double monthlyInterestRate = annualInterestRate/1200;
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		
		
		System.out.println("The future investment value is " + futureInvestmentValue);
		input.close();

	}

}
