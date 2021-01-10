package day04.for_;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
	
		// 정수를 입력받아서 소수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 ");
		int n = sc.nextInt();
		int count = 1;
		for( int i =2 ; i <= n;i++) {
			if(n % i == 0) {
				count++;
		}
		}if(count==2) {
			System.out.println("소");
		} else {
			System.out.println("소수가 아닙니다");
		}
		
		
	}

}
 
