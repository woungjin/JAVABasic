package day10_public.poly2;

public class Main {

	public static void main(String[] args) {

//		
//			Student hong = new Student("홍길동", 20, "123");
//			Student park = new Student("박찬호", 30, "234");
//			Student son = new Student("손흥민", 40, "222");
//			Teacher lee = new Teacher("이승철", 50, "음악");
//			Teacher kim = new Teacher("김유신", 500, "역사");	
//			Employee choi =new Employee("최강창민",20,"건물주");
//			
//			Person p = new Person();
//			
//			Student[] arr1 = {hong,park,son};
//			Teacher[] arr2 = {lee,kim};
//			Employee[] arr3 = {choi};
//			
//			for(Student s : arr1) {
//				System.out.println(s.info());
//			}
//			
//			
		// 다형성을 적용 한다면 ~~
		Person hong = new Student("홍길동", 20, "123");
		Person park = new Student("박찬호", 30, "234");
		Person son = new Student("손흥민", 40, "222");
		Person lee = new Teacher("이승철", 50, "음악");
		Person kim = new Teacher("김유신", 500, "역사");
		Person choi = new Employee("최강창민", 20, "음동");
		Person heo = new Student("ㅇ",1,"2");
		
		Person[] arr = { hong, park, son, lee, kim, choi };

		House house = new House();
		house.setIn(arr);
		house.getPersons();

	} 

}
