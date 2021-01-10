package Quiz_.switch_;

import java.util.Scanner;

public class switch_1 {

	public static void main(String[] args) {
		
		// quiz 07
		System.out.println("구입할 메뉴는 ?");
		System.out.println("[수박,사과,멜론,포도,귤]");
		System.out.print(": ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		
		switch (menu) {
		case "수박":
			System.out.println("수박의 가격은 2만원 ");
			break;
		case "사과":
			System.out.println(menu+"의 가격은 3만원 ");
			break;
		case "멜론":
			System.out.println("멜론의 가격은 4만원 ");
			break;
		case "포도":
			System.out.println("포도의 가격은 5만원 ");
			break;
		case "귤":
			System.out.println("귤의 가격은 6만원 ");
			break;
		default :
			System.out.println(menu+"는(은) 메뉴에 없습니다. ");
			System.out.println("다시 입력해 주세요 ");
			break;
		}
		
		sc.close();
	}

}
