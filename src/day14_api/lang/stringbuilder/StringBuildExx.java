package day14_api.lang.stringbuilder;

public class StringBuildExx {
	
	public static void main(String[] args) {
		
		// StringBuffer , StringBuilder 
		String arr = new String("aaa");
		StringBuffer sb = new StringBuffer("bbb");
		System.out.println(arr);
		System.out.println(sb);
		
		arr +="123";
		System.out.println(arr);
		
		sb.append("456");
		System.out.println(sb);
		
		// 끝에 문자열 추가
		sb.append("chip");
		System.out.println(sb);
		
		
		// 중간에 추가
		sb.insert(4,"   ");
		
		// 문자열 변경 replace 해당 인덱스 번째를변경
		sb.replace(0, 1, "자바"); 
		System.out.println(sb);
		
		// 문자열 삭제 
		sb.delete(3, 2);
		
		// 문자열 거꾸로 돌리기 reverse()
		sb.reverse() ;
		System.out.println(sb);
		
		//toString()``뮤
		if(sb.toString().equals("자바")) {
			
		}  { 
			
		}
		
	}
	
}
