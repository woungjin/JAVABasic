package Quiz_.for_;

import java.util.Scanner;

public class MultiFor4 {

	public static void main(String[] args) {

		// 1. 가로 세로길이 입력받기
		// 2. 사각형을 출력
		// 3. 단 윤곽만 나타나도록
		// 4. 첫행 마지막 행에 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		int n1 = sc.nextInt();

		System.out.print("세로 : ");
		int n2 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			if(i==0 || i == n1-1) {
				for(int j = 0; j <n2; j++) {
					System.out.print("*");
				}

			}
			else {
				for(int j = 0 ; j <n2; j++) {
					if(j==0 || j==n2-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
