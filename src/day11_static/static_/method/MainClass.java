package day11_static.static_.method;

public class MainClass {

	static int x ; 
	
	public static void main(String[] args) { // static 메소드 안에서는 static 멤버변수만 사용이 가능하고 일반멤버변수는 객체로 참조해서 불러와야 가능하다
		
		Count.b = 1 ;
		Count.method1();
		
		
		Count c = new Count();
		c.a = 10;
		
		MainClass.x = 1;
		
	}

}
