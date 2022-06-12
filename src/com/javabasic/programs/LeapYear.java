package com.javabasic.programs;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to check whether it is Leap Year or not:  ");
		int year = scanner.nextInt();

		if (year >= 1000 && year <= 9999) {
			if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0))
				System.out.println("Entered year is Leap Year.");
			else
				System.out.println("Entered year is not a Leap Year.");
		} 
		else
			System.out.println("Please enter year as a Four digit number");
	}
}
