package day10_public.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate() ;
		me.setYear(2000);

		System.out.println("년도 : " + me.getYear());
		
		me.setMonth(1);
		System.out.println("월 : " + me.getMonth());
		
		me.setDay(1);
		System.out.println("일 : " + me.getDay());
		
		me.setSsn("이름");
		System.out.println("String : " + me.getSsn());
		
		
		
		
	}

}
 
