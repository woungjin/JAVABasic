package day12_abs_inter.good;

// 클래스와 메소드는 둘이 같이 abstract가 따라 다닌다 
public abstract class HeadStore {

	// 1. 메소드의 abstract를 붙이면 추상메소드가 된다 . 이 메소드는 상속을 통해서 반드시 오버라이딩 되어야 한다 .
	// 2. 추상 메소드는 {}가 없다 
	// 		추상메소드가 하나라도 있다면 클래스도 추상클래스가 되어야 한다 ;
	// 3. 추상 클래스는 일반메소드 , 생성자 , 멤버변수 모두 사용할 수 있다 
	public abstract void apple() ;
	public abstract void banana();
	public abstract void orange();
	public abstract void melon();
	
	private String name = "호두과";
	
	public HeadStore() {
	
	}
	
	public String getName() {
		return name;
	}
	
}
  
