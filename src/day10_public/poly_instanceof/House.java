package day10_public.poly_instanceof;

public class House {

//	private Student[] students;
//	private Teacher[] teachers;
//	private Employee[]employees;
//	
//	public House() {
//		students = new Student[100];
//		teachers = new Teacher[100];
//		employees = new Employee[100];
//	}
//
//		

	// 1. 300 개 크기의 Person배열 생성
	// 2. count 변수 = 0 선언
	// 3. setIn() 모든 자식클래스를 받아서 Person배열에 저장되도록
	// 4. 메인클래스에서 6명의 Person을 전달 .

	private Person[] persons;
	private int count = 0;

	public House() {
		persons = new Person[300];
	}

	public void setIn(Person[] arr) {
		for (count = 0; count < arr.length; count++) {
			persons[count] = arr[count];
		}
		
	}

	public void getPersons() {
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] != null )
			System.out.println(persons[i].info());
		}
		
	}
 
}
