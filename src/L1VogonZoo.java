import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class L1VogonZoo {

	static int maxIndex(int[] arr, int compared) {
		if (arr.length == 0)
			return -1;

		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max && arr[i] < compared) {
				max = arr[i];
				maxIndex = i;
			}
		}

		if (max >= compared) {
			return -1;
		}

		return maxIndex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("vogonzoo.txt"));

		final int numInputs = sc.nextInt();
		final int threshold = sc.nextInt();

		final int[] data = new int[numInputs];

		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		int max = maxIndex(data, Integer.MAX_VALUE);

		Set<Integer> set = new HashSet<>();

		while (maxIndex(data, data[max] - threshold) != -1) {
			set.add(data[max]);
			max = maxIndex(data, data[max] - threshold);
			set.add(data[max]);
		}

		System.out.println(set.size());

	}

}
