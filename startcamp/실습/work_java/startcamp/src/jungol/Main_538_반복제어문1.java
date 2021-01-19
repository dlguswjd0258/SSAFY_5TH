package jungol;

import java.util.Scanner;

public class Main_538_반복제어문1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			System.out.print("number? ");
			n = sc.nextInt();

			if (n == 0) {
				break;
			} else if (n > 0) {
				System.out.println("positive integer");
			} else {
				System.out.println("negative number");
			}

		}
	}

}
