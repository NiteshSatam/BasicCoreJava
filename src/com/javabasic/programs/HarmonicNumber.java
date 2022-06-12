package com.javabasic.programs;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		System.out.println("Enter the length of harmonic number:  ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		double result = 0;

		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				result = result + 1.0 / i;
			}
			System.out.println("The harmonic value is :" + result);
		} else
			System.out.println("Enter the length greater than zero!!");
	}

}
