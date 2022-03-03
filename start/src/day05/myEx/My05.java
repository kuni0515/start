package day05.myEx;

/*
 	게임등수에 따라 1등은 tv / 2등은 설거지 if~else 를 사용해서 코드를 완성하세요
 */
import java.util.Scanner;

public class My05 {

	public static void main(String[] args) {
		// 입력받을 준비하기
		Scanner sc = new Scanner(System.in);
		// 물어보는 메세지 출력하기
		System.out.print("몇 등인가요? : ");
		// 입력받은 정수(1or2)를 변수(no)에 기억시키기
		int no = sc.nextInt();
		// 1등인지 2등인지의 변수를 받은 정수를 판별하는 for문 작성하기
		if(no==1) {
			System.out.print("TV를 보며 편하게 쉬세요.");
		}else {
			System.out.print("설거지 당첨!");	
		}
	}
}
