package Quiz_.while_;

public class While7 {

	public static void main(String[] args) {
		// 금액을 큰 금액부터 거슬러 각각 몇개가 나와야 하는지 처리 
		int[] coin = { 1000 , 500, 100 , 50 , 10 } ; //동전의 금액
		int money = 17780;
		
//		17     1      2    1    3 = 24;
//		17000 +500 + 200 + 50 + 30 = 17780  
		
		
		int i = 0;
		while(i <coin.length) {
			int mok = money / coin[i];
			money = money - mok*coin[i];
//			money %= coin[i]
			System.out.println(coin[i]+" 개수 : " + mok);
			i++;
		}
		

	}

}  
