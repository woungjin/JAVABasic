package day14_api.lang.system;

public class MainClass {

	public static void main(String[] args) {

	
		// 1970년 부터 현재시간까지 경과시간을 밀리초로 환산
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		int sum=0;
		for(int i = 0 ; i< 11000000L ; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간  : " + (end-start)*0.001 
				+ "초  합 : " + sum);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
} 
 
