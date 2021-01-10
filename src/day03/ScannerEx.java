package day03;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);

		// 2. 스캐너가 가지고 있는 입력기능을 사용해서
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("신장 : ");
		double cm = sc.nextDouble();

		System.out.println("자기소개 : ");
		String intro = sc.nextLine();

		System.out.println("이름" + name + ", 나이 " + age + ", 신장 " + cm);
		System.out.println("자기소개  : " + intro);
		
		sc.close();
	}
}
