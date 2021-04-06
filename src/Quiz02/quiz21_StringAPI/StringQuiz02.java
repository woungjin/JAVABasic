package Quiz02.quiz21_StringAPI;

import java.util.Scanner;

import Quiz02.quiz06_over.a;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민번호 13자리를 입력받습니다. 2. 주민번호는 -를 포함해서 받을 수 있습니다. 3. 13자리가 아니라면 다시 입력받습니다. 4.
		 * 남자인지 여자인지 구분해서 출력해주면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("주민번호 13자리 입력 '-' 포함 ");
			String num = sc.next();

			if (num.replace("-", "").length() < 13) {
				System.out.println("다시 입력");
			} else {
				if (num.charAt(7) == '1' || num.charAt(7) == '3' ) {
					System.out.println("남자 \n" + num);
					break;
				} else {
					System.out.println("여자 \n" + num);
					break;
				}
			}

		}
	} 
}
