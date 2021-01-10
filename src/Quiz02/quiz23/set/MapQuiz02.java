package Quiz02.quiz23.set;

import java.util.*;
import java.util.Map.Entry;

public class MapQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 맵을 이용하는데 key : 메뉴이름 , value : 가격
		Map<String, Integer> map = new HashMap<>();

		while (true) {
			System.out.println("--------메뉴관리--------");
			System.out.println("1. 신규 메뉴 등록 "); // 이미 등록된 메뉴인지 부터 확인 후 에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기 "); // 메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정 "); // 변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
			System.out.println("4. 메뉴판 삭제 "); // 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료 "); // 종료

			int menu = sc.nextInt();

			if (menu == 1) {

				System.out.println("메뉴 이름 입력 : ");
				String name = sc.next();
				if (map.containsKey(name)) {
					System.out.println("이미 등록된 메뉴가 있습니다 다시입력하세요 ");
					continue;
				} else {
					System.out.println("메뉴 가격 입력 : ");
					int value = sc.nextInt();
					map.put(name, value);
				}
				System.out.println("");
			} else if (menu == 2) {
				System.out.println("------------------메뉴판------------------");
				Set<Entry<String, Integer>> entry = map.entrySet();
				for (Entry<String, Integer> m : entry) {
					System.out.println(m.getKey() + " : " + m.getValue());
				}
				System.out.println("------------------메뉴판------------------");
				System.out.println("");

			} else if (menu == 3) {
				System.out.println("수정할 메뉴의 이름을 입력해 주세요");
				String modifyname = sc.next();
				
				if (map.containsKey(modifyname)) {
					System.out.println("수정할 가격을 입력해 주세요");
					int modifyValue = sc.nextInt();
					map.put(modifyname, modifyValue);
				} else {
					System.out.println(modifyname + " 메뉴는 존재하지 않습니다");
					
				}

				System.out.println("");
			} else if (menu == 4) {

				System.out.println("삭제할 메뉴의 이름을 입력해 주세요");
				String modifyname = sc.next();
				
				if (map.containsKey(modifyname)) {
					map.remove(modifyname);
					System.out.println(modifyname + " 메뉴를 삭제 하였습니다");
				} else {
					System.out.println(modifyname + " 메뉴는 존재x , 삭제 불가 합니다");

				}
				System.out.println("");
			} else if (menu == 5) {
				System.out.println("시스템 종료 ");
				break;
			} else {
				System.out.println("다시 입력 하세요 ");
				System.out.println("");
			}

		}

	}

}
