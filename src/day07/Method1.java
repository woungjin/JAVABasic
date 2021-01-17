package day07;

public class Method1 {

	public static void main(String[] args) {

		// 메소드 내부에 메소드 선언 불가능

		// main 밖이면 어디든 가능

		calSum();

		String result = randomStr();
		System.out.println(" : " + result);
		
		String result2 = randomStr2();
		System.out.println(" : " + result2);
	} // main

	static int calSum() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	static String randomStr() {
		String str = "";
		for (char i = 'A'; i <= 'Z'; i++) {
			str += i + " ";
		}
		return str;
	}

	static String randomStr2()	{
		double d = Math.random();
		 
		if( d> 0.66) {
			return "가위";
		} else if (d > 0.33) {
			return "바위";
		} else {
			return "보";
		}
		 
	}

}
