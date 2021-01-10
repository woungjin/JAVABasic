package Quiz02.quiz21_StringAPI;

public class MathQuiz01 {

	public static void main(String[] args) {
		
		
		// 올림 메서드를 이용해서 1~10이 전달되면 1이 반환되는 page() 생성 
		// 11-20 값이 전달되면 2가 반환
		// 21-30 값이 전달되면 3이 반환

		
		System.out.println(page(12));
	}

	public static int page(int num) {
		return (int)Math.ceil(num/10.0);
	}
	
}
