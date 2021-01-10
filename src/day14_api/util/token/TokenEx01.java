package day14_api.util.token;

import java.util.*;

public class TokenEx01 {

	public static void main(String[] args) {

		// StringTokenizer 클래스 - 특정문자 기준으로 문자열을 잘라서 사용.
		String str1 = "오늘 날씨는 맑고, 매우 시원합니다";
		String str2 = "2020/09/23";
		
		StringTokenizer token1 = new StringTokenizer(str1); // 띄여쓴 부분이 몇개인가 개수로 반환
		System.out.println(token1.countTokens()); // 토큰 사용전에 몇개의 토큰이 있는지 확인 
		
		while(token1.hasMoreTokens()) { // 다음 토큰이 있으면 true, 없으면 false
			System.out.println(token1.nextToken()); // 다음 토큰으로 접근 
		}
		
		System.out.println("--------------------");
		
		StringTokenizer token2 = new StringTokenizer(str2);
		
		
	}

}
