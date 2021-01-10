package Quiz02.quiz28_Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz2 {

	public static void main(String[] args) {
		
		// 상품 번호 , Gs25 , 도시락명 , 가격으로 분리해서 출력 
		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-3333333 MINISTOP(제육볶음) 5,500";
		
		String pattern = "\\d{6}-\\d{7}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str+str2+str3);
	
		String pa2 = "[A-Z]+\\w+";
		Pattern p2 = Pattern.compile(pa2);
		Matcher m2= p2.matcher(str+str2+str3);
		
		String pa3 = "\\W+\\W"; 	// //() -> 특정문자를 찾음 
		Pattern p3 = Pattern.compile(pa3);
		Matcher m3= p3.matcher(str+str2+str3);
		
		String pa4 = "[0-9],[0-9]+\\W*";
		Pattern p4 = Pattern.compile(pa4);
		Matcher m4= p4.matcher(str+str2+str3);
		
		List<Matcher> list = new ArrayList<Matcher>();
		list.add(m);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		for(Matcher matcher : list) {
			while(matcher.find()) {
				System.out.println(matcher.group());
			}
		}
		
//		String[] arr = {str, str2, str3}; 
//		int i = 0 ;
//		while(i < arr.length) {
//			Matcher m1 = Pattern.compile(pattern).matcher(arr[i]);
//			Matcher m2 = Pattern.compile(pa2).matcher(arr[i]);
//			Matcher m3 = Pattern.compile(pa3).matcher(arr[i]);
//			Matcher m4 = Pattern.compile(pa4).matcher(arr[i]);
//			
//			if( m1.find() && m2.find() && m3.find() && m4.find()) {
//				System.out.println(m1.group());
//				System.out.println(m2.group());
//				System.out.println(m3.group());
//				System.out.println(m4.group());
//			}
//		}
		
	}

}
