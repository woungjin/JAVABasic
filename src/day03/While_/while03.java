package day03.While_;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		// 입력을 10번 받아서 입력받은 값의합을구한다

		Scanner sc = new Scanner(System.in);

		int i = -1;
		int sum = 0;
		while (i < 9) {
			i++;
			System.out.print(i+1 + "번째 정수 입력 : ");
			int num = sc.nextInt();
			sum+=num;
		}
			System.out.println("합 : " + sum);
	}
}
