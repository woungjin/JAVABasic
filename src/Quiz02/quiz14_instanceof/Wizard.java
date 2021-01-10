package Quiz02.quiz14_instanceof;

public class Wizard extends Player {

	public Wizard(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;

	}

	void iceArrow() {
		System.out.println("얼음 화살 사용 ");
	}

	public void blizzard(Player[] players) {
		System.out.println("------------------");
		System.out.println(this.name + "님의 눈보라 시전 성공 ! ");
		for (Player p : players) {
			if (p instanceof Warrior) {
				int rn = (int) (Math.random() * 6 + 10);
				p.hp -= rn;
				System.out.println(p.name + "님이 " + rn + "피해를 입었습니다");
			} else if(p instanceof Wizard) {
				int rn = (int) (Math.random() * 6 + 30);
				p.hp -= rn;
				System.out.println(p.name + "님이 " + rn + "피해를 입었습니다");
			}

		}
	}

	void info() {
		System.out.println("캐릭명 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
	}

}
