package day16_api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReader_UTF8 {

	public static void main(String[] args) {
		
		
		// - InputStreamReader는 InputStream타입의 클래스를 Reader 클래스 형태로 읽어주는 매개자 이다 
		// 1. 키보드를 통해 값을 받을수 있고
		// 2. 인코딩 형식을 지정해서 파일을 읽을 수 도 있다 .
		// 
		
		try {	// 키보드로 부터 받는 방법 
			// BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			
			// inputSTream이 부모, file 자식 
//			InputStream i = new FileInputStream("경로");
//			
//			Reader is = new InputStreamReader(i, "UTF-8");	// inputStream , 디코딩을 받는다
//			BufferedRdader bf = new BufferdReader(is); // Reader 타입을 받는다 
																																	// 파일 자체가 가지고있는 형식으로 읽어들인다 , 즉 지정해서 파일타입을 해석해서 가져온다
			BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course2\\java\\file\\test4.txt"), "UTF-8"));
			
			String str = null;
			
			while((str=bf.readLine()) != null ) {
				System.out.println(str);
			}
			
			
			
		} catch (Exception e) {
			
		}

		
		
		
	}

}
