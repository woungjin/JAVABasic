package day08_Class.str_ex;

public class StringMain {

	public static void main(String[] args) {
		
		// String 문자열 확인 
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	
		// String은 다른 주소를 가지며 문자열 비교시에는 = equals() 메소드를 사용한다 
		if(str1.equals(str3)) System.out.println("문자열 같음");
		

	}

}
