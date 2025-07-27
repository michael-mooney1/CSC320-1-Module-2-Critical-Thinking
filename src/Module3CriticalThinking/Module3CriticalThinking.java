package Module3CriticalThinking;

import java.util.ArrayList;
import java.util.Scanner;

public class Module3CriticalThinking {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Setup variables
		ArrayList<Integer> weeklyIncomeList = new ArrayList<Integer>();
		ArrayList<Double> weeklyTaxList = new ArrayList<Double>();
		int weeklyIncome;
		double weeklyTax;
		double totalTax = 0.0;
		double avgWeeklyTax;

		// Get user input for weekly incomes
		while (weeklyIncomeList.size() < 4) {
			System.out.println("Enter your weekly income as a whole number:");
			
			weeklyIncome = scnr.nextInt();
			if (weeklyIncome < 0) {
				System.out.println("Your weekly income needs to be a positive whole number.");
				continue;
			}
			weeklyIncomeList.add(weeklyIncome);
		}
		
		// Calculate each weekly tax amount
		for (int weeklyIncomeItem : weeklyIncomeList) {
			if (weeklyIncomeItem < 500) {
				weeklyTax = weeklyIncomeItem * 0.1;
			} else if (weeklyIncomeItem < 1500) {
				weeklyTax = weeklyIncomeItem * 0.15;
			} else if (weeklyIncomeItem < 2500) {
				weeklyTax = weeklyIncomeItem * 0.2;
			} else {
				weeklyTax = weeklyIncomeItem * 0.3;
			}
			weeklyTaxList.add(weeklyTax);
		}
		
		// Calculate total tax amount
		for (double weeklyTaxItem : weeklyTaxList) {
			totalTax += weeklyTaxItem;
		}
		
		// Calculate average tax amount
		avgWeeklyTax = totalTax / 4;
		
		// Output weekly incomes and tax amounts
		for (int i = 0; i < 4; i++) {
			System.out.println("Week " + (i + 1) + " income: " + weeklyIncomeList.get(i));
			System.out.println("Week " + (i + 1) + " tax: " + weeklyTaxList.get(i));
		}
		
		// Output average weekly tax amount
		System.out.println("The weekly tax on your weekly income is: " + avgWeeklyTax);
	}
}
