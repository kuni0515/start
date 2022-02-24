package day03.ex;

import java.util.*;
/*
 	문제2]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 		
 		참고]
 			원의 넓이 : 반지름 * 반지름 * 3.14
 			원의 둘레 : 2 * 반지름 * 3.14
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		
		double ban = sc.nextDouble();
		System.out.println("입력한 원의 반지름 : " + ban);
		
		System.out.println("원의넓이 : " + (ban*3.14));
		System.out.println("원의둘레 : " + (2*ban)*3.14);
	}
}
