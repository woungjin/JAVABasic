package day14.collection.list;


import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

	public static void main(String[] args) {
		/*
				＊ List<String> list = new ArrayList<>()
			1. list의 값 추가  add()
			2. list의 크기 size()
			3. list의 객체를 문자열로 확인 toStirng()
			4. list의 값 확인 get(index)
			5. list 의 특정 값 contains(값)
			6. 삭제 remove(값), remove(index)
			7. addAll(리스트) 
		 */

		// ArrayList객체 생성 
		//		ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();

		// list의 값 추가 add()
		list.add("add");
		list.add("Database");
		list.add("JSP");
		list.add("SPring");
		list.add("JAVA");

		// list의 크기size()
		System.out.println(list.size());
		// list의 저장된 객체를 문자열로 확인 toStirng()
		System.out.println(list.toString());
		// list의 추가 add(index, 값)
		list.add(1,"sdf");
		System.out.println(list.toString());

		// list의 값 확인 get(index)
		String value = list.get(2);
		System.out.println("2번쨰 인덱스 값 " + value);

		// list 의 특정 값 contains(값)
		if(list.contains("sdf")) {
			System.out.println("sdf를 포함하고있습니다");
		}

		// 삭제 remove(값), remove(index)
		list.remove("JSP");
		System.out.println(list.toString());

		// addAll(리스트)  
		String[] arr = {"React", "AWS"};
		List<String> list2 = Arrays.asList(arr);		// String 타입의 arr을 .asList를 사용해 List타입으로 변경해준다

		list.addAll(list2);								// 기존 배열에 addAll하면 추가하게 된다 
		System.out.println(list.toString());
	}
}
 
