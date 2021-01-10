package day13_exception.multicatch;

public class MainClass {

	public static void main(String[] args) {

		// main 메소드 실행 매개값을 주는 방법 
		// run 탭 -> run configuration -> arguments -> ${string_prompt}

		try {
			String data1 = "1";
			String data2 = "ㅁ";

			int data3 = Integer.parseInt(data1);
			int data4 = Integer.parseInt(data2);
			System.out.println("두수의 합 " + (data3+data4));
		} catch (ArrayIndexOutOfBoundsException e) {	
			System.out.println("매개값은 반드시 2개를 전달해 주세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 해주세요 ");
		} catch (Exception e) {
			System.out.println("기타 예외 입니다");
			// Exception은 모든 실행 예외의 부모 클래스 이기때문에 모든 예외를 처리 한다 ,
		}

		
		
	}

}
