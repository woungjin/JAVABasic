package Quiz02;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동", 1, 67, 31, 56);
		int hap = st1.getTotal();
		double avg = st1.getAvg(hap);
		System.out.println(st1.no+"번째 " + st1.name+"학생 " + "합 : " + hap + " 평균 : " + avg);
	
		Student st2 = new Student("김길동", 2, 34, 18, 18);
		int hap2 = st2.getTotal();
		double avg4 = st2.getAvg(hap2);
		System.out.println(st2.no+"번째 " + st2.name+"학생 " + "합 : " + hap2 + " 평균 : " + avg4);
	}

}
