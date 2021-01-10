package Quiz02.quiz20_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다. 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 넘기고 다시
		 * 입력받도록 처리합니다. 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에 다시 입력받도록 처리합니다. 단, 카운트는 처리 됩니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */


		Scanner sc = new Scanner(System.in);

		int correct = (int) (Math.random() * 100 ) +1;

		int count = 0 ;

		while(true) {
			try {
				System.out.println("1~100사이의 값을 입력하세요");
				int answer = sc.nextInt();

				if(answer <1 || answer>100) {
					throw new Exception("1~100사이의 숫자를 입력하세요");
				}
				count++;

				if(correct > answer) {
					System.out.println("더 큰수를 입력하세요");
				} else if (correct < answer) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다 , \n 시도 횟수는 : " + count );
					break;
				}
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요 ");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}






		//		Scanner sc = new Scanner(System.in);
		//		int count = 0;
		//		int num = 0;
		//		while (true) {
		//			int rd = (int) (Math.random() * 2 + 1);
		//			System.out.print("1~100 숫자 입력  : ");
		//
		//			try {
		//				num = sc.nextInt();
		//				count++;
		//				if (num < 1 || num > 100) {
		//					System.out.println();
		//				} else if (rd == num) {
		//					System.out.println("당첨! 횟수 : " + count);
		//					break;
		//				}
		//				System.out.println("꽝!");
		//			
		//
		//			} catch (Exception e) {
		//				System.out.println("숫자만 입력ㅎ해 ");
		//				sc.nextLine();
		//			}
		//
		//		} // while

	} // main
} // Class
