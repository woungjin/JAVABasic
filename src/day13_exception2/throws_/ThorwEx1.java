package day13_exception2.throws_;

public class ThorwEx1 {

	public static void main(String[] args) {

		/* 
		 	1. 예외 생성하기 throw new 
		 	2. 메소드가 실행 도중에 throw키워드를 만나면 즉시 throw로 생성한 예외가 발생한다
		 	3. 예외가 발생되면 실행된 코드는 즉시 중단되고, 예외를 처리할 수 있는 catch문으로 이동
		 	- 즉 메소드를 강제종료 할 때 사용할 수 있다.		 
		 
		 */ 
		
		
		try {
			System.out.println("결과 : " + calc(10));
			System.out.println("결과 : " + calc(-10));
			calc(10);
		} catch (Exception e) {
//			System.out.println(e.getMessage()); // 예외 발생시 전달할 예외 메세지를 얻어오는 기능 
			e.printStackTrace();	// 예오의 경로를 추적하는 메시지를 출력합니다(예외의 원인을 찾을 떄 매번 사용됩니다)
		}

	}

	public static int calc(int n) throws Exception {
		if (n < 0) {
			throw new Exception("반드시 양수값을 전달해야 합니다"); // 예외 생성 
		}
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}

		return sum;

	}

}
