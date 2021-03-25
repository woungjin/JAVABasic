package day15_api.io.stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*	
		 		// 내가 적은 문자를 그대로 txt에 적어서 저장시킴
		  		1. 문자를 써서 저장시 = FileWriter 클래스 사용
		  		2. 2byte 형태 이기에 문자를 쓰기에 적합
		 
		 */
		
		Writer fw = null;
		try {
			fw = new FileWriter("D:\\course\\Java\\file\\test.txt");
			String str = "오늘은 9월 25일 입니다~\r\n아 금요일이다.\r\n집에가야지";
			// 기존엔 커서가 \n시 \r을 써야만 제대로 입력이 됫다 지금은 자동으로 커서가 \r을 수행함 
			fw.write(str); // writer() 가 매개변수로 문자열을 받아준다 
			System.out.println("파일이 정상적으로 저장되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
 
}
