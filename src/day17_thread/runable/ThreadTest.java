package day17_thread.runable;

public class ThreadTest implements Runnable{
	
	// Runable 인터페이스 상속
	// 쓰레드의 기능을 사용하고 싶다면, Thread클래스의 static로 사용해야한다 
	
	@Override
	public void run() {
		// 현재 쓰레드의 이름 
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("쓰레드시작");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); // 1초 stop
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
		}
		
		System.out.println("쓰레드 종료");
		
	}

	
	
	
}
