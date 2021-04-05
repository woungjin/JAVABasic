package Quiz02.quiz16;

public class MainClass {

	public static void main(String[] args) {
		
		
		Marine mar1 = new Marine();
		Marine mar2 = new Marine();
		
		Tank tank1 = new Tank();
		
		DropShip ds = new DropShip();
		
		System.out.println("---- 이동하기전 위치 ---- ");

		ds.location();
		tank1.location();
		mar1.location();
		mar2.move(1, 2);
		mar2.location();
		System.out.println("-----드랍쉽 탑승 유닛 ----");
		Unit[] u = {tank1,mar1,mar2};
		ds.ride(u);
		
		
		ds.move(5, 3);
		System.out.println("---- 드랍쉽 탑승후 이동후 위치 ----");
		tank1.location();
		ds.location();
		mar1.location();
		mar2.location();
		 
	}

}
