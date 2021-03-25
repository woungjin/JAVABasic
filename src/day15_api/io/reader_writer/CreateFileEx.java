package day15_api.io.reader_writer;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {

		// 1. 자바에서 외부경로로 폴더를 생성시엔 File클래스 사용
		// 2. 생성자 매개변수로 폴더를 생서할 경로 + 폴더명 지정
		try {
			File file = new File("D:\\course\\Java\\file\\test_folder");

			if (!file.exists()) {// 해당파일이 존재하면 true , 존재하지 않으면 false
				file.mkdir(); // 폴더 생성
				System.out.println("폴더생성 완료 ");
			} else {
				System.out.println("해당폴더가 존재합니다");
			}

		} catch (Exception e) {

		}

	}

} 
