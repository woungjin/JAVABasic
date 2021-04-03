package Quiz_.switch_;

import java.util.Scanner;

public class switch_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1  : ");
		int n1 = sc.nextInt();
		System.out.print("연산을 선택하세요 [+,-,*,/] : ");
		String calc = sc.next();
		System.out.print("정수 2 : ");
		int n2 = sc.nextInt();
		
		int sum =0;
		switch (calc) {
			case "+":
				sum = n1 + n2;
				break;
			case "-":
				sum = n1 - n2;
				break;
			case "*":
				sum = n1*n2;
				break;
			case "/" :
				if(n1 > n2) { 
					sum = n1 / n2;
				} else {
					sum = n2 / n1;
				}
				break; 
			default :
				System.out.println("잘못 입력 하셧습니다");
		}
		System.out.println("결과 값 : " + sum);
		
				
	}

}
