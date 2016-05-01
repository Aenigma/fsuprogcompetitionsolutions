import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FriendsNetwork {

	static boolean allNonZero(int[] arr) {
		for (int i : arr) {
			if (i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("friends.txt"));

		int tn = sc.nextInt();

		for (int trial = 0; trial < tn; trial++) {
			int cn = sc.nextInt();

			final int[][] cities = new int[cn][cn];
			final int[] res = new int[cn];

			for (int i = 0; i < cn; i++) {
				for (int j = 0; j < cn; j++) {
					cities[i][j] = sc.nextInt();

					if (i == j) {
						cities[i][j] = 0;
					}

					res[j] += cities[i][j];
				}
			}

			if(allNonZero(res)) {
				System.out.println("Aye");
			} else {
				System.out.println("Nae");
			}
		}
	}

}
