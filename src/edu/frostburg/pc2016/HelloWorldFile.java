package edu.frostburg.pc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorldFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("Hello.txt"));

		String message = sc.nextLine();

		System.out.printf("%s%n", message);

	}

}
