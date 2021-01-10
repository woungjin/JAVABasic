package Quiz02.quiz22_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz2 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		User u1 = new User("홍길동", 10);
		User u2 = new User("홍길자", 20);

		list.add(u1);
		list.add(u2);

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("홍길동")) {
				list.remove(i);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("홍길자")) {
				System.out.println("이름 : " + list.get(i).getName());
				System.out.println("나이 : " + list.get(i).getAge());
			}
		}
		System.out.println(list);

	}

}
