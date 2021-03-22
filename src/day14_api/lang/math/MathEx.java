package day14_api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		int d1 = (int) Math.ceil(12/10.0);
		System.out.println(d1);
		
		double d2 = Math.floor(1.5); 
		System.out.println(d2);
		
		double d3 = Math.round(1.5); // 반올림 
		System.out.println(d3);
		
		int d4 = Math.abs(-10); // 절대값 
		System.out.println(d4);
		
	} 

}
