package day16_regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		
		// 정규표현 방법 
		
		// 전화번호 형식만 찾아서 ***_****_****
		String info = "홍길자|30세|서울시 강남구|010-9999-1234";
		
		String patter = "\\"; // 문자로 표기시 2개 입력  
		
		String pattern = "\\d{3}-\\d{3,4}-\\d-{4}";
		
		
		// 매개변수에 regex인 메소드는 정규표현 패턴을 적용할 수 있다는 뜻
		// pattern -> "***_****_****" 형태로 바꿔라
		String result = info.replaceAll(pattern, "***_****_****"); 
		
		System.out.println(result);
		
	}

}
