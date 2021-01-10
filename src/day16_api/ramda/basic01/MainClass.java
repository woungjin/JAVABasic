package day16_api.ramda.basic01;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();

		p.greating(new Say01() {
			public void talking() {
				System.out.println("한국말 안녕");
			}
		});
		
		//3nd - > 람다표현식 ( 싫행시켱야 할 문장이 한줄이라면{} 가 생긴다 )
		p.greating(() -> System.out.println("미국말 : hi"));
		
		System.out.println("------------------------");
		
		// 매개변수가 있는 유형
		p.greating(new Say02() {
			
			// 실행주최는 메인이 아니라 이걸 저으이한 Person에 있다 
			public void talking(String word) {
				System.out.println(word);
			}
		});
		
		// 위에와 같은 표현이다 
		p.greating( (word) -> System.out.println(word));
	
		System.out.println("-----------Say03");

		// 반환 유형이 있는 유형
		p.greating(new Say03() {
			public String talking() {
				System.out.println("finish");
				return "a";
			}
		});
		// greating의 괄호안에는 매개변수값 없으면 그냥 , return이 있다면 -> 다음에 {}를 열어야됨
		p.greating(() -> {
			System.out.println("finish");
			return "finish";
		}).greating(() -> { // Person 객체를 return해서 Person객체로 받아줄수 있지만
							// 그냥 .을 찍어서 무한정 람다표현식을 계속 쓸수가 있다
			return "finish";
		});

	}
}
