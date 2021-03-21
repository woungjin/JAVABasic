package day13_exception.throws_;

public class ThrowsEx2 {

	public void bbb(int i) throws Exception {
		System.out.println("bbb 호출");
		System.out.println(10 / i);
		System.out.println("bbb 종료 ");
	}

	public void aaa() throws Exception {
		System.out.println("aaa 호출");
		bbb(0);
		System.out.println("aaa 종료");
	}

	// 생성자
	public ThrowsEx2() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}

}
 
