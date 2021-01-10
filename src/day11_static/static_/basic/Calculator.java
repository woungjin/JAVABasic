package day11_static.static_.basic;

public class Calculator {
	
	String color ;
	int result;
	static double pi = 3.14;
	
	// 계산기 마다 색깔이나 결과값은 다르기 때문에 일반 멤버변수가 된다 .
	// 원주율은 동일하기에 static으로 하나로 묶어버린다 
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void add(int n) {
		result +=n ;
	}
	
	
	// 일반 멤버변수를 사용하지 않는 메소드는 static키워드를 사용하는 편이 좋다 
	public static double circle(int r) {
		return r * r * pi;
	}
	
}
