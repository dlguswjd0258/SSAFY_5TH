package startcamp;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt(); // 공백 또는 엔터를 기준으로 int 데이터 한 개를 입력 받음
		
		switch (time) {
		case 9:
		case 10:
		case 11:
			System.out.println("오전 수업 시간입니다.");
			break;
		case 12:
			System.out.println("점심 시간입니다.");
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			System.out.println("오후 수업 시간입니다.");
			break;

		default:
			System.out.println("자유 시간입니다.");
			break;
		}
	}

}
