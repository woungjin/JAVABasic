package Quiz02.quiz22_list;


import java.util.*;

public class interClass implements InterPoint{

	Scanner sc = new Scanner(System.in);
	
	public void showPointUI() {
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
	}

	public void input(List<Student> students) {
		Student st = new Student();
		boolean flag = true;
		st.inputStuInfo();
		for(int i = 0 ; i<students.size();i++) {
			if(st.getStuId().equals(students.get(i).getStuId())) {
				System.out.println("이미 등록된 학번 입니다");
				flag = false;
				break;
			}
		}
		if(flag) {
			students.add(st);
			System.out.println("저장완료!");
			System.out.println(st.getName() + " 님의 성적 정보가 정상적으로 입력되었습니다");

		} 


	}
	

	public void showAll(List<Student> students) {
		double sum = 0 ;
		showPointUI();
		for(int i = 0 ; i< students.size() ; i++) {
			students.get(i).calcTotAvg();
			students.get(i).outputInfo();
			sum += students.get(i).getAvg();
		}
		sum = (double)(sum / students.size());
		System.out.printf("반의 전체 평균 :  %.2f" ,sum);
	}

	public void search(List<Student> students) {
		System.out.print("찾을 학번 입력 : ");
		String seacher1 = sc.next();
		boolean flag = false;
		showPointUI();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStuId().equals(seacher1)) {
				students.get(i).outputInfo();
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(seacher1 + "님은 없습니다 ");
		}

	}

	public void modify(List<Student> students) {
		System.out.print("찾을 학번 입력 : ");
		String seacher1 = sc.next();
		boolean flag = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStuId().equals(seacher1)) {
				flag = false;
			}
			if (!flag) {
				System.out.print("국어 수정 : ");
				int kor = sc.nextInt();
				System.out.print("영어 수정 : ");
				int eng = sc.nextInt();
				System.out.print("수학 수정 : ");
				int math = sc.nextInt();
				students.get(i).setKor(kor);
				students.get(i).setEng(eng);
				students.get(i).setMath(math);
				break;
			}
		}
		if (flag) {
			System.out.println(seacher1 + " : 학번을 찾지 못하엿습니다");
		}

	}

	public void delete(List<Student> students) {
		System.out.print("삭제할 학번 입력 : ");
		String seacher1 = sc.next();
		boolean flag = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStuId().equals(seacher1)) {
				students.remove(i);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(seacher1 + " : 학번을 찾지 못하엿습니다");
		}
	}

}
