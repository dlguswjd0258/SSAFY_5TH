package startcamp;

import java.util.Scanner;

public class whileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int i = 1, end = 1 << n;
		while(i <= end) {
			System.out.println(i);
			sum += i;
			i++;
		}
		
		System.out.println(--i + "까지 함: " +sum);
	}

}
