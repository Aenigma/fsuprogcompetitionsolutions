package edu.frostburg.pc2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L1Emirp {

	static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < Math.ceil(Math.sqrt(num)); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	static boolean isPrimeR(int num) {
		return isPrime(Integer.parseInt(reverseString("" + num)));
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("emirp.txt"));

		int numInputs = sc.nextInt();

		for (int i = 0; i < numInputs; i++) {
			int prime = sc.nextInt();

			while (!isPrime(prime) || !isPrimeR(prime)) {
				prime++;
			}

			System.out.print(prime);
			if (i != numInputs - 1) {
				System.out.print(" ");
			}
		}
	}

}
