package day14_api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
 
		// 1. String 		 			: 객체 상태로 만들어 저장할수 있다
		// 2. .charAt(num) 				: 인덱스번호의 글자를 char형으로 반환한다 
		// 3. .indexof(str)	 			: 문자열을 찾아서 인덱스 반환	but 반환값이 없다면 '-1'를 반환 
		// 4. .lastIndexof(str) 		: 문자열을 뒤에서 찾아서 인덱스 반환 
		// 5. .length() 	 			: 배열의 길이를 반환함 
		// 6. .str4.replace(old, new) 	: 특정 문자열 변경 
		// 7. .substring() 				: 문자열 자르기
		// 8. .toUpperCase() 			: 대문자로 변경
		// 9. .trim() 					: 공백 제거 
		// 10 .valueof()				:
		// 11 .split(str)				: 문자열 나누기
		
		
		// 1. String
		String str1 = new String("Hello world");
		System.out.println(str1);
		
		// 2. .charAt(index)
		String str2 = "안녕하세요";
		char c = str2.charAt(3);
		System.out.println(c);
		
		
		// 3. .indexof() 
		int a2 = str2.indexOf("요");
		System.out.println(a2);
		
		
		// 4. .lastIndexof() 
		int a3 = str2.lastIndexOf("요");
		System.out.println(a3);
		
		// 5. .length() 
		int a4 = str2.length(); 
		
		// 6. .replace()
		String str6 = "자바의 유래 ";
//		String str5 = str4.replace("자바", "java");
		str6 = str6.replace("자바", "java");
		int num = str6.replace(" ", "").length();
		System.out.println(str6 + "str6 길이 " + num);
		
		
		// 공백 제거 
		str6 = str6.replace(" ", "").toString().replace("java", "JAVA" );
		System.out.println(str6);
		
		// 7. .substring() 
		String str7 = "010-1111-2222";
		String a5 = str7.substring(7); // 매개값을 하나 주면 앞 문자열 제거
		System.out.println(a5);
		
		String a6 = str7.substring(1, str7.length());
		System.out.println(a6);
		
		// 8. .toUpperCase() 		
		String str8 = "hello jack";
		str8 = str8 = str8.toUpperCase();
		System.out.println(str8);
		
		// 9. .trim() 
		String str9 = "    홍길동    df   ";
		str9 = str9.trim();
		System.out.println(str9);
		
		// 10. .valueOf() 
		System.out.println(1+1); // 2
		System.out.println(String.valueOf(1) + 1);//11

		// 11. .split()
		String str11 = "010-1234-5678";
		
		String[] arr1 = str11.split("-");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = str11.split("-",3); // 배열의 최대값을 2개로  
		System.out.println(Arrays.toString(arr2));
		
	
	}
}
