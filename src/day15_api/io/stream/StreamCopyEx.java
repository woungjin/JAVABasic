package day15_api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopyEx {

	public static void main(String[] args) {
	
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("D:\\course\\Java\\workspace\\Java\\src\\day14_api\\io\\stream\\a.jpeg");
			newFile = new FileOutputStream("D:\\course\\java\\file\\copy.jpg"); // 써내릴 경로
			
			byte[] arr = new byte[100];
			
//			while(true) {
//				// arr길이만큼 데이터를 읽어서 arr에 저장 , 더 읽을 데이터가 없으면 -1 반환 
//				int result = oldFile.read(arr);
//				
//				System.out.println(result);
//				if(result == -1) break ;//탈출
//				
//				//newFile.write(arr);
//				// arr을 0 ~ result 길이 값 까지 
//				newFile.write(arr, 0, result);
//				
//			}
			int result;
			while( (result = oldFile.read(arr)) != -1) {
				newFile.write(arr,0,result);
			}
			System.out.println("파일이 정상적으로 복사되었습니다");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

	private static void write(byte[] arr) {
		// TODO Auto-generated method stub
		
	}

}
 
