package day11_static.static_.basic;

public class ArrayPrint {

	// 1. 외부에서 객체를 생성하지 못하도록 접근제어자를 선언,
	// 2. static메소드로 변경해서 사용.
	
	private ArrayPrint() {}
	
	
	
	public static String  printArray(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	public static String printArray(int[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			
			result += arr[i];
			if( i == arr.length - 1) break;
			result += ",";
		}
		result += "]";
		return result;
	}
	
	
}
