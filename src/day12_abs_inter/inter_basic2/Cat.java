package day12_abs_inter.inter_basic2;

// implements가 가장 마지막에 와야한다
public class Cat extends Animal implements Ipet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹습니다");
		
	}
	
	@Override
	public void Play() {
		System.out.println("냥냥이는 방에서 놀아요 ");
		
	}
	
	
}
 
