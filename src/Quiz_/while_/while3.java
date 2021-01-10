package Quiz_.while_;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {

		
		// 1 . 1 ~ 입력받은 정수까지 3의 배수이거나 4의 배수일 경우에 출력 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int i = 1;
		while (i<=n) {
			if(i % 3 ==0 || i % 4 == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		
		System.out.println("-----------------------");
		
		// 2. 1 ~ 입력받은 수 까지의 6의 배수의 합 
		
		i = 1;
		int sum = 0; 
		while(i <= n) {
			
			if(i % 6 == 0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("\n6의 배수의 합 : "+ sum);
		
		
		System.out.println("-----------------------");
		
		// 3. 1 ~ 100 까지 정수중 4의 배수이면서 8의 배수가 아닌것의 개수 
		
		int count = 0;
		i = 1;
		while(i<=100) {
			
			if(i % 4 ==0 && i % 8 !=0) {
				count++;
			}
			i++;
		}
		
		System.out.println("4의 배수이면서 8의 배수가 아닌것의 개수 : " + count);
		
		
		System.out.println("-----------------------");
		
		// 4. 1000의 약수의 개수  
		
		count = 1;
		int j = 2;
		int th = 1000;
		while(j<=th) {
			
			if (th % j ==0) {
				count++;
			}
			j++;
			
		}
		System.out.println("약수의 개수 : "+ count);
		
		
		
	} // main 

}
