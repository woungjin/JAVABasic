package Quiz_;

public class Quiz05 {

	public static void main(String[] args) {

		// -5 ~ 5 까지 랜덤값을 만들고 0 이라면 0 출력, 양수라면 양수, 음수라면 음수 출력
		// 3항 연산으로 처리

		int rn = (int) (Math.random() * 12 - 6);
		System.out.println("랜덤값 : " + rn);

		String str = rn < 0 ? "음수" : rn == 0 ? "0" : "양수";
		System.out.println("값 : " + str);

	}

}
