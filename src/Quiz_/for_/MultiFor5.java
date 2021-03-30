package Quiz_.for_;

import java.util.Arrays;

public class MultiFor5 {

	public static void main(String[] args) {

		// 선택 정렬 방법 
		
		int[] arr = { 5, 23, 1, 43, 100, 200, 4 } ; // 길이가 7
		
		int temp = 0;
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
 
