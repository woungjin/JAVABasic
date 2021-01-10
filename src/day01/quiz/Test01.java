package day01.quiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


//
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		int sum=0;
		for (int i=2;i<=num;i++) {
			int count=1;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=i;
			}
		}
		System.out.println(sum);


	}

}
