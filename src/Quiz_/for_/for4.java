package Quiz_.for_;

import java.util.Arrays;

public class for4 {

	public static void main(String[] args) {

//		int x = 1;
//		int y = 5;
//
//		// swap 
//		
//		int temp =x;
//		x = y ;
//		y = temp;
//		System.out.println("x의 값  : " + x + " , y 의 값 : "+y);

		// 1. 1~9 까지 배열의 값중에 절대 중복되지 않는 숫자로 만들어진 3개의 크기를 가진 배열을 뽑아냄
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[3];

		int temp=0; 
		for (int i = 0; i < arr1.length; i++) {

			while (true) {
				int rd = (int) (Math.random() * arr1.length);
				if (i != rd) {
					temp = arr1[i];
					arr1[i] = arr1[rd];
					arr1[rd] = temp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
