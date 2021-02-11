package day11_static.static_.init;

public class Computer {

	// 클래스가 호출될때 정적초기화자는 단 한번만 호출이 됩니다.
	
	 
	public static String company;
	public static String model;
	public int price;
	// static 변수는 정적 초기화자에서 초기화 함 
	static { 
		System.out.println("정적 초기화자 호출");
		company = "LG";
		model ="gram";
		
	}
	
	// 일반 멤버변수만 생성자에서 초기화 함 
	public Computer(int price) {
		System.out.println("생성자 호출");
		this.price = price;
	}
	
	
	 
	
}
