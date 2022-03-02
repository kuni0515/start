package myEx;
/*
 	하나의 정수를 입력받아 2단부터 입력받은 정수의 단까지 출력하시오
 */
import java.util.Scanner;

public class My04 {

	public static void main(String[] args) {
		System.out.print("단을 입력하세요 : ");
		int dan = new Scanner(System.in).nextInt();
		
		for(int i=2; i<= dan; i++) {
			System.out.printf("%d단 ; ", i);
			
			for(int j=i; j<=9; j++) {
				System.out.printf("%d*%d=%d ", i, j, j*i);
			}
			System.out.println();
		}

	}

}
