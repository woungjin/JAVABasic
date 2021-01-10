package Quiz02.quiz28_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		
		String str = "헠4,500원 헿~1,200원 엏? 6000원윀 120000원 ";
		String pattern = "[0-9]+,*[0-9]+원";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
	
		while(m.find()) {
			System.out.println("찾음: "+m.group());
		}

	}

}
