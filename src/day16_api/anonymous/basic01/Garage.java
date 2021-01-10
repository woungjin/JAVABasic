package day16_api.anonymous.basic01;

interface Car {
	public void run();
	
}

class Tico implements Car {
	
	public void run() {
		System.out.println("티코~");
	}
}

public class Garage {
	
	// public Car car = new Tico();
	public Car car = new Car() {
		
		public void run() {
					System.out.println("익명객체 티코입니다 ");
		}
		
	};
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();	
		
		
	}
	
	
	
}
