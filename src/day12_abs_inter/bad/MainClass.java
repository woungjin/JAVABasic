package day12_abs_inter.bad;

public class MainClass {

	public static void main(String[] args) {
		
		// 재정의를 뺴먹었다면, 잘못된 메소드의 실행으로 이어질수 있다 
		Store s = new Store();
		s.apple();
		s.banana();
		s.melon();
		s.orange();
		
		
	}
}
