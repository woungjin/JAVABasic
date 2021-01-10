package Quiz_.method;

public class method3 {

	public static void main(String[] args) {
		
		String str = java(5);
		System.out.println(str);
	}

	static String java(int a) {
		String str = "";
			for (int i = 1; i <= a; i++) {
				if( i % 2== 0) {
					str +="바";
				} else {
					str+="자";
				}
			}
			return str;
	}

}
