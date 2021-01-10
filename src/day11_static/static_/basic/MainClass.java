package day11_static.static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		// 1. 녹색 계산기와, 빨간색 계산기를 각각 생성
		// 2. pi값을 사용해서 원의 넓이를 확인
		// 3. circle()를 사용해서 원의 넓이를 확인 
		// 4. 
		Calculator calc1 = new Calculator();
		calc1.setColor("green");
		calc1.add(4);
		
		System.out.println(Calculator.pi*4*4);
		
		
		Calculator calc2= new Calculator();
		calc2.setColor("red");
		
		
		

	}

}
