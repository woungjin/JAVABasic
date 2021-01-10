package day17_thread.runable;

public class Video implements Runnable {


		
		Video v1 = new Video();
		Download v2 = new Download();
		
		Thread t1 = new Thread(v1);
		Thread t2 = new Thread(v2);
		
		t1.start();
		t2.start();
		


}
