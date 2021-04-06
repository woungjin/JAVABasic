package Quiz02.quiz21_StringAPI;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 통해서 id를 입력받습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다.
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요.
		 *     5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("id 입력 : ");
			String str = sc.nextLine();
			str = str.replace(" ", "");
			if(str.length() < 5) {
				System.out.println("5글자 미만 다시 입력하세요");
			} else  {
				System.out.println("id가 등록되었습니다 [" + str + "] ");
				break;
			}
			
		
		}
			
		
		
		
 
		
	}
}
