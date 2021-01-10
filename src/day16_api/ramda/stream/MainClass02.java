package day16_api.ramda.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		// stream의 중간처리자
		Random r = new Random();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			list.add(r.nextInt(100)+1); // 1~100 
		}
		System.out.println("처음 : " + list.toString() );

		// --------------- 중복 제거 --------------- 
		// stream 형태로 불러오고 중복을 제거한 상태로 반복을 돌린다 
		list.stream().distinct().forEach( (s) -> System.out.print(s+ " ")); 
		
		// --------------- 정렬 --------------- 
		list.stream().sorted().forEach((s)->System.out.print(s+" "));
		
		// --- 필터(원하는 값만 추출이 가능함 = 유용함 ) --- 
		list.stream().distinct().sorted().filter( (t) -> {
			return t % 2 == 0;
		}).forEach((t) -> System.out.println(t + " "));
		// filter의 내용물 값의 함수는 boolean형이기에 식이 알맞으면 true 반환
		// 한줄이 아니라면 중괄호를 붙인다 
		
		// --- map() - 람다안에 정의된 새로운 stream타입으로 변환 ---
		list.stream().distinct().sorted().map((i) -> {
			return i%2==0? "짝수" :"홀수";
		}).forEach((t)->System.out.println(t+" "));
		
		// --- collect() - 스트림의 처리된 결과를 list로 변환 ---
		List<Integer> result = list.stream().sorted().filter((t) -> t%3 == 0)
				.collect(Collectors.toList()); //List,Set가능
		System.out.println(result);
		
		// --- max() - 최종처리 ---
		list.stream().distinct().max(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		
	}

}
