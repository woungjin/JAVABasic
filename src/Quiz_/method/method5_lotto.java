package Quiz_.method;

import java.util.Arrays;

import day07.arrays_method;

//	arrays.equals(arr1, arr2); ? true : false 를 나타냄 

public class method5_lotto {

	public static void main(String[] args) {

		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));

		long count = lottoRun(arr);
		System.out.println("결과 : " + count);
	}

	static int[] lottoNum() {

		int[] arr = new int[6];
		int index = 0;
		while (true) {
			boolean flag = true;

			if (index == 6)
				break;

			int num = (int) (Math.random() * 45 + 1);

			// 중복검사
			for (int i = 0; i < index; i++) {
				if (arr[i] == num) { 
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[index] = num;
				index++;
			}
		}

		return arr;

	}

	static long lottoRun(int[] arr ) {
		long count = 0 ;
		Arrays.sort(arr);
		while(true) {
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			if(Arrays.equals(arr, arr2)) {	// 비교하기전 정렬 
				return count * 1000; 		// 결과 반환과 동시에 break
			}
			count++;
		}

	}

}