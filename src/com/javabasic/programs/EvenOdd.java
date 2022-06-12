package com.javabasic.programs;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check it is even or odd: ");
		int number = scanner.nextInt();

		if (number % 2 == 0)
			System.out.println("Entered number is Even number");
		else
			System.out.println("Enetered number is Odd number");
	}

}
