package day11_static.static_.method;

public class Count {

	public int a; 
	public static int b;
	
	public int method() { // 일반 메소드 - 일반멤버변수, 정적 멤버변수 사용 가능 
		a = 10 ;
		return ++b;
		
	}
	
	static public int method1()  { // 정적 메소드 - 정적 멤버변수, 일반멤버는 객체를 생성해서 불러와야 한다  
		//a = 10;
		
		Count c = new Count();
		c.a = 10;
		
		return ++b;
	}
	
}
