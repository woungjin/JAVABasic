package Quiz_.method;

import java.util.Arrays;
import java.util.Scanner;

public class method2 {

	public static void main(String[] args) {
		
		// 1. 
		method1();
		
		// 2. 
		String str2 = method2("Hi");
		System.out.println(str2);
		
		// 3.
		double db = method3(5, 6, 3.3);
		System.out.println(db);
		
		// 4. 
		String str4 = method4(2);
		System.out.println(str4);
		
		// 5. 
		method5("LOL", 5);
		
		
		// 6.
		char[] c = {'6','7','c','a','1','b'};
		String str = method6(c);
		System.out.println(str);

		// 7. 
		int n1 = abs(2);
		int n2 = abs(-3);
		System.out.println(n1 + " - " +n2);
		
		// 8.
		String[] str8 = method8("안녕", "방가");
		System.out.println(Arrays.toString(str8));
		
	} // main
	
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String arg) {
		return arg;
	}
	static double method3(int a, int b, double c ) {
		return a+b+c;
	}
	static String method4(int a) {
		if(a % 2 == 0) {
			return "짝수";
		} 
		return "홀수";
	}
	static void method5(String str, int a ) {
		for(int i = 0; i<=a ; i++) {
			System.out.print(str +" ");
		}
		System.out.println("");
	}
	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		} 
		return b;
	}
	static int abs(int a) {
		if(a<0) {
			return -(a);
		}
		return a;
	}
	
		static String method6(char[ ] a) {
			String str = "";  
			for(int i =0 ; i<a.length;i++) {
				str += a[i]+ "";
			}
			return str;
		}
	
		static int method7(int[] n) {
			int sum=0;
			for(int i = 0 ; i<n.length; i++) {
				sum+=i;
			}
			return sum;
		}
		
		static String[] method8(String s1, String s2) {
			String[] arg = {s1,s2};
			return arg;
			
		}
		
		int[] arr = new int[2];
		
	
}
