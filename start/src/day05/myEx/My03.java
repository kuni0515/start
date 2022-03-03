package day05.myEx;

public class My03 {

	public static void main(String[] args) {
		int getUp = (int)(Math.random()*4)+6;
		
		System.out.println("현재시간은? " + getUp + "시\n");
		System.out.println("지금은? " + getUp + "시입니다.");
		
		switch(getUp) {
		case 6: System.out.println("아직 새벽입니다.");
			break;
		case 7: System.out.println("일어날 시간이에요");
			break;
		case 8: System.out.println("당장 일어나세요");
			break;
		
		default : System.out.println("이미 늦었습니다.");
			break;
		
		}
	}
}
