package com.javabasic.programs;
import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the third number: ");
		int thirdNumber = scanner.nextInt();

		int temp, largest = 0;

		temp = firstNumber > secondNumber ? firstNumber : secondNumber;
		largest = temp > thirdNumber ? temp : thirdNumber;
		System.out.println("Largest number is: " + largest);
	}

}
