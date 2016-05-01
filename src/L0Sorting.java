import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class L0Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("sorting.txt"));

		TreeSet<Integer> ts = new TreeSet<>();

		int numInputs = sc.nextInt();

		for (int i = 0; i < numInputs; i++) {
			ts.add(sc.nextInt());
		}

		for (int i : ts) {
			System.out.println(i);
		}
	}
}
