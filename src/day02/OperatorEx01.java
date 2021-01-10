package day02;

public class OperatorEx01 {

	public static void main(String[] args) {

		// 부호 연산자 + , -
		int i = -3;
		int j = -i;
		System.out.println(j);

		// 증감연산자 ++ , --
		int k = 1;
		int h = k++;
		System.out.printf("k : %d , h : %d\n", k, h);

		int x = 1;
		int y = ++x;
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);

		x = 1;
		x++;
		++x;
		System.out.println("-------------------");

		x = 1;
		y = 1;
		System.out.println(x++);
		System.out.println(++x);
		
		x = 10;
		y = 10;
		int result = (x++) + (++y) + 10;
		System.out.println(result);
		
		System.out.println("-----------------------");
		// ＊ 비트 연산자 
		byte b = 10; // 0000 1010
		System.out.println(~b);// 1111 0101
		
		
		// ＊ 논리반전 연산자 : ! (반대 = 부정 ) 
		System.out.println(!true);
		System.out.println(!false);
	} 

}