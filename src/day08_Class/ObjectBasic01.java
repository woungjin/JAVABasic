package day08_Class;

public class ObjectBasic01 {

	public static void main(String[] args) {
		// 기존에 사용하던 방식

		System.out.println("----1번 계산기----\n : " +add(1) + "\n : " + add(2) + "\n : " + add(3));
		System.out.println("----2번 계산기----\n : " +add2(10) + "\n : " + add2(20) + "\n : " + add2(30));
	}

	// 1번 계산기
	static int result = 0;

	static int add(int n) {
		result += n;
		return result;
	}
	
	// 2번 계산기
	static int result2 = 0;

	static int add2(int n) {
		result2 += n;
		return result2;
	}	
	
	
	
}
 