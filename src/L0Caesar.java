import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L0Caesar {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("caes.txt"));

		int numInputs = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numInputs; i++) {
			char[] ca = sc.nextLine().toUpperCase().toCharArray();

			for (int j = 0; j < ca.length; j++) {

				if (Character.isAlphabetic(ca[j])) {
					ca[j] = (char) (((((ca[j] - 'A') - k) % 26 + 26) % 26) + 'A');
				}
			}

			System.out.print(new String(ca) + " ");

		}
	}

}
