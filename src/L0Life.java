

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L0Life {

	public static void main(String[] args) throws IOException{
		final Scanner sc = new Scanner(new File("life.txt"));
		
		int val;
		while((val = sc.nextInt()) != 42) {
			System.out.println(val);
		}
	}

}
