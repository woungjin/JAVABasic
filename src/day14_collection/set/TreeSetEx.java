package day14_collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		// HashSet과 동일하고 , 자동으로 오름 차순 정렬 
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(250);
		
		System.out.println(set.toString());
		
		
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("강아지");
		set2.add("강아지");
		set2.add("망아지");
		set2.add("송아지");
		set2.add("얼룩송아지");
		
		System.out.println(set2.toString());
		

	} 

}
