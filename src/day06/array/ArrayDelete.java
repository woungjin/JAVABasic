package day06.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {


		// Update 
		Scanner sc = new Scanner(System.in);
		String[] arr = {"강타","문희준","토니안","이재원","장우혁" };
		
		System.out.print("수정할 학생의 이름 : ");
		String name = sc.next();


		
		boolean flag = false;
		for (int i =0; i < arr.length; i++) {
			if(name.equals( arr[i])) {
				System.out.println(arr[i] + "이름을 수정합니다");
				System.out.print(" : ");
				arr[i] = sc.next();
				flag = true;
			} 
		}
		
		if(!flag) {
			System.out.println("존재하지 않습니다");
		} else {
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
