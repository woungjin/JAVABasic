package Quiz_.for_;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// Q33의 문제도 랜덤으로 나오도록 
		
		String[] calc = {"+","-","*","/"};

		Scanner sc= new Scanner(System.in);
		
		int sum = 0 , win = 0 , di= 0;
		while(true) {
			int calcIndex = (int) (Math.random()*calc.length);
			int rd1 = (int) (Math.random()*100+1);
			int rd2 = (int) (Math.random()*100+1);
			System.out.println(rd1 + calc[calcIndex] + rd2 + " = ? ");
			
			System.out.println("0 = stop : ");
			int input = sc.nextInt();
						
			switch (calcIndex) {
			case 0:
				sum = rd1+rd2;
				break;
			case 1:
				sum = rd1 - rd2;
				break;
			case 2:
				sum = rd1*rd2;
				break;
			case 3:
				sum = rd1/rd2;
				break;
			default:
				System.out.println("에러발생");
			}
			
			if(input == 0 ) {
				System.out.println("종료합니다");
				break;
			} else if (input ==sum) {
				System.out.println("정답");
				win++;
			} else {
				System.out.println("틀림...");				di++;
			} 
			
		}
		System.out.println("정답 : " + win);
		System.out.println("틀림 : " + di);

		
		
		
		
	}

}
