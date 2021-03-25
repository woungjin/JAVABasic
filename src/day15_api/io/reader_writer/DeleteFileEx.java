package day15_api.io.reader_writer;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {

		// 폴더 삭제
		File file = null;
		try {
			file = new File("D:\\course\\Java\\file\\1.txt");

			if (file.exists()) { // 폴더가 존재하면 삭제
				file.delete(); // delete 성공시 true 반환 , 실패시 false 반환
				System.out.println("파일 삭제 성공");
			} else {
				System.out.println("해당 폴더가 존재하지 않습니다");
			}

		} catch (Exception e) {
 
		}
	}

}
