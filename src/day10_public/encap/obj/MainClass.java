package day10_public.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		h.getChef().cooking();
		
		h.setChef(new Chef());

	}

}
