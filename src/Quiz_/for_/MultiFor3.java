package Quiz_.for_;

import java.util.Scanner;

public class MultiFor3 {

	public static void main(String[] args) {

		// 1. 가로 세로길이 입력받기
		// 2. 사각형을 출력
		// 3. 단 윤곽만 나타나도록
		// 4. 첫행 마지막 행에 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int n1 = sc.nextInt();

		int sum =0 ;
		for (int i = 2; i<=n1;i++) {
			int count=1;
			for(int j=2; j<=i; j++) {
				if(i % j == 0 ) {
					count++;
				}
			}
			if(count == 2) {
				sum+=i;
			}

		}
		
		System.out.println("소수들의 합 : "+ sum);

		int k=2;
		sum=0;
		while(k<=n1) {			
			int j=2;
			while(k%j!=0) {
				j++;
			}
			if(k==j) {
				sum+=k;
			}
			k++;
			
		}
		
		System.out.println("합"
				+ " : " + sum);
		
		
	}	// main
}
