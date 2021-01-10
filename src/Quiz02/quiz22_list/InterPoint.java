package Quiz02.quiz22_list;
import java.util.List;

public interface InterPoint {
		
	public void showPointUI();
	public void input(List<Student> students);
	public void showAll(List<Student> students);
	public void search(List<Student> students);
	public void modify(List<Student> students);
	public void delete(List<Student> students);
	
	//프로그램 메뉴정보를 보여줄 메서드.
	public static void menuInfo() {

		System.out.println("\n*** 성적관리 프로그램 ***");
		System.out.println("# 1. 성적정보 입력");
		System.out.println("# 2. 전체성적 조회");
		System.out.println("# 3. 개별성적 조회");
		System.out.println("# 4. 성적정보 수정");
		System.out.println("# 5. 성적정보 삭제");
		System.out.println("# 6. 프로그램 종료");
		System.out.println("*********************");
	}
}
