package com.javabasic.programs;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();
		scanner.close();

		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("Swapped numbers are : " + firstNumber + " & " + secondNumber);
	}

}
