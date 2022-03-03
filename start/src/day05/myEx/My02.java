package day05.myEx;
/*
 	money값이 10000보다 작기 때문에 " 당신은 흙수저입니다." 문구 출력
 */
public class My02 {

	public static void main(String[] args) {
		int money = 15000;
		
		if(money >= 10000) {
			System.out.println("당신은 금수저이군요?");
		} else {
			System.out.println("당신은 흙수저입니다.");
		}
		
	}

}
