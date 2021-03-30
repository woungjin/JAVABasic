package Quiz_.for_;

import java.util.Arrays;

public class MultiFor6 {

	public static void main(String[] args) {

		
		
		// 버블 정렬 
		
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 ,7,2,10 };

	int temp =0;
	for(int i=1; i <arr.length-1;i++) {
		for(int j=0; j<arr.length-i;j++) {
			if(arr[j]> arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
//
//		int i = -1;	
//		int k = 0;
//		while (i < arr.length-2) {
//			i++;
//			int j = -1 ;
//			while( j<arr.length-2-i) {
//				j++;
//				if(arr[j] > arr[j+1]) {
//				    k = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = k;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}
} 
