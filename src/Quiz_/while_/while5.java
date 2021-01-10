package Quiz_.while_;

import java.util.Arrays;

public class while5 {

	public static void main(String[] args) {

		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(arr));

		int i = -1; 
		int sum = 0;
		while(i <arr.length-1) {
			
			i++;
			sum+=arr[i];
		}
		System.out.println(sum);
		
		
		
		
	}

}
