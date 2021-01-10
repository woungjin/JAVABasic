package day04.for_;

public class MultiFor2 {

	public static void main(String[] args) {

		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = -1; i < n; i++) {
			for (int j = n; j >= i + 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("----------------");

		for (int i = 0; i <  n; i++) {
			if (i < n / 2) {
				for (int s = i; s <= n - 2; s++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
