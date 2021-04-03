package Quiz02.quiz08_super;



public class Car {
	
	String model;
	int speed;
	
	//1. model을 전달받아서 model에 저장하는 생성자를 생성하세요

	Car(String model ) {
		this.model = model;
		
	}
	
	void accel(int speed) {
		if(speed >= 150) {
			System.out.println("150이상 속도를 올릴 수 없습니다");
		} else {
			this.speed = speed;
		}
		
		/*
		2. 멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
		그렇지 않으면 멤버변수를 매개변수로 변경하세요
		*/

	} 
	
	void run() {
		for(int i = 0; i<200 ; i+=30) {
			accel(i);
		}
		
		/*	
		3. 0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		*/

		
	}
}







