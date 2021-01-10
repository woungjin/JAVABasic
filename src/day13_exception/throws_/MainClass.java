package day13_exception.throws_;

public class MainClass {

	public static void main(String[] args) {

		try {
			new ThrowsEx2();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
}  