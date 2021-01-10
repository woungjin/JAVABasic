package day16_api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {


		/*
		  	＊ buffered가 붙은 클래스는 입출력 성능을 향상시키기 위한 클래스입니다
		  	＊ buffered에 outputStream이 있으면 , 바이트 기반, 쓰기위한 클래스 이다

		  	＊ 생성자 매개변수로 바이트 기반 클래스를 얻을수 있다

		  	- buffered가 붙어있는 클래스는 flush명령을 통해서 데이터를 밀어주는 작업을 해야한다 

		 */
		// FileOutputStream fos = new FileOutputStream("경로"); 
		// BufferedOutputStream bf = new BufferedOutputStream(fos);

		Scanner sc = new Scanner(System.in);

		BufferedOutputStream bf = null;
		try {
			// BufferedOutputStream의 매개변수는 최상위클래스로 ouputStream의 변수들을 받을수 있다
			bf = new BufferedOutputStream(new FileOutputStream("D:\\course2\\java\\file\\test2.txt"));

			System.out.println("문장을 입력해 주세요 : ");

			String str = sc.nextLine();

			bf.write(str.getBytes());	// getbyte로 바이트 배열로 변경해서 파일을 써 내린다 
			//bf.flush();					// 모은 데이터를 밀어주는 명령 == bf.close랑 비슷한 일  
			System.out.println("문자 저장 완료 ");

		} catch (Exception p) {
			p.printStackTrace();
		} finally {
			try {

				// close로 닫을때는 바깥쪽 클래스 부터 close처리한다 b
				bf.close();	// bj가 닫힐 때 자동으로 flush가 호출된다 
			} catch (Exception e) {

			}
		}
	}
}
