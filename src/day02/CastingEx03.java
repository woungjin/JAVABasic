package day02;

public class CastingEx03 {

	public static void main(String[] args) {
		
		// 연산에서의 형변환
		char c = 'C'; 
		int i = 2;
		
		// 1. 서로다른 타입의 연산에서 큰 타입에 맞추어 자동 형변환 됨 
		char cc = (char)(c + i) ;
		int ii = c+i;
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = 3.14;
		double dd = j + d;
		int result = (int) (j+d);
		System.out.println(result);
		
		// 2. 
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte) (b1 + b2);	// int보다 작은 연산은 int로 형변환됨 
		
		short s1 = 100;
		byte b4 = 10;
		
		short ss = (short) (s1+b4);
		
		
	}
}	