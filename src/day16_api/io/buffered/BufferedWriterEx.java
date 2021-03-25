package day16_api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {

		// BufferedWriter = 문자 기반을 읽음 , 성능향상 스트림
		// 순서대로 readLine으로 두문장을 받아서 파일을 쓰세요

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("D:\\course2\\java\\file\\test3.txt"));

			System.out.println("첫번째 문자 입력 ");
			String str1 = sc.nextLine();
			System.out.println("두번쨰 문자 입력 ");
			String str2 = sc.nextLine();

			bw.write(str1 + "\r\n" + str2); // 문자열을 매개변수로 받음
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
}
