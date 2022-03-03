package day05.myEx;
/*
 	1-100까지의 합을 구해보자
 */
public class My01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1 ; i<=100 ; i++) {
			sum = sum + i;
		}
		System.out.println("1-100까지의 합 : " + sum);
	}

}
