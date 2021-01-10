package day02;

public class TextEx {
	public static void main(String[] args) {

		// 단일 문자 : char 
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		
		// 유니코드 : 아스키 코드로 부족한 개수를 늘림
		// 2byte 크기로 확장하고 6만개 정도 표현 가능 
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';		// 
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c3+" "+c4+" "+c5);
		
		// 문자열 저장 : String
		String s1 = "hello~";
		String s2 = "my name is park";
		System.out.println(s1 + s2);
		
		// 문자열과 다른 데이터 타입의 + 연산
		System.out.println(100+3000);
		System.out.println("100"+300); // 문자열에는 다른 타입이 붙으면 : 결과는 무조건 String 
		System.out.println(100+300+"world");  
		System.out.println("hello"+100+300);  
		
		System.out.println("A" + 100);
		System.out.println('A' + 100); 
		
		
	}
}
