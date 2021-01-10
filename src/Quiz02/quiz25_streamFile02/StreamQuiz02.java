package Quiz02.quiz25_streamFile02;

import java.util.Date;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;

public class StreamQuiz02 {

	public static void main(String[] args) {
		
		// 1. Date클래스를 이용해서 File 경로에서 오늘날짜 ex ) 20200928.txt 파일을 만든다
		// 2. 내용은 아무거나
		// 3. 파일을 정상적으로 썻다면 , BufferedReader을 이용해서 파일을 읽어온다
		
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		String dayInfo = sdf.format(date);
		System.out.println(dayInfo);
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("D:\\course2\\java\\file\\" + dayInfo + ".txt"));
			System.out.println("내용을 입력해 주세요 ");
			
			String str = sc.nextLine();
			bos.write(str.getBytes());

			System.out.println("문서 저장완료 ");
			
			bis = new BufferedInputStream(new FileInputStream("D:\\course2\\java\\file\\" + dayInfo + ".txt"));
			
			byte arr[] = new byte[100];
	
			while(true) {
				int a = bis.read();
				if(a == -1) break;
				System.out.print((char)a);
			}
				
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
