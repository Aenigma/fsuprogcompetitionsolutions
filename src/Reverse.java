import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reverse {

	static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("reverse.txt"));

		int numInputs = sc.nextInt();

		for (int i = 0; i < numInputs; i++) {
			System.out.println(Integer.parseInt(reverseString("" + sc.nextInt())));
		}

	}

}
