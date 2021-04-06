package Quiz02.quiz22_list;

import java.util.Scanner;
import java.util.*;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();

		while (true) {
			System.out.println("[ 1. 등록 | 2. 회원정보보기 | 3. 회원정보검색 | 4. 회원정보삭제| 5. 종료 ]");
			System.out.println("메뉴 입력");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 스캐너로 이름, 나이를 받고 User객체에 저장, list추가
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				list.add(new User(name, age));
			} else if (menu == 2) {
				for(User u : list) {
					System.out.println("이름 : " + u.getName());
					System.out.println("나이 : " + u.getAge());
		
				}

			} else if (menu == 3) { 
				System.out.print("찾을 이름 입력 : ");
				String seacher1 = sc.next();
				boolean flag = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(seacher1)) {
						System.out.println(seacher1 + "의 이름 " + list.get(i).getName());
						System.out.println(seacher1 + "의 나이 " + list.get(i).getAge());
						flag = true;
						break;
					}
					//if ( i == list.size() -1 ) { // 배열이 끝까지 돌앗다면 님은 없다는뜻 ;
//					System.out.println(seacher1 + "님은 없습니다 ");
//					}
				}
				if (!flag) {	// ( i == list.size() -1 ) i가 마지막까지 도달햇다면 없는 경우이기에 출력 
					System.out.println(seacher1 + "님은 없습니다 ");
				}

			} else if (menu == 4) {
				System.out.print("삭제할 이름 입력 : ");
				String seacher = sc.next();
				boolean flag = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(seacher)) {
						System.out.println(seacher + " 을 삭제합니다");
						list.remove(i);
						flag = true;
						break;
					}

				}
				if (!flag) {
					System.out.println(seacher + "님은 없습니다 ");
				}
			} else if (menu == 5) {
				System.out.println("시스템을 종료합니다");
				break;
			} else {
				System.out.println("다시 입력하세요 ");
			}

		}

	}

}
