package day03.ex;
/*
 	1년은 365.2426 일이다
 	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 	
 	힌트]
 		365.2426일은 단위가 일 단위이다.
 		하루는 24시간이다.
 		따라서 0.5일은 12시간을 의미한다.
 		
 	출력값예상
 		1년은 365일 x시간 x분 x초 입니다.
 		
 		그럼 1년은 365일 먼저 나온거고...
 		0.2426일이 나머지인거...
 		나머지 값을 몇시간인지 환산을 하고...또
 		나머지 값을 몇분인지..
 		나머지 값을 몇초인지..
 		
 		계산식을 만들고
 		출력하면 될것 같다...
 */
public class Ex04 {
	public static void main(String[] args) {
		
		// 변수선언을 우선적으로 하자
		double total = 365.2426;
		//double tmp = total;
		double exday = 0.2426;
		
		double day = total - exday;
		
		float test1 = (float)total % 365;
		//System.out.println("test1 : " + test1);
		
		double hour = test1*24;
		
		//System.out.println("hour : " + hour);

		double min = hour*60;
		//double hour2 = exday*24;
		
		double sec = min*60;
		
		System.out.println("1년은 : " + day);
		System.out.println("시간 : " + hour);
		System.out.println("분 : " + min);
		System.out.println("초 : " + sec );
		System.out.println("입니다.");
	}
}