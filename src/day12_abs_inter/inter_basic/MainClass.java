package day12_abs_inter.inter_basic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		
		System.out.println(Inter1.PI);
		System.out.println(Inter1.ABC);
		System.out.println(Inter2.ABC);
		
		System.out.println("----------------");
		// 인터페이스도 하나의 데이터 타입이 될수 있다
		// 인터페이스의 부모형 타입으로 사용할 때 , 다형성의 형태와 동일하게 실행
		
		Inter1 i1 = b ; // Inter1 i1 = new Basic();
		i1.method1(); // Basic의 오버라이딩된 method1을 사용한다 
//		i1.method2();
//		i1.method3();
		
		Inter2 i2 = b;  
//		i2.method1
		i2.method2();
//		i2.method3();

		// 다운캐스팅 , 자식의 새로운 객체에 대입 
		Basic bb = (Basic) b;
		
	}
 
}
