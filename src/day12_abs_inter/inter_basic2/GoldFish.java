package day12_abs_inter.inter_basic2;

public class GoldFish extends Fish implements Ipet {

	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄칩니다");
	}

	@Override
	public void Play() {
		System.out.println("금붕어는 어항에서 놀아요 ");

	}
}
