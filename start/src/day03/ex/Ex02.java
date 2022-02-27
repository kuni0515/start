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
/** 할일
// 입력도구준비
 Scanner sc = new Scanner(System.in);
// 입력받기전에 메세지출력
 * System.out.print("반지름 : ");
// 입력받는다. 변수에 기억
 * int rad = sc.nextInt();
// 계산하고
 * double pi = 3.14;
// 원의 넓이 계산 : 숫자데이터의 연산은 항상 큰 데이터 타입으로 결과가 나온다.
 * double area = rad * rad * pi;
// 원의 둘레 계산
 * double arround = 2 * rad * pi;
// 출력하고
System.out.println("반지름 : " + rad);
System.out.println("넓이 : " + area);
System.out.println("둘레 : " + arround);

참고]
	형변환에서 큰 타입의 데이터를 작은타입으로 변환하면
	남는 부분은 버린다.



**/ 