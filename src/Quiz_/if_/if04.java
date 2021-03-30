package Quiz_.if_;

import java.util.Scanner;

public class if04 {

	public static void main(String[] args) {

		// 1 ~ 20 까지의 랜덤한 정수중에 10 보다 작고 3의 배수이거나, 4의 배수라면 " 10 보다 작은 3또는 4의 배수" 출력

		int rd = (int) (Math.random() * 20 + 1);

		// 반대의 경우 "10보다 작지 않거나 3또는 4의 배수가 아닙니다 "

		if (rd < 10 && (rd % 3==0 || rd % 4 == 0)) {
			
		} else {
			System.out.println("10보다 작지 않거나 3또는 4의 배수가 아닙니다 ");
		}
		System.out.println("나온 수 : "+ rd);

		
		//-------------------------------------------------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int big = 0;
		int mid = 0;
		int small = 0;
		
		if (n1 > n2 && n1 > n3) {
			big = n1;
			if(n2 > n3) {
				mid = n2;
				small = n3;
			} else {
				mid = n3;
				small = n2;
			}
		}  else if (n2 > n1 && n2 > n3 ) {
			big = n2;
			if(n1> n3 ) {
				mid = n1;
				small = n3;
			} else {
				mid = n3;
				small = n1;
			}
		}  else if (n3 > n1 && n3 > n2) {
			big = n3;
			if(n1> n2) {
				 mid = n1;
				 small = n2;
			} else {
				mid = n2;
				small = n1;
			}
		} 	
		sc.close();
		System.out.printf("큰수 : %d , 중간 : %d , 작은값 : %d ",big,mid,small);

	}

} 
