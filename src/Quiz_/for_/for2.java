package Quiz_.for_;

import java.util.Scanner;

public class for2 {
		// Alt + shift + R = 동일변수 변경
	public static void main(String[] args) {

		// 1. 7 - 100 까지 정수중 7의 배수를 가로로 출력
		System.out.println("7배수의 값");
		for (int i = 7; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("");

		
		// 2. 1 ~ 100 까지 정수중 12의 배수를 가로로 출력
		System.out.println("12의 배수의 값");
		for (int i = 1; i <= 100; i++) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("");
		
		
		// 3. 1 ~ 200 까지 정수중 9 의 배수의 개수 출력
		int count = 0;
		for (int i = 0; i < 200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수 : " + count);

		
		// 4. 50 ~ 100 까지 두수 사이의 합
		
		count = 0;
		for (int i = 50; i <= 100; i++) {
			count += i;
		}
		System.out.println("50 ~ 100 사이의 합 : " + count);
		
		
		// 5. char를 이용해 A ~ Z 까지 가로로 출력

		for (char i = 65; i < 91; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		// 6. 입력받은 정수 까지 팩토리얼 값 5 ! = 5 x 4 x 3 x 2 x 1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		count = 1;
		for (int i = 1; i <= n; i++) {
			count *= i;
		}
		System.out.println(n + "의 팩토리얼 값 : " + count);
	}
}
