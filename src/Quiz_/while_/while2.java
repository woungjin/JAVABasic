package Quiz_.while_;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		
		int j = 2;
		
		while(n % j !=0) {
			
			j++;
			
		}
		if(n == j ) {
			System.out.println("소수");
		} else if(n==1) {
			System.out.println("소수 x");
		} else {
			System.out.println("소수 x");
		}
		
	}

}
