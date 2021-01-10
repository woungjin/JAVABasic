package day02;

public class OperatorEx03 {

	public static void main(String[] args) {

		// && , ||
		int x = 10, y = 20;

		if(x != 10 && ++y ==21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x + " y : " + y);

		if( x == 10 || ++y == 21 ) {
			System.out.println("참");			
		} else {
			System.out.println("거짓");
		}
		System.out.println("x : " + x + " y : " + y);

		
		//--------------------------------------------
		
		int a = 6;
		int b = 5;
		
		a += 3; // a = a + 3 
//		b =+ 3;	error
		
		
		a -= 4; 
		a *= 10;
		a /= 5;
		a %= 2 ; // a = 0
		

	}

}
