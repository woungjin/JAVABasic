package day08_Class;

public class PhoneMain {

	public static void main(String[] args) {
		Phone black = new Phone();
		black.info();

		Phone red = new Phone("빨강", 500000);
		red.info();

		Phone green = new Phone("초록색", 1000000, "아이폰");
		green.info();
	}

}
