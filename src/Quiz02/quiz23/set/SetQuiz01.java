package Quiz02.quiz23.set;

import java.util.*;

public class SetQuiz01 {

	public static void main(String[] args) {

//		1. Random 객체를 이용해서 1~45랜덤수를 만들고
//	 	2. set을 이용해서 6개의 로또번호를 만드세요 
		Random r = new Random();
		Set<Integer> list = new HashSet<>();
		TreeSet<Integer> list2 = new TreeSet<>();
		
		int count= 0;
		while(count < 6) {
			int rn = r.nextInt(45)+1;
			list.add(rn);
			list2.add(rn);
			count++;
			
		}
		System.out.println(list.toString());
		System.out.println(list2.toString());
		
	}

}
