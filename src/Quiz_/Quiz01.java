package Quiz_;

public class Quiz01 {

	public static void main(String[] args) {

		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65

		// 각각 값의 결과는 몇인지 유추해 보세요.
		System.out.println(y += 10 - x++); // y = 15 , x = 3 == 13
		System.out.println(x += 2); // x == 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		System.out.println(c + 1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B , c== C
		System.out.println(c); // C

	}
}
