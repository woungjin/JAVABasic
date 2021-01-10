package Quiz02.quiz14_instanceof;

public class WizardMainClass {

	public static void main(String[] args) {

		
		Wizard me2 = new Wizard("플레이어2");
		Player player3 = new Warrior("전사 bot");
		Player player4 = new Wizard("법사 bot");
		
		Player[] player = {player3, player4};
 		
		me2.blizzard(player);
		me2.blizzard(player);
		me2.blizzard(player);
		me2.blizzard(player);
		me2.blizzard(player);
		System.out.println("-----");
		player3.info();
		player4.info();
	}

}
