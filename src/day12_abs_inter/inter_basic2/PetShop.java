package day12_abs_inter.inter_basic2;

public class PetShop {
	// 1. carePet() 메소드 선언
	// 기능 - 모든 IPet 타입을 받아서 , 어떤 팻 타입인지 각각 확인하는 메소드
	public void carePet(Ipet ipet) {
		if (ipet instanceof Cat) {
			Dog d = (Dog)ipet;
			d.eat();
		} else if (ipet instanceof Dog) {
			Cat c = (Cat)ipet;
			c.eat();
		} else if (ipet instanceof Fish) {
			GoldFish g = (GoldFish)ipet;
			g.Play();
		}

	}

	// 2. Ipet 배열을 받아서 pet 배열 안에 있는 기능을 반복문으로 수행

	public void petInfo(Ipet[] pets) {
		for (Ipet i : pets) {
			i.Play();
		}
	}
 
}
 
