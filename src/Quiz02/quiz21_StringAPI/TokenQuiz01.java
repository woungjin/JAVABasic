package Quiz02.quiz21_StringAPI;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {

		// 1. nextLine() 문장을 받습니다.
		// 2. 토크 나이저를 이용해서 공백기준으로 분리
		// 3. 토큰 개수를 확인
		// 4. 분리된 토큰에 숫자를 붙여서 세로형태로 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();

		StringTokenizer token1 = new StringTokenizer(str);
		System.out.println("토큰 개수 " + token1.countTokens());
		String[] arr = new String[token1.countTokens()];
		int count = 0;
 
		try {

			while (token1.hasMoreTokens()) {
				arr[count] = token1.nextToken();
				System.out.println(count + 1 + ". " + arr[count]);
				count++;
			}

			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}

		//  
		
		
	}

}
