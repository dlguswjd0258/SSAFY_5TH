package jungol;

import java.util.Scanner;

public class Main_528_선택제어문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(num);
		if (num < 0) {
			System.out.println("minus");
		}
	}

}
