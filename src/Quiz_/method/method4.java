package Quiz_.method;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		
		// Q - 18 번 
		// 자바자바자바 출력 
		String str = java(5);
		System.out.println(str);
		
		// Q - 19 번
		// 자연수를 입력받아 n의 약수를 모두 더한 값을 리턴

		System.out.print("자연수 입력  : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sum(n);
		System.out.println(n+"의 약수의 합 : " + result);

		// Q - 20
		// 1부터 입력받은 숫자 a사이에 소수의 개수를 반환 하는 primeNum

		int count = primeNum(n);
		System.out.println(n+"의 소수의 개수 : " + count);

		
		// Q -21  숫자사이의 합 구하기 
		System.out.print("2번째 정수 입력 : ");
		int n2 = sc.nextInt();
		int HAP = sumNum(n, n2);
		int hap = sumNum(5, 7);
		System.out.println(n + " ~ " + n2 +" 사이의 합 : " + HAP);
		System.out.println(5 + " ~ " + 7 +" 사이의 합 : " + hap);
		
		
	}
	// ----------------------------메소드 부분 -----------------------------------
	
	
		// Q - 18 숫자만큼 자바자바자바자바자바를 출력하기
	static String java(int a) {
		String str = "";
			for (int i = 1; i <= a; i++) {
				if( i % 2== 0) {
					str +="바";
				} else {
					str+="자";
				}
			}
			return str;
	}
	
		// Q - 19 약수의 합 
	static int sum(int arg) {
		int sum = 1;
		for (int i = 2; i <= arg; i++) {
			if (arg % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

			
		//Q-20 소수의 개수
	static int primeNum(int arg) {				// 2 
		int sum = 0; 
		if (arg != 1) {										// 4 
			for (int i = 2; i <= arg; i++) { 			// i =  2 -> 34  
				int count = 0;							// count = 0 초기화  
				for (int j = 1; j <= i; j++) {			 //  j =1 ->  
					if (i % j == 0) {					// 2 % 1 = 0 	2 % 2== 0 
						count++; // 약수의 개수 				// count -> 1 		-> 2 
					}
				}
				if(count ==2 ) {
					sum++;	 // 소수의 개수  				// sum = 1 
				}
			}
		}
		return sum;
	}

		// Q-21 2개 정수 사이의 합 
	static int sumNum(int n1, int n2 ) {
		int temp;
		int sum=0;
		if(n2> n1) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		for(int i = n2; i<=n1; i++) {
			sum+=i;
		}
		return sum;
	}
	

	
}
