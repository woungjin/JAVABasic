package day14.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 		＊ 제너릭 사용방법
		 		
		 	- 멤버변수를 Object형으로 선언시 무엇이든 저장가능 
		 	- But 값을 꺼내와 사용하려면 타입별로 강제 형변환을 해주어야 함 
		 	
		 		
		 */
		
		
		ABC abc = new ABC();
		
		abc.setObj("홍길동");
		String name = (String) abc.getObj();
		
		ABC p = new ABC();
		p.setObj(new Person());
		
		Person person = (Person) p.getObj();
		
		
		

	}

}
