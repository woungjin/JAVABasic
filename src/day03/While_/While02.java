package day03.While_;

public class While02 {

	public static void main(String[] args) {

		// 짝수의 개수 구하기

		int count = 0;
		int i = 1;

		while (i <= 100) {

			if (i % 2 == 0) {
				count++;
			}

			i++;
		}

		System.out.println("1 ~ 100 짝수의 개수 : " + count);

	}

}
