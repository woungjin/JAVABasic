package day02;

public class CastringEx01 {

	public static void main(String[] args) {

		// 작은 타입 -> 큰 타입 
		// - 자바 가상머신 JVM이 자동으로 형변환을 해준다
		
		byte b = 10; 
		short s = b;	// byte 와 short를 더하면 -> int형으로 강제 형변환 됨 
		System.out.println(s);
		
		int i = b; // byte--> int 
		
		long l = b; // byte -> long
 		
		char c = '가'; // 2byte
		int j = c; // char -> int 
		System.out.println("유니코드값 : " + j);
		
		int k = 1000;
		double d = k ;// int -> double
		System.out.println(d);
		
		
		
	}

}
