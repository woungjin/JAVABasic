package day12_abs_inter.good;

public class MainClass {

	public static void main(String[] args) {
		// 1.  추상클래스를 사용하면 , 오버라이딩이 강제화 되기때문에 프로그래머의 실수를 줄일수 있다 
		// HeadStore h = new HeadStore();
		// 2. 추상클래스(=메소드) 를 사용하면 다형성의 형태를 보다 안전하게 사용할수 있다 
		
		HeadStore s = new Store();
		System.out.println("상호명 " + s.getName());
		s.apple();
		s.banana();
		s.melon();
		s.orange();
		
		HeadStore s2 = new Store2();
		System.out.println("상호명" + s2.getName());
		s2.apple();
		s2.banana();
		s2.melon();
		s2.orange();
			
	}
}
