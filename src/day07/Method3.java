package day07;

public class Method3 {

	public static void main(String[] args) {

		
		//		＊  반환유형
		//	type = void 
		// 	void = 호출만 가능 
		//  호출    != 변수에 저장 불가 
		//  모든 메소드는 return을 만나면 강제 종료됩니다
		//  
		int result = add(add(3,5),add(1,2));
		System.out.println("결과 : " + result);
		
		sub(5,4);
		multi();
		
		noreturn("똑똑이");
	}
	
	static int add(int a , int b) {
		return a +  b;
	}
	
	static void sub(int a, int b) {
		System.out.println(a + "-" + b +"=" + (a-b));
	} 
	
	static void multi() {// 반환유형이 없고 매개변수도 없는 메소드 
		System.out.println("5 x 3 = 15 ");
	}
	
	
	static void noreturn(String s) {
		
		if(!s.equals("똑똑이")  ) {
			System.out.println(s + "가 아니고 똑똑이를 전달하세요");
			return ;
		}
		System.out.println("똑똑 합니다");
	}  
}
