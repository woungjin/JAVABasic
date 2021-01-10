package day14.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	// List<?> - 타입상관없이 무엇이든 들어 갈 수 있음
	// List<? extends String> - String을 포함한 자식들의 클래스까지 전달 가능 
	// List<? super Integer> - Integer의 형태를 가지고 있다면 , 전달 가능  
	
	public static void add(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list)  {		// Object는 String의 자식이 아니라 못들어간다
		
	}
	
	public static void add3(List<? super Integer> list) { 		// Object는 Integer의 형태를 가질수있다 String은 안된다 
		
	}
	
	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		List<Integer>list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
	
		add(list1);
		add(list2);
		add(list3);
		
		add2(list1);
//		add2(list2);	// Integer x
//		add2(list3);	// String의 자식타입이 아니기 때문에 x
//		
//		add3(list1);
		add3(list2);
		add3(list3);
		
		
		
	}
	
 
}
