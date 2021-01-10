package day15_api.io.stream;

import java.io.FileInputStream;

public class InputStreamEx {

	public static void main(String[] args) {

		//		- 저장되있는 파일의 내용물을 가져와 읽어주는 형식 1. 파일을 읽어들이는데 사용하는 클래스 = FileInputStream 2. 생성자에
		//		 매개값으로 읽어들일 파일의 전체경로를 적습니다.

		try {

			FileInputStream fis = new FileInputStream("D:\\course2\\java\\file\\test2.txt");

			while (true) {
				int data = fis.read()1;
				if (data == -1)
					break; // read() 메소드가 읽을값이 없으면 -1을 반환( = break )
				System.out.print((char) data); // 숫자형태를 char형으로 만들어서 출력
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main
} // class
