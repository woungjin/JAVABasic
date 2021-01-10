package day11_static.static_.singleton;

public class Singleton {

	// 싱글톤 패턴 : 객체가 1개만 생성되도록 클래스를 구성함 
	// 1. 자신의 클래스에서 스스로의 객체를 1개 생성
	private static Singleton instance = new Singleton();
	
	// 2. 외부에서 객체 생성 못하도록 생성자를 1개로만 생성하고 private을 붙인다 
	
	private Singleton() {}
	
	// 3. 외부에서 이 클래스의 객체를 요구할 때 getter메소드를 생성해서 
	//  2번에서 생성해둔 하나의 객체를 제공한다 
	
	public static Singleton getInstance() {
		if(instance == null) {
			Singleton instance = new Singleton();
		}
		return instance;
	} 

	private String name = "홍길동";
	public String getName() {
		return name;
	}
	
	
	public void add() {
		System.out.println("1");
	}
	
	
}
