package day10_public.encap.good;

public class MyDate {

		// 은닉을 사용한 변수에 접근하는 방법 
		
		private int year;
		private int month;
		private int day;
		private String ssn;
		
		// 은닉
		
		public void setYear(int year) {
			if(year < 1 || year > 2020) {
				System.out.println("잘못된 값 입력입니다");
			} else {
				this.year = year;
			}
		}
		
		
		// getter 메소드 선언
		// 1. 은닉변수에 값을 조회하는 메소드
		// 2. setter와 마찬가지로 접근제어자는 public선언하고 이름은 get + 변수명으로 지정
		
		public int getYear() {
			return this.year;
		}
		
		public void setMonth(int month) {
			if(month >=1 && month <=12) {
				this.month = month;
			} else {
				System.out.println("잘못된 값 입력 ");
			}
		}
		
		public int getMonth() {
			return this.month;
		}
		
		public void setDay(int day) {
			if(day >=1 && day <=31) {
				this.day = day;
			} else {
				System.out.println("잘못된 값 입력입니다 ");
			}
		}
		
		public int getDay() {
			return this.day;
		}
		
		public void setSsn(String ssn) {
			if(ssn.length() <=13) {
				this.ssn = ssn;
			}
		}
		
		public String getSsn() {
			return this.ssn;
		}
		
		
}
