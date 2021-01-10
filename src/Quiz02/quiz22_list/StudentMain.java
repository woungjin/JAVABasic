package Quiz02.quiz22_list;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		InterPoint ic = new interClass();

		Scanner sc = new Scanner(System.in);

		while (true) {
			InterPoint.menuInfo();
			System.out.print("메뉴를 입력해 주세요 : ");
			int menu = sc.nextInt();
			if (menu == 1) {
				ic.input(list);
			} else if (menu == 2) {
				ic.showAll(list);
			} else if (menu == 3) {
				ic.search(list);
			} else if (menu == 4) {
				ic.modify(list);
			} else if (menu == 5) {
				ic.delete(list);
			} else if (menu == 6) {
				System.out.println("프로그램 종료합니다");
				break;
			} else {
				System.out.println("다시");
			}

		}

	}

}
