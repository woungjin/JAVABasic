package Quiz_.switch_;

import java.util.Scanner;

public class switch_4 {

	public static void main(String[] args) {
		
		// If02와 구문이 동일하게 실행되도록 switch구문으로 변경
		
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int point = sc.nextInt();
		
		
		String avg = null;
		switch (point / 10) {
		case 9:
			if (point >= 95) {
				avg = "A+";
			} else {
				avg = "A";
			}
			break;
		case 8:
			avg = "B";
			break;
		case 7:
			avg = "C";
			break;
		case 6:
			avg = "D";
			break;
		default:
			if(point==100) {
				avg="만점";
				break;
			} else if(point > 100) {
				avg="잘못된 점수입니다";
			} else {
				avg ="F";
			}
		
		}
		System.out.println("학점 : " + avg);
		
		
	}

}
