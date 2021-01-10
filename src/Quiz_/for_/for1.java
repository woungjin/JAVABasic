package Quiz_.for_;

import java.util.Arrays;

public class for1 {

	public static void main(String[] args) {
		
			
		
		int[] a = {20 ,19,18,17,12,15,14,13,22,11,10,9,8,7,6,5,4,3,2,1} ;
		
		for (int i =1; i<a.length; i++) {
			int key = a[i];
			for (int k = i-1; k>=0; k--) {
				if(a[k] >key) {
					a[k+1] = a[k];
				}  
				 a[k] = key;				 
			}
		}
		
		System.out.println(Arrays.toString(a));
		
				
	}

}
