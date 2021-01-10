package Quiz_;

public class Quiz02 {
	public static void main(String[] args) {
			
		// 1~100 랜덤 정수 발생후 짝수인지 홀수인지 출력하는 3항 연산식
		
		int rn = (int) (Math.random()*100 +1);
		
		String str = rn % 2 == 0 ? "짝수입니다" : "홀수 입니다";
		System.out.println("랜덤수 : " + rn +"은 "+ str);
	}
}
