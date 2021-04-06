package Quiz02.quiz20_Exception;

import java.util.Scanner;

public class Calculator {

	/* 

	 	1. 정수 2개 입력받기
	 	2. 입력한 값이 정수라면 합계 반환
	 	3. 예외가 발생할 수 있는 상황이라면 메소드를 종료하고 예외메시지 전달 
	 	4. scan.close()  또한 적절하게 처리	 	
	 */

	public int input() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력 : ");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			return a+b;
		} catch (Exception e) {
			throw new Exception("정수로만 입력해 주세요");
		} finally {
			sc.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		try {
			int a = c.input();
			System.out.println("두 정수의 합 : " + a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		
	} 

}
 
