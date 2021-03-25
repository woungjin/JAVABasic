package day16_api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String dateInfo = sdf.format(date);
		
		File file = null; 	// 폴더 생성하기
		BufferedWriter bw = null;	// 폴더안에 파일 및 내용물 채우기
		BufferedReader br = null; 	// 파일 내용물을 가져오기 
		try {
			// --- 폴더 생성 ---
			file = new File("D:\\course2\\java\\file\\" + dateInfo ) ;
			 
			
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더 생성 완료 !");
				
			} else {
				System.out.println("해당 폴더가 존재합니다!");
			}
			
			// --- 파일 생성 ----
			System.out.println("파일 이름 입력 : ");
			String name = sc.nextLine();
			bw = new BufferedWriter(new FileWriter("D:\\course2\\java\\file\\" + dateInfo + "\\" + name +".txt"));
			
			// --- 내용물 작성 ---
	
				System.out.println("문장입력 :  ");
				String str1 = sc.nextLine();
				bw.write(str1+"\r\n");
				bw.flush();	

			// --- 파일을 받아와 읽기 ---
			br = new BufferedReader(new FileReader("D:\\course2\\java\\file\\" + dateInfo + "\\" + name +".txt"));
			String str;
			while((str = br.readLine())!= null) {
				System.out.print(str);
			}
			
			// --- 파일 삭제 ---
			System.out.println("===================================");
			file = new File("D:\\course2\\java\\file\\" + dateInfo + "\\" + name +".txt" );
			
			if(file.exists()) { // 파일이 존재하면 true
					file.delete();
					System.out.println("파일 삭제 성공!");
			} else {
				System.out.println("해당파일이 존재하지 않습니다!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				bw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		 
		
		
	}
}
