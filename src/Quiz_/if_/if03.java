package Quiz_.if_;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 :");
		int a = sc.nextInt();
		if (a > 0 && a != 0) {
			if (a % 2 == 0) {
				System.out.println(a + "은(는) 짝수 입니다");
			} else {
				System.out.println(a + "홀수입니다 ");
			}
		} else if (a < 0) {
			System.out.println(a + "은(는) 음의 정수입니다");
		} else {
			System.out.println("입력한 정수는 0입니다.");
		}

		sc.close();
	}

}
