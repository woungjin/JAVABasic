package day17_thread.runable;

public class MainClass {

	public static void main(String[] args) {
		// Runable을 상속받은 클래스는 직접 Thread클래스에 전달해서 실행한다 
		// run만 사용이 가능하므로 Thread로 생성해줘야 Thread의 기능또한 사용이 가능하다
		ThreadTest t = new ThreadTest();
		
		Thread thread = new Thread(t,"쓰레드1"); // 동작시킬 클래스, 이름 
		thread.start();
		
		// 메인클래스랑 ThreadTest랑 따로따로 돌아가는게 보인다 
		System.out.println("메인종료~~~");
		
		
		
		
	}

}
 
