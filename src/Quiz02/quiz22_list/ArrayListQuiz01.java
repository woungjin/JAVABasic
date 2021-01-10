package Quiz02.quiz22_list;

import java.util.*;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		// list에 1~20 까지 정수를 저장
		List<Integer> list = new ArrayList<>();
		for(int i =1 ; i< list.size();i++) {
			list.add(i);
		}
		
		// 저장한 값을 반복문으로 출력
		for(int i = 0 ; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

		
		
	}
	
}
