package day12_abs_inter.good;

public class Store extends HeadStore{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override        
	public void apple() {
		System.out.println("서울 지점의 사과500원");
		
	}

	@Override
	public void banana() {
		System.out.println("서울 지점의 바나나 700");
		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점의 오렌지 900");
		
	}

	public void melon() {
		System.out.println("멜론 10000");
	}
	 
	
}
