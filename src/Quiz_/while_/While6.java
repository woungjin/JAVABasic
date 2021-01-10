package Quiz_.while_;

import java.util.Arrays;
import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int size = sc.nextInt();
		
		int i = -1;
		int[] iarr = new int[size];
		while(i < size-1) {
			i++;
			iarr[i]= i+1;
			
		}
		
		System.out.println("배열 iarr : " + Arrays.toString(iarr));
		
		
	}
		
}
