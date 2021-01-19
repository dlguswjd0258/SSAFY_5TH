package jungol;

import java.util.Scanner;

/*
 * 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
 * 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오. 
 * (평균은 반올림하여 소수 첫째자리까지 출력한다.)
 *
 */
public class Main_539_반복제어문1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		int sum = 0, cnt = 0;
		while (true) {
			n = sc.nextInt();
			sum += n;
			cnt++;
			if (n >= 100)
				break;
		}

		System.out.println(sum);
		System.out.printf("%.1f", (double) sum / cnt);
		
//		print() : 엔터 없이 출력, 한개의 데이터만 출력 가능
//		println() : 출력 후 엔터, 한개의 데이터만 출력 가능
//		printf("포맷", , , , , ) : 포맷에 맞는 여러개의 데이터를 출력할 수 있다.
//		   %d : 10진수		%s : 문자열
//		   %c : 문자			%b : 논리
//		   %f : 실수		소수에 대한 자리수 표현 %.자리수f => 반올림된다.
	}

}
