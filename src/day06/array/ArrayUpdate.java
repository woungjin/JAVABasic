package day06.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {


		// 배열의 insert 
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		
		int count = 0 ; // 입력받은 개수 카운트 = index
		System.out.println(Arrays.toString(arr));
		
		while(true) {
			System.out.print(" : ");
			String menu = sc.next();
			if(menu.equals("그만")) { // 문자열 비교 == .equals("")
				System.out.println("종료");
				break;
			}
			
			arr[count] = menu;
			System.out.println(Arrays.toString(arr));
			count++;
		}
		
		System.out.print("----- 입력받은 내용 -----\n[ ");
		for ( int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		
		
		 
	}

}
