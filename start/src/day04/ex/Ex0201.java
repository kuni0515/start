package day04.ex;

/*
 	1.
 	알파벳을 입력받아서
 	그 문자가 대문자인지 소문자인지를
 	판별하는 프로그램
 	
 	2. 숫자 또는 알파벳을 입력받아서
 	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 
 */

import java.util.*;

public class Ex0201 {
	 public static void main(String[] args) {
		 //입력받고
		 Scanner sc = new Scanner(System.in);
		 //메세지 출력
		 System.out.print("문자입력 : ");
		 // 문자열 받아서 저장
		 String str = sc.nextLine();
		 // 문자열 첫번째 문자 추출
		 char ch = str.charAt(0);
		 		 //대문자 소문자 구별
		 String result = ((char) ch <= 90 ) ? "대문자" : "소문자";
			System.out.println(" 결과 " + result);  
	 }
}
