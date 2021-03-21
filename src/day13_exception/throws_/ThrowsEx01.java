package day13_exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		  	throws 메소드나 생성자 에서 발생되는 예외를 넘기는 코드 = throws 예외를 강요할때 사용
		 
		 */	
		try {
			greet(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 대표적인 throws메소드
		try {
			Class.forName("gg");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없습니다");
			
		}
		
		// 대표적인 throws생성
		try {
			new FileInputStream("$#$#$#$");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
		}
		
		

	}

	
	private static String[] greeting = {"헬로" , "안녕", " 니하오"};
	
	public static void greet(int index) throws Exception {
		System.out.println(greeting[index]);
	}

	
	
	
}
 
