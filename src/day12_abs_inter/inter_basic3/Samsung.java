package day12_abs_inter.inter_basic3;

public class Samsung implements Printed{

	@Override
	public void turnOn() {
		System.out.println("Samsung is good");
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung is good");
		
	}

	@Override
	public void print(String document) {
		System.out.println("Samsung is good");
		System.out.println("출력 내용  : " + document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("Samsung is good");
		System.out.println("출력 내용  : " + document + " 색상 : " + color);
		
	}

	@Override
	public int copy(int n) {
		System.out.println("Samsung is good");		
		for(int i = 1; i <= n ; i++) {
			System.out.println(i+ "장 복사");
		}
		return n;
	}

	
	
}
