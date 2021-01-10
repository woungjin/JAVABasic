package day15_api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	/*
	 			// 파일의 이름과 내용물을 입력받아 저장시키는 형식 
	 * ＊		 1. FileOutputStream : 파일을 쓸 때 사용하는 클래스 
	 * 	     2. 생성자 매개값으로 쓸 전체 경로를 가져온다
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명");
		String name = sc.next();
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\course\\Java\\file\\" + name + ".txt");
			System.out.println("문장을 입력하세요 ");
			sc.nextLine(); // next() 다음에 nextLine()을 쓰려면 , 남아있는 \n값을 다시 초기화를 시켜주어야 한다 
			String str = sc.nextLine();
			// 입력한 내용을 배열로 바꾸어야 한다 
			// 따라서 문자열을 getBytes()로 byte[]형으로 변환시켜준다			
			byte[] arr = str.getBytes();	
		 
			fos.write(arr); // catch (IOException e) 문을 만들어 줘야함 
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
