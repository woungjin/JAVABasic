package Quiz_.for_;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {

		// 자판기 구매

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 투입해 주세요 : ");
		int money = sc.nextInt();
		System.out.println("남은 금액 : " + money + "원");
		int pay = 400;
		while (true) {
			System.out.println("1.소다 : 400, 2.밀키스 : 500, 3.코카콜라 : 600, 4.잔돈반환 ");
			System.out.print("음료수 선택  : ");
			int menu = sc.nextInt();

			if (money >= pay) {
				switch (menu) {
				case 1:
					System.out.println("소다를 받았습니다");
					pay =400;
					money -= pay;
					break;
				case 2:
					System.out.println("밀키스를 받았습니다");
					pay = 500;
					money -= pay;
					break;
				case 3:
					System.out.println("코카콜라를 받았습니다");
					pay =600;
					money -= pay;
					break;
				default:
					break;
				}
			} else if (menu == 4) {
				System.out.println("잔돈을 반환합니다 : " + money +"원 반환 성공");
				break;
			} else {
				System.out.println("돈이 부족합니다 돈을 다시 넣어주세요");
			}
			System.out.println("남은 금액 : " + money + "원");
			System.out.println("");

		}



	}

}
