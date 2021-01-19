package startcamp;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(입력 받을 대산);	System.in : keyboard로 부터 이벽
		
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();

//		if (time >= 13) {
//			System.out.println("오후 수업 시간입니다.");
//		} else {
//			System.out.println("오후 수업 시간이 아닙니다.");
//		}
		
		if(time >= 9 && time < 12) {
			System.out.println("오전 수업 시간입니다.");
		} else if(time == 12) {
			System.out.println("점심 시간입니다.");
		} else if(time >= 13 && time < 18){
			System.out.println("오후 수업 시간입니다.");
		} else {
			System.out.println("수업 시간이 아닙니다.");
		}
	}

}
