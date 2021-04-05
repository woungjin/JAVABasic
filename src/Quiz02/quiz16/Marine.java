package Quiz02.quiz16;

public class Marine extends Unit{
	
	private static int attack ;
	private static int armor ;
	static {
		attack = 5;
		armor = 0;
	}
	
	public Marine() {
		super(0,0,60);
	}

	// 마린의 현재 위치를 x,y 출력 
	public void location() {
		System.out.println("마린의 현재 위치 x : " + this.getX() + " y : " + this.getY() );
	}

	// 1. 현재 좌표값에서 변수만큼 이동한 거리를 구한다
	// 루트근사값 이용 : math,sqrt(제곱근)을 이용 
	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void stop() {
		super.stop(); 
	}


	public static int getAttack() {
		return attack;
	}


	public static void setAttack(int attack) {
		Marine.attack = attack;
	}


	public static int getArmor() {
		return armor;
	}


	public static void setArmor(int armor) {
		Marine.armor = armor;
	}
	
	
	
}
