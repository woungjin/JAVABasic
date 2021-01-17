package day07;

import java.util.Arrays;

public class arrays_method {

	public static void main(String[] args) {
			
		 int[] arr = {1,2,3,4,5};
		 
		 int[] arr2 = method2(arr);
		 System.out.println(Arrays.toString(arr2));

		 String[] arr3 = method3();
		 System.out.println(Arrays.toString(arr3));
		 
	}
	
	
	static void method1(int[] arr ) {
		System.out.println(Arrays.toString(arr));
	}
	static int[] method2(int[] arr ) {
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[2];
		return arr2;
	}
	
	static String[] method3() {
		String[] week = {"월","화","수"} ;
		
		return week;
		 
	}
}
