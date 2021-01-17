package day08_Class;

public class Phone {

	String model;
	int price;
	String color;

	// 생성자 : 클래스 이름과 동일해야함
	Phone() {
		System.out.println("생성자 호출");
		model = "롤리팝";
		price = 200000;
		color = "검정";
	}

	Phone(String color) {
		this.color = color;
	}

	Phone(String color, int price) {
		this.color = color;
		this.price = price;
		model = "가로본능";
	}

	Phone(String color, int price, String pmodel) {
		this.color = color;
		this.price = price;
		model = pmodel;
 
	}

	void info() {
		System.out.println("----폰의 정보----");
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);

	}
}
