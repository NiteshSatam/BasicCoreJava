package com.javabasic.programs;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter to check whether Alphabet is Vowel or Consonant");
		char alphabet = scanner.next().charAt(0);

		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
			System.out.println("Entered alphabet " + alphabet + " is Vowel");
		else if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
			System.out.println("Entered alphabet " + alphabet + " is Vowel");
		else
			System.out.println("Entered alphabet " + alphabet + " is consonant");
	}

}
