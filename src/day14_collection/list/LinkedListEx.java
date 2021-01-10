package day14_collection.list;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		
		// 
		
		//List<String> list = new LinkedList<>();
		Queue<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("홍길자");
		
		//System.out.println(list.peek()); // 값을 꺼냄
		System.out.println(list.size());
		System.out.println(list.poll()); // 값을 꺼내고 지움 
		System.out.println(list.poll());
		
		System.out.println(list.size());
		
		// 리스트와 동일하게 동작
		// List<String> list2 = new LinkedList<>();
		
		// LinkedList는 arraylist와 
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("홍길동");
		list2.add("홍길자");
		list2.add("김길동");
		list2.addFirst("이순신"); //처음에 추가
		list2.addLast("김유신"); // 마지막에 추가 
		
		System.out.println(list2.toString());
		
		
		System.out.println("2번째 인덱스에 있는 값 : " + list2.get(1)); // 값 얻기 
		

	}

}
