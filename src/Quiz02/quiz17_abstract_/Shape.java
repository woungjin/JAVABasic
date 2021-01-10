package Quiz02.quiz17_abstract_;

public abstract class Shape {

	private String name;
	// 생성자 
	public Shape(String name ) {
		this.name = name;
	}
	
	// 오버라이딩을 강제화 한다면 추상메소드 
	public abstract double getArea();
	// 강제로 받아서 넓이를 구하게끔 함 
	
	
	// 오버라이딩을 강제화 하지 않는다면 일반 메소드
	public String getName() {
		return "도형 이름 : " + this.name;
	}
	
	
	
	
}
