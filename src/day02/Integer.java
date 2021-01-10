package day02;

public class Integer {
	public static void main(String[] args) {

		// 정수형

		byte a = 127;
		byte a1 = -128;

		short b = 32767;
		short b1 = -32768;

		int c = 2147483647;
		int c1 = -2147483648;

		long d = 1111111111111111L;		// L
		System.out.println(d);
		
		/* 
				＊ 진수
				
				1. 2진수 = 0B
				
				2. 8진수 = 0
				
				3. 16진수 = 0x
				
				
		 */
		
		int bin = 0b1010;
		System.out.println("10진수 : " + bin);
		
		int octa = 064;
		System.out.println("8진수 : " + octa);
		
		int hexa = 0x3a4c;
		System.out.println("16진수 : " + hexa);
		
		System.out.println("-------------------------");
		
		float f1 = 3.1415921234F; // F		
		double d1 = 3.1415921234567898 ;
		System.out.println(f1);		// 6자리까지 - 7자리에서 반올림 
		System.out.println(d1);		// 15자리 까지 - 
		
		System.out.println("--------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool2);
	}
} 
