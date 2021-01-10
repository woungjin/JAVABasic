package day16_regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		
		/*
		 		＊ 주요 정규표현 방식 
		 		
		 		1. \\d   숫자를 찾음 ( d{3} - 숫자 3개  , d{3,4} - 3개 or 4개여도됨  = 문자열도 동일
		 		2. \\d+  숫자 여러개 찾음 
		 		3. \\w   문자(영문,_)
		 		4. \\w+  문자여러개 찾음
		 		5. \\W   한글문자 찾기 
		 		6. [0-9] 0~9까지 문자1개찾음 
		 		7, [A-Z] A~Z까지 문자1개찾음
		 		8, [a-z] a~z까지 1개찾음
		 		9, [가-힣] 한글1개 찾음 
		 		10,[가-힣]+ 1개이상 여러개 
		 		11,[가-힣]* 0~여러개
		 		12,[가-힣]? 0~1개 
		 		13,[A-Za-z가-힣] 한글 , 대소영문 1개 
		 		
		 		특수문자는 그냥 있는대로 찍으면 됨 ㄹ
		 		
		 */
		
		String info = "30세/서울시 강남구/02-123-4567/010-1234-4567/kkk@naver.com";
	
		// 	＊ 전화번호 형식 
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		while(m.find()) { //찾으면 true 반환 ,info문자열에서 정규표현식의 패턴
			System.out.println("시작인덱스 : " + m.start() );
			System.out.println("찾은것  " + m.group()); // 찾고 또 찾음			System.out.println("긑인덱스 : " + m.end(););
			System.out.println("끝인덱스"+ m.end()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    );
		}
		
		// m.find(), m.start() , m.end(), m.group();
		
		// 	＊ 메일형식
		
		String pattern2 = "\\w+@\\w+. \\w+ ";
		
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(info);
		
//		while(m2.find()) {
//			System.out.println("시작인덱스: " +m2.start() );
//			System.out.println("찾은값: "+m2.group());
//			System.out.println("끝인덱스: "+m2.end());
//		}
	}
}
