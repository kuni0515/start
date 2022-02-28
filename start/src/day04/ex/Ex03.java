package day04.ex;

/*
문제 3]
	게시물을 게시판에 출력하는데
	하나의 페이지에 게시물을 15개를 출력할 예정이다.
	게시물 수를 랜덤하게 발생시켜서
	게시판의 페이지가 몇페이지가 필요한지를 계산해서
	출력해주는 프로그램을 작성하세요.
	
	참고 ]
		게시물이 없는 경우는 
		게시물이 없는 페이지가 적어도 1페이지는 필요하다.
*/

public class Ex03 {
	public static void main(String[] args) {
		// 랜덤 숫자 발생기
		int no = (int)(Math.random() * (50-1+1)+1);
		// 랜덤 숫자 표시
		System.out.println("랜덤숫자 " + no);
		// 나온 수를 15로 나눈 목 수계산
		int page = ((no % 15) > 0) ? (no / 15+1) : (no / 15);
		System.out.println("필요한 페이지 수는 " + page + " 페이지가 필요합니다.");
	}
}
