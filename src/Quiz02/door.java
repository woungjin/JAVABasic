package Quiz02;

public class door{

	int password;
	String model;
	
	
	public door(int password, String model) {
		this.password = password;
		this.model = model;
	}
	
	boolean open(int password) {
		if(this.password == password) {
			System.out.println("잠금해제 성공 " + model + "을 엽니다 ");
			return true;
		} else {
			System.out.println("비밀번호 오류");
			return false;
		}
	}
	
	void close(boolean flag) {
		if(flag) {
		System.out.println("문을 닫습니다");
		} else {
		System.out.println("문이 열려있지 않습니다");
		}
	}
	
	
	
	
}
