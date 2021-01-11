package day06.array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSet {

	public static void main(String[] args) throws InterruptedException {

		// 자리바꾸기 시뮬

		// 1. 사람수 입력받기
		// 2. 입력받은 사람수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장 .
		// ex ) 25입력수 = 1~25 만큼 숫자가 중복되지 않게 배열에 배정
		// 3. 해당 배열의 크기만큼 ○를 출력
		// 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택
		// 5. 제대로된 좌석이라면 자리번호를 공해가면 되고 제대로 된 선택이 아니라면 경고문을 띄운다
		// 6. 선택된 자리는 ●로 표시
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수 입력  : ");
		int size = sc.nextInt();

		int[] arr = new int[size]; 	// 랜덤값이 들어갈 좌석 배열 
		int index= 0 ;

		start : while(true) {		// continue 사용
			if( index == size) break;

			int seat = (int) (Math.random()*size+1);

			// 랜덤값과 배열의 index 번까지 동일한 값이 있는지 확인 
			for(int i = 0; i < index; i++) {
				if (arr[i] == seat) {
					continue start;	
				} 
			}
			arr[index]= seat;
			index++;
		}
		System.out.println(Arrays.toString(arr));

		while(true) {
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%4d",i+1);
			}
			System.out.println();
			for(int i = 0 ; i<arr.length; i++) {				
				if(arr[i] == 0) {
					System.out.printf("%4s","●");
				} else {
					System.out.printf("%4s","○");
				}
			}

			System.out.print("\n - 번호를 선택하세요 : ");
			int seat = sc.nextInt();
			if(seat == 0 ) {
				System.out.println("프로그램 종료");
				break;
			}

			if(arr[seat-1] == 0 ){
				System.out.println("제대로 선택해주세요 ");
			} else {
				System.out.println(3);
				Thread.sleep(1000);
				System.out.println(2);
				Thread.sleep(1000);
				System.out.println(1);
				Thread.sleep(1000);
				 System.out.println("자리 번호 : " +arr[seat-1]);
				 arr[seat-1] = 0;
			}

				
		}


	} // main

}




