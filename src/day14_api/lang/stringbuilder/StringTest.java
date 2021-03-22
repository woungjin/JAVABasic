package day14_api.lang.stringbuilder;

public class StringTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
//		String s = "";
		
//		for(int i = 1; i<=300000; i++) {
//			s += "A";
//			// A = A + "A"
//			// AA = AA + "A"
//			// AAA = AAA + "A"
//		}

		StringBuffer sb = new StringBuffer("A");
		for(int i = 1 ; i<=30000000; i++) {
			sb.append("A");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("소요시간 " + (end - start) * 0.001 );

		

	} 

}
