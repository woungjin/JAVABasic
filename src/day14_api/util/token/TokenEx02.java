package day14_api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {

		String log = "2020.09.23, /bno=30, user=홍길동";
		
		
		
		// , . / 로 나눠진다 
		StringTokenizer token1 = new StringTokenizer(log, ",./");
		
//		while(token1.hasMoreTokens()) {
//			System.out.println(token1.nextToken());
//		}
//		
		
		// true를 넣으면 log를 나누긴 하지만 구분자로 쓴  ,./도 토큰에 포함시켜 출력하게 된다 false라면 출력 no
		StringTokenizer token2 = new StringTokenizer(log, ",./",true );
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		
		 
	}

}
