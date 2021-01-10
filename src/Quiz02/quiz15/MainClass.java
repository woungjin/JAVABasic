package Quiz02.quiz15;

public class MainClass {

	public static void main(String[] args) {
		MyCart my = new MyCart(5200);
		Tv tv = new Tv(4000,"tv");
		Computer computer = new Computer(600,"com");
		Radio radio = new Radio(500,"radio");
		Radio radio2 = new Radio(500,"radio");
		
		Product[] product = {tv,computer,computer};
		
		my.buy(product);

	}

}
