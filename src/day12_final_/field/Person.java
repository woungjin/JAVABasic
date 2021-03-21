package day12_final_.field;

public class Person {
	
	// final 변수는 값이 대입되면 변경할수 없기 떄문에 
	// 직접 바로 초기화 하거나 
	// 생성자로 반드시 초기화를 해주어야 한다 
	public final String nation = "대한민국"; 
	public final String ssn; // 주민번호
	
	public Person(String ssn, String name ) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public String name;
	
	
	
}
 
