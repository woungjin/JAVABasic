package day12_final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("1234123", "박한국");
		
		Person kim = new Person("456456", "김중국");
		System.out.println(park.name + park.nation + park.ssn);
		System.out.println(kim.name + kim.nation + kim.ssn);

	}

}
