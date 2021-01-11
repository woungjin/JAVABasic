package day06.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {


//		// delete
		
		Scanner sc = new Scanner(System.in);
		String[] arr = {"강타","문희준","토니안","이재원","장우혁" };
		  
		System.out.print("수정할 학생의 이름 : ");
		String name = sc.next();
		
		int count = arr.length;
		int index ;
		boolean check = true;
		
		for(int i = 0; i < count ; i++) {
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "을 삭제합니다 ");
				index = i ;
				for( int j = i; j<count-1;j++) {
					arr[j] = arr[j+1];
				}
				count--; // arr.length의 전체 개수를 1개 줄여준다
				check = false;
			}
		}
		if(check) {
			System.out.println("존재하지 않습니다");
		} else {
			for( int i =0 ; i < count ; i++) {
				System.out.print(arr[i] + ", ");
			}
		}
		
	}

} 
