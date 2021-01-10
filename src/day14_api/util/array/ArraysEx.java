package day14_api.util.array;

import java.util.*;

public class ArraysEx {

	public static void main(String[] args) {

		// arrays.
		
		int[] arr = {5,4,3,2,1};
		
		
		// 정렬
		Arrays.sort(arr);
		
		// 확인
		System.out.println(Arrays.toString(arr));
		
		// 배열의 검색
		int index = Arrays.binarySearch(arr, 3);
		System.out.println("3이 있는 index : " + index);
		
		
		// 없는값은 이상한 인덱스 값을 반환한다 
		int index2 = Arrays.binarySearch(arr, 100); 
		System.out.println(index2);
		
		// 배열 복사 
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		
		// 배열복사2 원하는 곳만 복사하기
		int[] newArr2 = Arrays.copyOfRange(arr,2, arr.length);
		System.out.println(Arrays.toString(newArr2));
		
		
		// 배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열 요소가 같다 ");
		}
		
		
	}

}
