package day02;

public class CastingEx02 {

	int num1 =5;
	public static void main(String[] args) {

		int i = 70;
//		char c = i;			    큰 -> 작은 타입은 자동으로 형변환을 해주지 않음
		char c = (char) i; // 강제 형변환 필요
		short s = (short)i;
		System.out.println(s);
		
		float f = 3.14F;
		int j = (int)f; 
		System.out.println(j);
		
		
		//  ＊ 강제 형변환 주의할점 
		// - 잘려나간(쓰레기값)을 저장 하게 된다 
		
		int a = 1000;
		byte b =  (byte)a;
		System.out.println(b);
		
		// ＊ 강제 형변환의 예외적 상황
		// - char -> short : 형변환이 필요하다 
		char cc = 'A';
		short ss = (short)cc;
		
	}

}
