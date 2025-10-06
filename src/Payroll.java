//Assignment 1: Payroll Challenge #4 by Leon Harb

package challenges;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("How many hours did you work last week?");
		int hours = input.nextInt();
		System.out.println("You worked " + hours + " hours");
		
		System.out.println("What is your hourly pay rate?");
		double rate = input.nextDouble();
		System.out.println("Your hourly pay rate is " + rate + " dollars");
		
		double grossPayment = hours * rate; 
		System.out.println("Hello " + name + ", your weekly gross payment is $" + grossPayment); 
		
		input.close();
	}

}
