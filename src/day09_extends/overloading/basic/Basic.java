package day09_extends.overloading.basic;

public class Basic {

	// 오버로딩 - 같은 이름의 메소드를 여러개 생성하는것 
	
	// 1. 이름이 같음
	
	// 2. 반환유형은 오버로딩에 영향을 미치지 않음
	
	// 3. 매개변수 타입이 달라야함
	
	// 4. 매개변수의 종류가 달라야함 
	
	// 5. 매개변수의 순서가 달라야한다
	
	void input (int a ) {
		System.out.println("정수 1개를 입력함 ");
	}
	
	void input (String a ) {
		System.out.println("문자열 1개가 입력됨 ");
	}
	
	void input(char a, int b, double c) {
		System.out.println("문자, 정수, 실수 1개 씩 입력됨");
	}
} 
