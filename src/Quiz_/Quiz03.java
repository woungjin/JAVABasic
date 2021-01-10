package Quiz_;

public class Quiz03 {
	public static void main(String[] args) {
			
		// 절대값 구하기
		
		int rn = (int) (Math.random() *12 -6);
		System.out.println("랜덤값 : " + rn);
		
		int r = rn < 0 ? rn = -(rn): rn;
		System.out.println("절대값은 : " + r );
	}
}
