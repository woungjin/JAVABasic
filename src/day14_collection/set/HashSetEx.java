package day14_collection.set;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {

		// set계열은 순서 x , 중복 x
		// HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();

		// set의
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");		// 중복은 set에서는 저장이 불가 

		// set에 저자된 크기 size();
		System.out.println("set의 크기 : " + set.size());
		System.out.println(set.toString());

		// set에 저장된 객체를 확인하려면 , 반복자를 통해 한번씩 검사합니다
		Iterator<String> iter = set.iterator(); // set을 반복자타입으로 변경함
		while (iter.hasNext()) { // hasToken()과 비슷하게 다음 값이 있다면 true를 반환
			System.out.println(iter.next());
		}
		
		// set의 검사 
		if(set.contains("JSP")) {
			System.out.println("JSP가 포함되어 있음");
		} 
		
		// set 삭제 
		set.remove("JAVA");
		System.out.println(set.toString());
		

	} 

}
