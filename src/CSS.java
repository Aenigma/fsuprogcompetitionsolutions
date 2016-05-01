import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CSS {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(new File("css.txt"));

		int numInputs = sc.nextInt();
		int numQue = sc.nextInt();
		sc.nextLine();

		Map<Pair<Integer, Integer>, PriorityQueue<Node>> map;
		map = new HashMap<>();

		List<Pair<Pair<Integer, Integer>, Node>> la = new ArrayList<>();

		for (int i = 0; i < numInputs; i++) {
			int first = sc.nextInt();
			int sec = sc.nextInt();

			int val = sc.nextInt();
			int pri = sc.nextInt();

			Pair<Integer, Integer> p = new Pair<>();
			p.t1 = first;
			p.t2 = sec;

			Node n = new Node();
			n.p = pri;
			n.val = val;

			Pair<Pair<Integer, Integer>, Node> pairToAdd = new Pair<CSS.Pair<Integer, Integer>, CSS.Node>();
			pairToAdd.t1 = p;
			pairToAdd.t2 = n;
			la.add(pairToAdd);
		}

		Collections.reverse(la);

		for (Pair<Pair<Integer, Integer>, Node> pairstuff : la) {
			Pair p = pairstuff.t1;
			Node n = pairstuff.t2;

			PriorityQueue<Node> pq = map.get(p);

			if (pq == null) {
				pq = new PriorityQueue<>();
			}

			pq.add(n);

			map.put(p, pq);
		}

		for (int i = 0; i < numQue; i++) {
			int first = sc.nextInt();
			int sec = sc.nextInt();

			Pair<Integer, Integer> p = new Pair<>();
			p.t1 = first;
			p.t2 = sec;

			PriorityQueue<Node> pq = map.get(p);

			if (pq == null) {
				pq = new PriorityQueue<>();
			}

			System.out.println(pq.peek().val);

		}
	}

	static class Node implements Comparable<Node> {
		int p;
		int val;

		@Override
		public int compareTo(Node o) {
			return o.p - this.p;
		}

		@Override
		public String toString() {
			return "Node [p=" + p + ", val=" + val + "]";
		}

	}

	static class Pair<T1, T2> {
		T1 t1;
		T2 t2;

		@Override
		public String toString() {
			return "Pair [t1=" + t1 + ", t2=" + t2 + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((t1 == null) ? 0 : t1.hashCode());
			result = prime * result + ((t2 == null) ? 0 : t2.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (t1 == null) {
				if (other.t1 != null)
					return false;
			} else if (!t1.equals(other.t1))
				return false;
			if (t2 == null) {
				if (other.t2 != null)
					return false;
			} else if (!t2.equals(other.t2))
				return false;
			return true;
		}

	}

}
