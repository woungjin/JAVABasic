package day12_abs_inter.inter_basic;

public interface Inter1 {
	// 인터페이스의 있는 추상 메소드는 모두 오버라이딩이 되어야한다
	// 인터페이스에는 상수와 추상메소드만 정의가 가능하다
	double PI=1;	// public   static fianly이 생략되있다 == 자동으로 상수 취급 
	public void method1(); // 인터페이스에 메소드를 선언하면 자동으로 추상 메소드 abstract이 생략되있단
	
	int ABC = 1;
	
	
}
