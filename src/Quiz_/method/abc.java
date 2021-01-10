package Quiz_.method;

import java.util.Arrays;

public class abc {

	public static void main(String[] args) {

		int[] arr = lottoNum();
		long money= lottoRun(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(money);


	}

	static int[] lottoNum() {

		int[] lotto = new int[6];
		int count = 0;
		boolean flag = false;
		while (count < 6) {
			// boolean flag = false로 둔다
			// 랜던값을 생성하고
			int rd = (int) (Math.random() * 45 + 1);
			// for문으로 같은값이 들어있는지 확인한다
			for (int i = 0; i < lotto.length; i++) {
				if (lotto[i] == rd) {
					count--;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				lotto[count] = rd;
				count++;
				flag = false;
			}
			// 같은값이 있다면 멈추고 나와서 while문을 다시 돌린다
			// 만약 같은값이 없다면 flag = true로 둬서 if(flag) 라면 lotto에 값을 집어넣고 count는 lotto값만큼 늘어 난다

		}
		Arrays.sort(lotto);
		return lotto;
	}

	static long lottoRun(int[] arr) {
		long money=0; ; // 틀린횟수
		 while(true) {
			int[] arr2 = lottoNum();
			if(Arrays.equals(arr, arr2)) {
				money*=1000;
				break ;
			} else {
				money++;
			}
		}
		return money;
		
		
	}


}
