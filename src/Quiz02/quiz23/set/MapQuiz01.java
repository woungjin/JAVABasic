package Quiz02.quiz23.set;

import java.util.*;

public class MapQuiz01 {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new HashMap<>();

		map.put("kim1234", "kkk1234");
		map.put("lee5678", "1115667");
		map.put("park4321", "ppp4321");
		
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.println("id 입력 : " ) ;
			String id = sc.next();
			
			System.out.println("pw 입력 : " ) ;
			String pw = sc.next();

			if(map.containsKey(id)) {
				String value = map.get(id); 
				if(value.equals(pw)) {
					System.out.println("로그인성공!");
					break;
				} else {
					System.out.println("비밀번호 틀림!");
				}
			} else {
				System.out.println("아이디가 없습니다");
			}
		}

//		boolean flag =false;
//		if( map.containsKey(id)) {
//			System.out.println("아이디 입력 성공!");
//			for(int i = 0 ; i< map.size(); i++) {
//				if(map.get(id).equals(pw)) {
//					System.out.println("비밀번호 일치!");
//					flag = true;
//					break;
//				}
//				if(!flag) {
//					System.out.println("비밀번호가 없습니다!");
//					break;
//				}
//			}
//			
//		} else {
//			System.out.println("아이디가 없습니다");
//		}
		
	
		/*
		 	 1. id를 입력받아서 해당 아이디가 map에 존재하는지 확인합니다
		 	 2. 존재하면 다시한번 비밀번호 값과 비교해서 , 비밀번호도 일치하면 "로그인 성공 콘솔에 출력 ㅂ
		 	 비밀번호가 다르다면 "비밀번호가 틀렷습니다" 를 출력하세요 
		 	 3. id가 존재하지 않으면 "아이디가 없습니다" 를 출력
		 
		 */
		
		
	}

}
