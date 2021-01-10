package day10_public.encap.bad;

public class MyDate {


		// 은닉을 사용하지 않았을때 
		
		public int year ;
		public int month;
		public int day;
		public String ssn; // 주민번호
		
		public void info( ) {
			System.out.println("생일 : " + year + "년  " + month +"월 " + day + "일"  );
			System.out.println("주민번호 : "  + ssn);
		}

	

}
