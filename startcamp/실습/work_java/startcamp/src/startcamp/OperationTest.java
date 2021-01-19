package startcamp;

public class OperationTest {

	public static void main(String[] args) {
		// ++ 자동 증가 연산자
		// -- 자동 감소 연산자

		int i = 10;
//		++i;
//		i++;
		int sum = 0;
//		sum = ++i + 10;
		sum = i++ + 10;
		System.out.println("i : " + i + " sum : " + sum);
		
//		bit 연산자	shift << >> >>>
		byte a = 8;	 // 0000 1000  0b - 이진수, 0o - 8진수, 0x - 16진수
//		a << 1 // 0001 0000
		a = -8;
//		a >> 1 // -4 => sign 유지 
//		a >>> 1 // 그냥 앞을 0으로 채움
		System.out.println(a >>> 1);
	}

}
