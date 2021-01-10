package day14_api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		// Object클래스 (최상위 부모)
		// - equals() 	: 동일한 객체인지 (중요)
		// - hashcode() : 객체의 숫자값 
		// - toString() : 객체 자체를 문자열의 형태로 반환 (오버라이딩 해서 많이 사용 ), (중요) 
		// - clone() 	: 객체 복사 
		// - getClass() : 현재 실행되는 클래스를 반혼 
		// - finallize(): 객체가 소멸되기 전에 실행
		// 
		
		Person park = new Person("박찬호");
		Person kim = new Person("김찬호");
		
		boolean i = park.equals(park);	
		System.out.println("이름이 같다 "  + i);

		
		System.out.println(park.toString());
		
		// 오버라이딩
		// 객체복사 메소드
		// protected이기 때문에 사용시 오버라이딩 통해 생성
		// 또한 cloneable 인터페이스를 구현해서 사용 함 
		Person clonePerson = new Person("복제");
		try {
			  Person p = (Person)clonePerson.clone();
			System.out.println(p.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// 객체 소멸 확인
		park = null;
		kim = null;
		clonePerson = null;
		System.gc(); // 쓰레기 수집기 실행
		
		
		
	}

}
