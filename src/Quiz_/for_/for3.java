package Quiz_.for_;

import java.util.Arrays;
import java.util.Scanner;

public class for3 {

	public static void main(String[] args) {
		// 두 정수를 입력받고 ( 두 수의 크기는 정해지지 않음 ) 
		// 두수 사이의 합을 구하는 코드를 최대한 간단하게 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개 입력 :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int big = 0;
		int sum = 0;
		if(n2 > n1 ) {
			big = n2;
			n2 = n1;
			n1 = big;
		}
		for(int i = n2 ; i<n1; i++) {
			sum += i ;
		}
		
		
		//삼항연산식 사용
//		for(int i = a == b ? 0 : (a > b ? b : a); i<= (a==b ? 0 : (a >b ? a : b )); i++) 
		
		
		System.out.println("두 수 사이의 합 : "+ sum);
		
		//----------------------------------------------
		
		// 크기가 100인 배열을 생성하고 3의 배수를 순서대로 저장
		
		int[] a = new int[100];
		
		for(int i=1;i<=100;i++) {
			a[i-1] = i*3;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
	}

}
