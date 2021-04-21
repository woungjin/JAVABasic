package Quiz02.quiz24.StreamFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class StreamQuiz01 {

	public static void main(String[] args) {
	
		/* 
		  		1. 스캐너를 통해서 파일명 입력받기
		  		2. upload폴더에 해당파일이 있다면, 해당파일을 uploadcopy폴더로 복사 
		  			파일명이 없으면 "파일이 없습니다" 예외문구를 출력
		  		3. 복사도중 에러가 발생하면 , " 파일 처리중 예외 발생 
		
		 */ 
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("불러올 파일 이름을 입력해 주세요 : ");
			String name = sc.next();

			oldFile = new FileInputStream("D:\\course\\Java\\file2\\upload\\" + name + ".txt");
			newFile = new FileOutputStream("D:\\course\\Java\\file2\\uploadcopy\\" + name+".txt");
					
			byte[] arr= new byte[1];
			
			int result;
			boolean flag = true;
			while((result = oldFile.read(arr)) != -1 ) {
				newFile.write(arr);
				flag = false;
			}
			if(!flag) {
				System.out.println(name+"파일 복사 성공!");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("찾으시는 파일이 없습니다.");
		} catch (Exception e ) {
			System.out.println("파일 처리중 예외 발생");
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
 
	}

}
