package day05;

import java.util.Scanner;

public class cointinue_ {

	public static void main(String[] args) {


		// 소수의 합 
		Scanner sc= new Scanner(System.in);
		System.out.println("수 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		start : for(int i =2 ; i<= n ; i++) {
			int count = 1;
			for(int j = 2; j<=i; j++ ) {
				if(i % j == 0) {
					count++;
				}
				if( count > 2 ) { 
					continue start ;
				}
				
			}
			if(count == 2 ) {
				sum+=i;
			} 
		}
		System.out.println(n+ " 까지의 소수들의 합 : " + sum);
	}

}
 
