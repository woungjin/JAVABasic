package day03.While_;

public class do_while {

	public static void main(String[] args) {
	
		
		int i = 1; 
		int sum = 0 ;
		do {
			sum +=i;
			
			i++;
		} while(i<=10);
		
		System.out.println("1~ 10까지의 합 : " + sum);
		
		
	}

}
