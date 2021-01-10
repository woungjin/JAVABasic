package day03;

public class IfEx01 {

	public static void main(String[] args) {
		// 0 ~ 100 까지의 랜덤 함수
		int point = (int) (Math.random() * 101);

		if (point >= 60) {
			System.out.println("60점 이상 축하합니다");
		} else {
			System.out.println("60점 미만 불합격입니다.");
		}

//		if(point <60) {
//			System.out.println("60점 미만 불합격입니다.");
//		}

	}

}
