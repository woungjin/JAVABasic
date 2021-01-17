package day08_Class;
// 설계도 클래스는 메인이 없습니다. 
public class Pen {
	 
	// 클래스의 속성 = 멤버변수 
	String color;
	int price;
	String company;
	
	// 클래스의 기능 = 메소드 
	void write() {
		System.out.println(color + "색상으로 글씨를 씁니다.");
	}
	
	void info() {
		System.out.println("---- 펜 정보 ----");
		System.out.println("색상 : " + color );
		System.out.println("가격 : " + price );
		System.out.println("회사 : " + company );
	}
	
}
  
