package day07;

public class method2 {

	public static void main(String[] args) {

		// 		＊ 매개변수
		// 메소드를 호출할 때 실행에 필요한 값을 전달하는 매개체
		// 매개변수 값은 선언시 결정
			
		System.out.println(calSum(100));
		
		int result = calSum(20);
		System.out.println("1~20까지 합 " + result);
		
		int result2 = calSum2(10,20);
		System.out.println("10 ~ 20 : "+result2);
		
		String result3 = calSum3(1,10,"A");
		System.out.println("값 : " + result3);
	}

	static int calSum(int end) {
		int sum=0;
		for (int i = 1; i <= end; i++) {
			sum += i;

		}
		return sum;
	}
	static int calSum2(int start, int end) {
		int sum=0;
		for(int i = start; i<=end; i++ ) {
			sum+=i;
		}
		return sum;
	}
	
	static String calSum3(int start, int end, String s) {
		String str = "";
		for(int i = start; i <= end; i++) {
			str +=s;
		}
		return str;
	}
	
	
	
}
