package Quiz02.quiz07_overloading;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) - result에 값을 누적시키는 기능
		 * sub(int) - result에 값을 차감시키는 기능
		 * multi(int) - result에 값을 곱하기 기능 
		 * div(int) - result에 값을 나누는 기능
		 * circle(int) - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) - 정사각형의 넓이 를 리턴
		 * rect(double, double) - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) - 직육면체의 넓이 를 리턴
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		Calculator ca = new Calculator();
		Computer c = new Computer();
		System.out.println(c.rect(5.5));
		System.out.println(c.rect(5.5, 4.3));
		System.out.println(c.rect(7, 4, 3));
		c.add(1);
		c.add(4);
		System.out.println(c.result);
		System.out.println(c.circle(3));
		
	}
}
