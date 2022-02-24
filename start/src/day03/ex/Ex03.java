package day03.ex;

import java.util.Scanner;

/*
	84232원을 지불할려고 한다.
	우리나라 화폐단위로 이금액을 지불하려면
	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
	
	화폐단위
		50000권
		10000권
		5000권
		1000권
		500
		100
		50
		10
		1
 */
public class Ex03 {
	public static void main(String[] args) {
		
		int total = 84232;
		int tmp = total;
		
		int oman = tmp / 50000;
		tmp = tmp % 50000;
		System.out.println("tmp==========="+tmp);
		int man = tmp / 10000;
		tmp = tmp %10000;
		int ochun = tmp / 5000;
		tmp = tmp %5000;
		int chun = tmp / 1000;
		tmp = tmp %1000;
		int obaek = tmp / 500;
		tmp = tmp %500;
		int baek = tmp / 100;
		tmp = tmp %100;
		int oship = tmp / 50;
		tmp = tmp %50;
		int ship = tmp / 10;
		tmp = tmp %10;
		int il = tmp  / 10;
		
		System.out.println("총금액 : " + total + " 원은 ");
		System.out.println("오만원 : " + oman + " 장 ");
		System.out.println("만원 : " + man + " 장 ");
		System.out.println("오천원 : " + ochun + " 장 ");
		System.out.println("천원 : " + chun + " 장 ");
		System.out.println("오백원 : " + obaek + " 장 ");
		System.out.println("백원 : " + baek + " 장 ");
		System.out.println("오십원 : " + oship + " 장 ");
		System.out.println("십원 : " + ship + " 장 ");
		System.out.println("일원 : " + il + " 장 ");
		
	}
}
