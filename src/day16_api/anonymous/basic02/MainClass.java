package day16_api.anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.getRemote().volumeUp();
		
		Tv tv = new Tv();
		tv.getRemote().volumeDown();
 
	}

}
