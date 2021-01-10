package day16_api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
 
public class BufferedInputStreamEx {

	public static void main(String[] args) {

		// ＊ BufferedInput
		// 1. Buffered가 붙은 InputStream = 바이트 기반 , 입력 속도를 향상시키기 위한 클래스
		BufferedInputStream bf = null;
		try {
			bf = new BufferedInputStream(new FileInputStream("D:\\course2\\java\\file\\test2.txt"));

			// FileInput과 값을 꺼내오는게 동일
			while (true) {
				int a = bf.read(); // 한글자 읽어서 반환
				if (a == -1)
					break;
				System.out.print((char) a);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 
