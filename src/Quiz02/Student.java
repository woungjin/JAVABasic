package Quiz02;

public class Student {

	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int no, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}
	
	double getAvg(int sum) {
		
		double avg = (sum/3.0)*100;
		int avg3 =(int)avg; 
		return avg3/100.0;
		
	}
	
	
}
