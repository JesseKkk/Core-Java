

import java.util.*;

public class Retirement2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		String input;
		
		do
		{
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			years++;
			
			System.out.printf("After year %d, yor balance is %,.2f%n", years,balance);
			
			System.out.print("Ready to retire?(Y/N)");
			input = in.next();
		}
		while (input.equals("N"));
	}
} 