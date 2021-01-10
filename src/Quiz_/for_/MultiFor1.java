package Quiz_.for_;

public class MultiFor1 {

	public static void main(String[] args) {
		
		
		// 2~9 구구단 출력
		for(int i =1 ; i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9;j++) {
				System.out.printf("%d x %d = %d",i,j,i*j);
				System.out.println("");
			}
			System.out.println("");
		}

	}

}
