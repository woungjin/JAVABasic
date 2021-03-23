package day14_collection.map;


import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		
		// HashMap<Integer, String >  map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		// map에 저장 put(K,V)
		map.put(1, "홍길동");
		map.put(5, "이순신");
		map.put(3, "홍길동");
		map.put(4, "ger" );
		map.put(4, "gedfdf" );
		
		System.out.println("맵의 크기 : " + map.size());
		System.out.println(map.toString());
		
		/// 맵에 같은 key를 저장할 경우, key에 있는 value를 수정합니다
		map.put(4, "신사임당");
		System.out.println(map.toString());
		
		// map에 저장된 value값 얻기 get(키)
		
		String value1 = map.get(4);
		System.out.println(value1);
		
		
		// map 검색
		if(map.containsKey(1)) { // key가 있다 = true ,
			System.out.println("1번키가 존재함");
		} else {
			System.out.println("1번키가 존재하지 않음 ");
		}
		
		// map에 저장된 값을 순서대로 출력하려면  , keySet, EntrySet
		Set<Integer> set = map.keySet();
		for(int key : set) {
			System.out.println(map.get(key));
			System.out.println(map.values());
		}
		
		
		
		
		// ---------------- 반복자 ----------------------------
		
		// 반복자 시에는 map의 내용물을 keyset으로 set형태로 받아주어야 한다 
		Set<Integer> set1 = map.keySet(); // key만 뽑아서 set으로 변경 
		Iterator<Integer> iter = set1.iterator();
		
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(map.get(key));
		}
	
		System.out.println("-----------------");
		////////////////////////////////////////
		Set<Entry<Integer, String>> entry = map.entrySet();
		
		for(Entry<Integer, String> e : entry ) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		map.remove(3);
		System.out.println(map.toString());
		
		
		 
	}

}
