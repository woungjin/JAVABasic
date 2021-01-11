package day05;

public class Break1 {

	public static void main(String[] args) {


		/* 
				＊ 무한 반복문
				
				- 반복문의 횟수를 모를때 사용 
				- 자바에서는 주로 While(ture)를 사용
				
				
		 */
		
		int i = 1;
		while (true) {
			if ( i == 15 ) {
				break;
			}
			i++;
			System.out.println(i);
		}
		
		
		

	}

} 
