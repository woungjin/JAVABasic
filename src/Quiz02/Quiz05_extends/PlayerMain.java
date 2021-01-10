package Quiz02.Quiz05_extends;

public class PlayerMain {

	public static void main(String[] args) {
		
		System.out.println("--- 전사 ---");
		Warrior w = new Warrior();
		w.name = "강한친구대한전사";
		w.hp = 1000;
		w.mp = 500;
		w.info();
		w.bash(); 
		System.out.println("--- 법사 ---");
		Wizard wi = new Wizard();
		wi.name = "구르미그린달빛";
		wi.hp = 500;
		wi.mp = 1000;
		wi.info();
		wi.iceArrow();
		

	}

}
