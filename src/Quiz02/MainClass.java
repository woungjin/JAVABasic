package Quiz02;

 

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		  		＊ 퀴즈 
		  	
		  	현실 속에서 찾아볼수 있는 물건 등을 생각해서 클래스로 표현 
		  	멤버 변수 2개 이상 , 메소드 2개 이상 
		  	
		  	
		 */
		
		door dr = new door(1234, "학원 문");
		boolean flag = dr.open(1234);
		dr.close(flag);
		

	}

}
