package day10_public.poly;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		p.method1();
		p.method2();
		
		c.method1();
		c.method2();
		c.method3();
		
		Parent p1 = new Child();
		
		p1.method1();
		p1.method2(); // 오버라이딩된 메소드가 실행이 된다 
		//p1.method3(); // 부모의 것에서만 실행
		p = c;
		System.out.println(p);
		System.out.println(c);
		
		// 다형성 적용시 자식이 원래 가지고 있던 멤버에 접근 할수 없는 문제가 발생하는데 
		// 다운 캐스팅으로 변환이 가능하다 
		// 다형성이 일어난 상태에서의 다운캐스팅만 가능하다 
		
		Child cc = (Child)p;
		cc.method1();
		cc.method2();  
		cc.method3();
	}
}
