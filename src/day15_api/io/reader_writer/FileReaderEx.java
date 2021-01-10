package day15_api.io.reader_writer;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		
		// 	1. 문자기반으로 읽어들이는  = FileReader 클래스 
		//  2. 2byte 단위로 읽고 쓰기 때문에 문자를 쓰기 적합 함
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\course\\Java\\file\\test.txt");
			
			while(true) {
				int i = fr.read(); // 문자를 하나씩 읽어들임 
				if(i == -1 )break;	// 읽어들일 문자가 없다면 -1울 반환	
				System.out.print((char)i);	// 문자형 반환 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
