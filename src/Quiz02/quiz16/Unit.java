package Quiz02.quiz16;

public abstract class Unit {
	
	private int x ;
	private int y ;
	private int hp ;
	


	public Unit(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}

	public abstract void location();
	
	public abstract void move(int x , int y);

	public void stop() {
		System.out.println("현재 위치에 정지" + this.x + this.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y; 
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
