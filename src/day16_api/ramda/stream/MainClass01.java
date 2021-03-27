package day16_api.ramda.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;

interface Test {
	public default void test() {

	}
}

public class MainClass01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		list.add("홍길자");

		Iterator<String> iter = list.iterator(); // 컬렉션 -> 반복자
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		Stream<String> stream = list.stream(); // 컬렉션

		// 람다로 표현햇을때 더 편하게 표현 가능
		// stream.forEach(new Consumer<String>() {
		// @Override
		// public void accept(String t) {
		//
		// System.out.println(t);
		//
		// }
		// });
		//
		// foreach메서드는 최종처리 메소드 이고 , 람다식의 표현으로 쓸수 있따
		// for 형을 대신하여 사용 
		list.stream().forEach((t) -> System.out.println(t));

	}

}
 
