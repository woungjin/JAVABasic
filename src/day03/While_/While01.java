package day03.While_;

public class While01 {

	public static void main(String[] args) {

		int i = 0; // 반복문의 횟수 제어
		int s = 0;
		while(i<10) {
			i++;
			s+=i;
			System.out.println(i+", "+s);
		}
System.out.println("---");
		
		int a = 1; // 반복문의 횟수 제어
		int b = 0;
		while(a<=10) {
			b+=a;
			System.out.println(a+", "+b);
			a++;
		}
	}
}
