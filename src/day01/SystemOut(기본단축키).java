package day01;

public class SystemOut {

	public static void main(String[] args) {

		/* 
		 		1. 실행 단축키 : Ctrl + f11
		 		
		 		2. sysout : Ctrl + space = println()
		 		
		 		3. printf : %s(문자열),%c(단일문자),%d(정수),%f(실수)
		 		
		 		4. 정렬 : Ctrl + a and Ctrl + i
		 		
		 		5. 이름을 동시에 변경  : Alt + shift + r 
		 */
		System.out.println("안녕하세요");
		
		System.out.print("줄바꿈x");
		
		System.out.printf("안녕하세요 제이름은 %s이고 오늘 날짜는 %d월 %d일 입니다\n","길동홍",8,20);
		System.out.printf("파이값 : %.2f입니다",3.14);
		 
	}
}
