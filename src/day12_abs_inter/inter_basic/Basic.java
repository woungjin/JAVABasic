package day12_abs_inter.inter_basic;

public class Basic implements Inter1 , Inter2 {

	/* 
	 	1. 인터페이스의 구현(상속) 키워드는 implements
	 	2. 인터페이스의 선언된 추상메소드는 반드시 자식클래스에서 오버라이딩 해야한다 
	*/
	
	// interface의 method1는 추상이기떄문에 꼭 오버라이딩을 해주어야 한다 
	public void method1() {
		System.out.println("Inter1의 method1 호출");
	}
	
	public void method2() {
		System.out.println("Inter2의 method2 호출");
	}

	public void method3() 	{
		System.out.println("Basic의 method3 호출");
	}
}
