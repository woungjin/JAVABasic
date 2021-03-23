package day14_api.util.date;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		
		
		// Calendar 컴퓨터 운영체제에 있는 달력관련 기능을 사용
		// 싱글톤 사용 
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.DAY_OF_YEAR);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		int hour = cal.get(Calendar.HOUR);

		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분",year,month,date,hour,minute,second);
		
	}

} 
