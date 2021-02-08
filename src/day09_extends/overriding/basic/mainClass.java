package day09_extends.overriding.basic;

public class mainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		p.method01();
		p.method02();
		
		c.method01();
		c.method02(); // 오버라이딩된 메소드 실행 
		 
		

	}

}
