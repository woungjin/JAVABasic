package day16_api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferdReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		try {
			//  1. 경로로 부터 파일을 받아와 읽는법					
			br = new BufferedReader(new FileReader("D:\\course2\\java\\file\\test4.txt"));
			String str;  
			
			while((str = br.readLine()) != null ) { //readLine() - 한줄을 통째로 읽어서 가져온다. 
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}  
}  
 
