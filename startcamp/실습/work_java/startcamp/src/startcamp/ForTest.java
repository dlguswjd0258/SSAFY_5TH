package startcamp;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1, end = 1 << n; i <= end; i++) {
			System.out.println(i);
		}
	}

}
