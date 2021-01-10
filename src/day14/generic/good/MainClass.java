package day14.generic.good;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 		* 제네릭 클래스 이용시 
		 		 - 객체를 생성할때 타입을 지정할수 있고 
		 		 - 다목적 형태의 클래스를 안전하게 사용이 가능 
		
		 */
		
		
		
		ABC<String> abc = new ABC<>();
		abc.setT("홍길동");
		String name = abc.getT();
		System.out.println(name);
		
		ABC<Integer> abc2 = new ABC<>() ;
		abc2.setT(999);
		int num1 = abc2.getT();
		System.out.println(num1);
		
		
		// Person타입 저장하는 ABC클래스
		ABC<Person> abc3 = new ABC<>();
		abc3.setT(new Person());
		Person p = abc3.getT();
		System.out.println(p);
		
		
		
	}

}
