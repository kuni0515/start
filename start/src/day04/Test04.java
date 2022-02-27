package day04;

import java.util.Scanner;

/*
 	정수를 입력받아서
 	짝수인지 홀수인지를 판별하세요
 	단, 0은 짝수로 간주한다.
 */
public class Test04 {
	public static void main(String[] args) {
		
		// 할일
		
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("정수입력 : ");
		// 입력받고 변수에 기억
		int num = sc.nextInt();
		// 짝수인지 홀수인지 판별
		String result = (num % 2 == 0) ? ("짝수") : ("홀수");
		// 출력
		System.out.println("입력받은 숫자 [" + num + "] 은 ' "+
							result + " '")
		
	}
}
