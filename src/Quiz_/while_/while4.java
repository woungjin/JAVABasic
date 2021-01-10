package Quiz_.while_;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {

		//

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n = 1;
		while (n != 0) {
			System.out.print("정수 입력  : ");
			n = sc.nextInt();
			sum += n;

		}
		System.out.println("합 : " + sum);

		
		sc.close();
	}

}
