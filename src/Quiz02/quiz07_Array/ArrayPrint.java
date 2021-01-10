package Quiz02.quiz07_Array;

public class ArrayPrint {
	// 메소드 오버로딩, 문자열 배열을 받아서 , 요소를 가로로  
	String printArr(String[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result +=arr[i];
			if(i!=arr.length-1) {
				result+=",";
			}
		}
		result += "]";
		return result;
	}

	String printArr(int[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result +=arr[i];
			if(i!=arr.length-1) {
				result+=",";
			}
		}
		result += "]";
		return result;
	}
		
	public static void main(String[] args) {
		
		ArrayPrint a = new ArrayPrint();
		
		String[] arr2 = {"a","b","c","d"};
		
		System.out.println(a.printArr(arr2));

	}
}
