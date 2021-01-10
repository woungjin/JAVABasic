package day03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		// 1. 배열의 선언
		int[] arr;

		// 2. 생성 - 크기 명시
		arr = new int[5];

		// 3. 초기화
		arr[0] = 31;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 34;
		arr[4] = 65; 
		
		// 4. 사용
		System.out.println("arr[3] : " + arr[2]);

		arr[2] = 123;
		System.out.println("배열의 3번째 값 : " + arr[2]);

		// 5. Arrays.toString(?)
		System.out.println(Arrays.toString(arr));

		// 6. 길이 - .length
		System.out.println(arr.length);
		
		// 7. 선언 + 생성
		byte[] arr2 = new byte[10];
		 
		// 8. 선언 + 생성 + 초기화
		short[] arr3 = new short[] {1,2,3,4,5};
		 
		String[] arr5 = {"월","화","수","목"};
		System.out.println(Arrays.toString(arr5));
		
		
	
		
	}

}
