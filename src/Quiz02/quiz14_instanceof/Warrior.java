package Quiz02.quiz14_instanceof;

public class Warrior extends Player {
	
	int attack ;
	// 1. 생성자 : name만 전달받아서 hp = 1000 , mp = 500 , attack = 10 초기화
	// 2. bash 스킬은 player타입을 받아서 각각의 직업에 따라 해당 객체의 hp 감소
	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
	}

	void bash(Player p) {
		if(this.mp <=100) {
			System.out.println("마나 부족으로 인한 스킬 사용 불가 ");
			return;
		}
		
		if (p instanceof Wizard) {
			System.out.println(p.name + "님에게 스킬사용 성공  ");
			p.hp -= 200;
		} else if (p instanceof Warrior) {
			System.out.println(p.name + "님에게 스킬사용 성공 ");
			p.hp -= 100;
		}
		this.mp -= 100;
	}

	void info() {
		System.out.println("캐릭명 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("마나 : " + this.mp);
	}
	
}
