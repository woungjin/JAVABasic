package day01.quiz;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true) {
			try {
			int n1 = sc.nextInt();
			System.out.println("정수2개입력");
			int n2 =sc.nextInt();
			sum= n1+n2;
			if(sum == n1+n2) {
				System.out.println(sum);
				break;
			}
			
			} catch (Exception e) {
				System.out.println("정수입력");
				sc.nextLine();
			}
			
		}
		
		
		
	}
}