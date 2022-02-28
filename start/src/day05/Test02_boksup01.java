package day05;

/*
 	정수를 입력받아서
 	그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 	단, 0 인경우는 0으로 출력하세요
 
 */

import java.util.*;
public class Test02_boksup01 {

	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력받는거 출력
		System.out.print("정수를 입력하세요 : ");
		// 입력받은거 정수에 기억
		int no = sc.nextInt();
		// 판별
		String result =  "정수";
		
		if(no==0) {
			result = "0";
		}
		if(no !=0 && no % 2 == 0) {
			result = "짝수";
		}
		if(no !=0 && no % 2 != 0) {
			result = "홀수";
		}
		
		// 결과출력
		System.out.println("이숫자는 " + result + "입니다");
		
	}

}
