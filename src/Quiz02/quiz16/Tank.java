package Quiz02.quiz16;

public class Tank extends Unit {

	private int flag = 1;
	
	public Tank() {
		super(0, 0, 100);
	}
	public void location() {
		System.out.println("탱크의 현재 위치 x : " + this.getX() + " y : " + this.getY());
	}

	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void stop() {
		super.stop();
	}

	public void changeMode() {
		if (flag % 2 !=0) {
			System.out.println("공격 모드로 변경");
		} else { 
			System.out.println("공격 모드 해제 ");
		}
		flag++;
	}
	

}
 
