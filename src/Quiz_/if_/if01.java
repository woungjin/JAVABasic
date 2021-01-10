package Quiz_.if_;

import java.util.Scanner;

public class if01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("키 : ");
		double cm = sc.nextDouble();
		System.out.print("나이 : ");
		int age = sc.nextInt();

		if (cm >= 140 && age >=8) {
			System.out.println("놀이기구 탑승 가능");
		} else {
			System.out.println("놀이기구 탑승 불가능");
		}

		sc.close();
		
	}

}
