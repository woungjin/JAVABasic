package Quiz02.quiz21_StringAPI;

public class Palindrome {
	
	public static String PalindromeCheck (String str) {
		str = str.replace(" ", "");		
		int mid ;
		String a;
		String b;
		String arr = ""; // 뒤집어
		
		
		if( str.length() % 2 == 0 ) {// 2  
			mid = str.length()/2;
			b  = str.substring(mid,str.length()); 
		} else {
			mid = str.length()/2+1;
			b  = str.substring(mid-1,str.length()); 
		}
		a = str.substring(0,mid);
		
		System.out.println("앞   " + a);
		System.out.println("뒤  " + b);
		
		
		
		// 뒤집기 back = (b,a) 2 
		for(int i = b.length()-1 ; i >= 0 ; i-- ) {
			arr += b.charAt(i);
		}

		if(a.equals(arr)) {
			return ("회문입니다");
		} else {
			return ("회문이 아닙니다");
		}
		
		
	}
}
