package Quiz_.method;

import java.util.Arrays;
import java.util.Scanner;

public class method1 {

	public static void main(String[] args) {

//		print();
//
//		int n1 = input();
//		int n2 = input();
//
//		int result = add(n1, n2);
//
//		showResult(result);

		String[] arr1 = {"가", "나"};
		String[] arr2 = {"가", "나"};
		System.out.println(Arrays.equals(arr1, arr2));
		
		add();
		
		
	} // main

	static void print() {
		System.out.println("정수 두개 입력 : ");
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(": ");
		int n1 = sc.nextInt();

		return n1;
	}

	static void showResult(int result) {
		System.out.println("결과 : " + result);
	}
	
	
	static void add() { 
		print();
		int n1 = input();
		int n2 = input();
		
		int result = n1 + n2 ;
		
		showResult(result);
		
	}
	
	
}

