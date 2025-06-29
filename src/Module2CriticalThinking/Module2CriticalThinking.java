package Module2CriticalThinking;

import java.util.Scanner;

public class Module2CriticalThinking {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double weeklyTax = 0.0;
		
		System.out.println("Enter your weekly income as a whole number:");
		
		int weeklyIncome = scnr.nextInt();
		
		if (weeklyIncome < 0) {
			System.out.println("Your weekly income needs to be a positive whole number.");
			return;
		} else if (weeklyIncome < 500) {
			weeklyTax = weeklyIncome * 0.1;
		} else if (weeklyIncome < 1500) {
			weeklyTax = weeklyIncome * 0.15;
		} else if (weeklyIncome < 2500) {
			weeklyTax = weeklyIncome * 0.2;
		} else {
			weeklyTax = weeklyIncome * 0.3;
		}
		
		System.out.println("The weekly tax on your weekly income is: " + weeklyTax);
	}
}
