package day04.ex;

/*
	문제 1 ]
		1  ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그수들중 가장 큰 수만 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요.
 */

public class Ex01 {
	public static void main(String[] args) {

		
		// 랜덤하게 숫자 만들고
		int no1 = (int)(Math.random() * (25-1+1)+1);
		int no2 = (int)(Math.random() * (25-1+1)+1);
		int no3 = (int)(Math.random() * (25-1+1)+1);
		  
		System.out.println("no1----"+no1);
		System.out.println("no2----"+no2);
		System.out.println("no3----"+no3);
		System.out.println("       ");
		
		//숫자 판별하고
		int res1 = (no1 > no2 ? no1 : no2);
		int res2 = (res1 > no3 ? res1 : no3);
		
		//() ? () : (); 형식 만들고 채워나가세요.
		System.out.println("1~25 사이의 랜덤하게 발생된 숫자 " + no1 + "와 " + no2 + "와 " + no3 + "이다 이중 제일 큰수는 " + res2 + "입니다.");
		 
	}

}
