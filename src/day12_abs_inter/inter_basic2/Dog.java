package day12_abs_inter.inter_basic2;

public class Dog extends Animal implements Ipet{

	@Override
	public void eat() {
		System.out.println("멍멍이는 사료를 먹습니다");
		
	}
	@Override
	public void Play() {
		System.out.println("멍멍이는 공을 가지고 놉니다");
		
	}
	
}
 
