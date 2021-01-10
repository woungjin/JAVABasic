package day02;

public class OperatorCondition {

	public static void main(String[] args) {

		// 0 이상 1.0 미만의 랜덤 double 값을 발생
//		System.out.println(Math.random());
//		
//		double rd = Math.random()*10;
//		int result = (int)rd;
		
		int result = (int)(Math.random() * 10) + 1 ;
		System.out.println(result);
		
		String str = result % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다";
		System.out.println(str);
	}

}
