package day12_abs_inter.bad;

public class Store extends HeadStore {

	
	public void apple() {
		System.out.println("서울 지점에 사과 500");
		
	}

	public void banana() {
		System.out.println("서울 지점에 바나나 700 ");
	}

	
	public void melon() {
		System.out.println("서울 지점에 멜론 800");
	}

	public void orange() {
		super.orange();
	}
	
}
