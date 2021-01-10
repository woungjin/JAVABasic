package Quiz02.quiz18_interface;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 인터페이스 형으로 선언하고 , 무한 반복문 안에서 추가 , 재생 , 종료 메뉴를 입력 받아서 각 기능을 실행해 보세요  
		SongList list = new MelonMusic();
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1.추가 , 2.재생 , 3.종료 ");
			System.out.print("메뉴 입력 : ");
			String str = sc.next();
			
			if(str.equals("1")) {
				System.out.print("추가할 음악 : ");
				String song = sc.next();
				list.insertList(song);
			} else if ( str.equals("2")) {
				list.playList();
			} else if ( str.equals("3")) {
				System.out.println("저장된 음악 개수 : " + list.playLength());
				break;
			}
			
		}
		
		
		
	}

}
