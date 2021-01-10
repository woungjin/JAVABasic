package Quiz02.quiz25_streamFile02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz3 {

	public static void main(String[] args) {

		// 1. Date클래스를 이용해서 File경로에 하위폴더로 오늘날짜 20200928file 폴더를 생성한다

		// 2. 스캐너로 파일명을 입력받고 파일명.txt파일을 쓴다 
		// 3. exit를 입력받을 때까지 엔터를 포함해서 실시간으로 입력받는다 -> 플래쉬로 한 문장씩 저장되게끔

		// 4. 파일이 정상적으로 끝낫으면  exit로 나오자 

		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		BufferedReader br = null;
		BufferedWriter bw = null;
		File file = null;
		try {	
			// -------------- 폴더 생성 -----------
			String dateInfo = sdf.format(date);
			String path = "D:\\course2\\java\\file\\"+dateInfo +"file";

			file = new File(path);
			if (!file.exists()) {
				file.mkdir();
				System.out.println(dateInfo+"폴더생성 완료~!");
			} else {
				System.out.println(dateInfo + "폴더가 존재합니다 ");
			}
			
			//----------- 파일 생성 ------------------
			System.out.println("파일명 : ");
			String name = sc.nextLine();
			
			bw = new BufferedWriter(new FileWriter(path +"\\" + name + ".txt"));

			while(true) {
				System.out.println("입력 하세여  : ");
				String str = sc.nextLine();
				
				if(str.equals("exit")) {
					System.out.println("종료합니다");
					break;
				} 
				
				str+="\r\n";
				bw.write(str);
				bw.flush();
				
			}
			System.out.println("프로그램 정상 종료 ");
			
			br = new BufferedReader(new FileReader(path+"\\" + name +".txt"));
			String result;
			while( (result = br.readLine())!= null) {
				System.out.println(result);
			}

		}catch (Exception e) {
			System.out.println("폴더생성에 문제 발생 ");
		}
		
		
		
		
		
		

		


	}

}
