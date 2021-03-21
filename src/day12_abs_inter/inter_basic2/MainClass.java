package day12_abs_inter.inter_basic2;

public class MainClass {

	public static void main(String[] args) {

		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		// 1. Animal 배열을 생성해서 baduk, nabi, hodol을 저장하고 , Animal의 공통기능 출력
		Animal[] animal = {baduk, nabi, hodol};
		for(int i = 0; i < animal.length; i++) {
			animal[i].eat();
		}

		for(Animal a : animal) {
			a.eat();
		}
		
		System.out.println("----------------------");
		// 2. IPet 배열을 생성한 후 baduk, nabi, 금붕어를 저장하고 ,향상된 포문으로 Ipet의 기능을 사용한다
		Ipet baduk1 = (Ipet) baduk; // baduk은 Animal타입 이지만 Ipet도 가지고있음 
		Ipet nabi1 = (Ipet) nabi;
		Ipet fish = new GoldFish();
		
		Ipet[] ipet = { baduk1, nabi1, nabi1,nabi1,fish};
		for(Ipet i : ipet) {
			i.Play();
		} 
		
		System.out.println("---------------------");
		PetShop ps = new PetShop();
		ps.carePet(nabi1);

		
	}
 
}
