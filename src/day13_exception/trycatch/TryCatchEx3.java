package day13_exception.trycatch;

import java.util.Scanner;

public class TryCatchEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println(">");
			int num = sc.nextInt();
			
			System.out.println("입력 결과 : " +num);
			
			} catch (Exception e) {
				System.out.println("숫자로 입력해 주세요 ");
				sc.nextLine(); // 엔터값을 제거하고 다시실행
			}
		}

	}

}
