package Quiz_.for_;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int win=0, di=0;
		while(true) {
			int rd1 = (int) (Math.random()*100+1);
			int rd2 = (int) (Math.random()*100+1);
			int sum =rd1+rd2;
			System.out.printf("%d + %d = ?\n",rd1,rd2);
			
			System.out.println("0 : STOP > ");
			int input = sc.nextInt();
			
			if(input == sum) {
				win++;
				System.out.println("정답!");
			}
			else if(input == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				di++;
				System.out.println(" 틀림 ");
			}
			
			System.out.println("------------");
			
		}
			System.out.println("정답 횟수 : "+ win);
			System.out.println("틀린 횟수 : "+ di);

	}

}
