package day17_thread.runable;

import java.util.Random;

public class VoteThread implements Runnable {

	Random rd = new Random();
	int sum = 0; 
	String str="" ; // 별 개수 누적할 변수

	public void run() {

		while(true) {
			// 한바퀴 회전시 랜덤수 생성 0 ~ 9  
			int num = rd.nextInt(10);
			sum += num; 

			if(sum < 100) {// 개표율이 100 미만일때
				for(int i = 1; i<= num; i++) {
					str +="*";
				}
				
				System.out.println(Thread.currentThread().getName() + "의 개요퓰 : "+ sum +"% : "+str);
			} else {
				sum = 100;
				str = "";
				for (int i = 1; i<= 100; i++) {
					str="*";
				}
				System.out.println(Thread.currentThread().getName() + "의 개요퓰 : "+ sum +"% : " +str);
			}
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}

}
