package day14_api.util.date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		
		// Date는 util를 import해야한다 sql = X 
		Date date = new Date();
		
		// 포맷형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now = sdf.format(date);
		
		System.out.println(now);
		
		System.out.println("----------------------------");
		sdf.applyPattern("YYYYMMdd"); // 패턴적용
		String now1 = sdf.format(date);
		System.out.println(now1);
		
		System.out.println("----------------------------");
		
		
 
	}

}
