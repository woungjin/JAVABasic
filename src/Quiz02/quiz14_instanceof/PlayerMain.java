package Quiz02.quiz14_instanceof;

public class PlayerMain {

	public static void main(String[] args) {
		
		Warrior me = new Warrior("플레이어");
		
		Warrior player1 = new Warrior("전사 Bot");
		Wizard player2 = new Wizard("법사 Bot");
		
		System.out.println(me.name + "님의 bash스킬 사용 ");
		me.bash(player1);
		me.bash(player2);

		me.bash(player1);
		me.bash(player2);
		
		me.bash(player2);
		
		System.out.println("-----------------");
		
		player1.info();
		player2.info();
		
	}

}
