import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Monkeys {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("monkeys.txt"));

		final int tn = sc.nextInt();

		for (int trial = 0; trial < tn; trial++) {
			final int monkeys = sc.nextInt();
			final int rituals = sc.nextInt();

			Set<Integer>[] si = new HashSet[monkeys];

			// note to self, map - 1
			for (int i = 0; i < monkeys; i++) {
				si[i] = new HashSet<>();
				si[i].add(i);
			}

			for (int i = 0; i < rituals; i++) {
				int m1 = sc.nextInt() - 1;
				int m2 = sc.nextInt() - 1;

				Set<Integer> s1 = si[m1];
				Set<Integer> s2 = si[m2];

				s1.add(m2);
				s2.add(m1);
			}

			Set<Set<Integer>> ss = new HashSet<>();
			Map<Set<Integer>, Integer> map = new HashMap<>();

			for (int i = 0; i < monkeys; i++) {
				ss.add(si[i]);
			}

			for (Set<Integer> seti : ss) {
				map.put(seti, 0);
			}

			for (int i = 0; i < monkeys; i++) {
				int banana = sc.nextInt();

				for (Set<Integer> seti : ss) {
					if (seti.contains(i)) {
						int count = map.get(seti);
						map.put(seti, count + banana);
					}
				}
			}

			int max = Integer.MIN_VALUE;
			
			if(map.size() == 0) {
				System.out.println("0");
				continue;
			}
			for (Map.Entry<Set<Integer>, Integer> ent : map.entrySet()) {
				int val = ent.getValue();
				
				if(val > max) {
					max = val;
				}
			}
			System.out.println(max);
		}

	}

}
