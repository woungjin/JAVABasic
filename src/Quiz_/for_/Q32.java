package Quiz_.for_;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {

		
		/*
		  	＊ up down
		  	
		  	1. 1~ 100 까지 랜덤숫자 생성
			2. 스캐너를 통해 값을 입력 받아서
			3. 랜덤 수가 입력값보다 작으면 더작은수를 입력하세요
			4. 랜덤수가 입력받은 값보다 크면 더 큰 수를 입력하ㅏ세요
			
			5. 정답이라면 시도 횟수 x 회를 출력하고 종료
			
		
		 */
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int rd = (int) (Math.random()*100 +1);
		while(true) { 
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			count++;
			
			if(rd == input) {
				System.out.println("정답! 횟수 : "+ count);
				break;
			} else if (rd < input) {
				System.out.println("더 작은 수를 입력하세요");
			}  else {
				System.out.println("더 큰 수를 입력하세요");
			}
					
		}

	}

}
