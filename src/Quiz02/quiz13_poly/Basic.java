package Quiz02.quiz13_poly;

// 단 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스면 public이면 된다.


class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic{
	
	// 다형성 자식 객체가 부모타입을 가질수 있는 성질, 상속관계를 가지고 있어야한다 
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x = 1;
	double y = x; //int -> double 형변환
	
	A a1 = b; // B - > A 타입 형변환  
	A a2 = c;
	A a3 = new D();
	A a4 = new E(); 
	
	// 상속관계가 없다면 다형성 적용이 불가능 
	
	
	
} 
