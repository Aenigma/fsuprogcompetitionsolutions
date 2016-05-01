import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

	static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	static String stripped(String s) {
		s = s.toLowerCase();

		s = s.replaceAll("\\s", "");

		s = s.replaceAll("[\\.,!-\\?]", "");

		return s;
	}

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("palin.txt"));

		int numInputs = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numInputs; i++) {
			String orig = sc.nextLine();

			orig = stripped(orig);
			String reversed = reverseString(orig);

			if (orig.equals(reversed)) {
				System.out.print("Y");
			} else {
				System.out.print("N");
			}

			if (i != numInputs - 1) {
				System.out.print(" ");
			}

		}
		System.out.println();
	}

}
