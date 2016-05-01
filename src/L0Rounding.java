import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L0Rounding {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("rounding.txt"));

		int numInput = sc.nextInt();

		for (int i = 0; i < numInput; i++) {
			int n = sc.nextInt();
			int d = sc.nextInt();

			double res = ((double) n) / d;

			if (res < 0) {
				System.out.print("-");
			}
			res = Math.abs(res);

			if (res % 1 < .5) {
				System.out.print((int) res);
			} else {
				System.out.print((int) res + 1);
			}

			if (i != numInput - 1) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}

}
