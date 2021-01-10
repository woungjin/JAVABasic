package Quiz_.if_;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 첫번쨰 수 입력 :");
		int n1 = sc.nextInt();
		System.out.print("정수 두번쨰 수 입력 :");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1 + "이 큰 수 입니다");
		} else if (n1 == n2) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println(n2 + "이(가) 큰 수 입니다");
		}
		sc.close();
		
	}

}
