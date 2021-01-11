package day05;

public class EnhancedFor1 {

	public static void main(String[] args) {
			
		int[] arr= {1,2,3,4,5};
		
		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		System.out.println("");
		
		
		int[] score = {33, 66, 44 } ;
		
		int sum =0;
		for (int s : score) {
			sum +=s;
		}
		double avg = (double)sum/arr.length;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
		
	}

} 
  
