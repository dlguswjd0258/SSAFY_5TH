package jungol;

import java.util.Scanner;

public class Main_537_반복제어문1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0, i = 1;
		while(i <= n) {
			sum += i++;
		}
		
		System.out.println(sum);
	}

}
