package Quiz02.quiz22_list;

import java.util.Scanner;

public class Student {

	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade; // 학점 
	
	private Scanner sc = new Scanner(System.in);
	
	public Student() {
		super();
	}

	// 학생 정보를 입력하는 메소드
	public String inputStuInfo() { 
		
		/*
		 	- 학번, 이름 , 국영수 입력받음 
		 	국영수는 문자열이 입력시에 다시 받을수 있도록 예외처리 .
		 	 
		 */
		
		System.out.print("학번 : ");
		this.stuId = sc.next();
		
		System.out.print("이름 : ");
		this.name = sc.next();

		while (true) {
			try {
				System.out.print("국어 : ");
				this.kor = sc.nextInt();

				System.out.print("영어 : ");
				this.eng = sc.nextInt();

				System.out.print("수학 : ");
				this.math = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시입력하세요");
				sc.nextLine();
			}
		}
		return this.stuId;
	}
	
	//총점 , 평균, 학점을 계산하는 메소드,
	public void calcTotAvg() {
		this.total = this.kor + this.eng + this.math;
		this.avg  =  (double)(total / 3.0);
		if(avg >90) { 
			this.grade = "A";
		} else if (avg > 80) {
			this.grade = "B";
		} else if (avg > 70) {
			this.grade = "C";
		} else {
			this.grade = "F";
		}
		
	}
 	
	
	// 학생 정보 출력 메소드 
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%9d점%9d점%8d점%9.2f점%9s\n",
				stuId,name,kor,eng,math,total,avg,grade);
	}

	
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	

	
	
	
	
	
}
