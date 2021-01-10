package Quiz02.quiz28_Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		
		String str1 = "20150311-01-0079201803112 건담베이스 부천점 [RG] HACO ROOM 꼬마곰 재키 키트 1 15,500원";
		String str2 = "1/144 건탱크 초기타입 (오리진ver.) 1";
		String str3 = "1/144 고기동형 자쿠II (가이아/맛슈 전용기... 1";
		String str4 = "EXP 시스템 베이스 001 G-TOOL 1";
		String str5 = "건담 더블오 다이버 (초회) 1";
		String str6 = "1/144 RX-75 건탱크 1";
		String str7 = "이프리트 슈나이드 1";
		String str8 = "1/100 건담 마크II 에우고 버전2.0 1";
		String str9 = "1/100 유니콘 건담 2호기 밴시 티타늄 피니쉬... 1";
		String str10 = "1/100 MS-18E 캠퍼 1";
		String str11 = "자쿠 II (조니라이덴 전용기) 1";
		String str12 = "톨기스 EW 1";
		String str13 = "건담마커 GM04 골드 2";
		String str14 = "건담베이스 한정판 시난주 (메탈릭 글로스 인젝션)";
		String str15 = "마커 한정판 시난주 ";
		
		String pa4 = "[A-Z]+ [A-Z]+ [가-힣]+ [가-힣]+ [가-힣]+ \\d?|\\d{1}/\\d{3} [가-힣]+ [가-힣]+ \\([A-Za-z가-힣]+.\\) \\d|\\d{1}/\\d{3} [A-Za-z가-힣]+ [A-Za-z가-힣]+ \\([A-Za-z가-힣]+/[가-힣]+ [가-힣]+... \\d|[A-Za-z가-힣]+ [A-Za-z가-힣]+ [A-Za-z가-힣]+ \\d{2,3} [A-Z]-[A-Z]+ \\d|[가-힣]+ [가-힣]+ [가-힣]+ \\([가-힣]+\\) \\d|\\d{1}/\\d{3} [A-Z]+-\\d{2} [A-Za-z가-힣]+ \\d|[가-힣]+ [가-힣]+ \\d|\\d{1}/\\d{3} [가-힣]+ [A-Za-z가-힣]+ [가-힣]+ [가-힣]+\\d.\\d \\d|\\d{1}/\\d{3} [가-힣]+ [가-힣]+ \\d[가-힣]+ [가-힣]+ [가-힣]+ [가-힣]+... \\d|\\d/\\d{3} [A-Z]+-\\d{2}[A-Z] [가-힣]+ \\d|[가-힣]* [A-Z]* \\([가-힣]+ [가-힣]+\\) \\d|[가-힣]+ [A-Z]+ \\d|[가-힣]+ [A-Z]+\\d{2} [가-힣]+ \\d|[가-힣]+ [가-힣]+ [가-힣]+ \\([가-힣]+ [가-힣]+ [가-힣]+\\)|[가-힣]+ [가-힣]+ [가-힣]+";
		String pa5  = "\\d{5}[가-힣]";
		
		String pattern = "\\d{8}-\\d{2}-\\d{12,13} [가-힣]+ [가-힣]+ \\[[A-Za-z가-힣]+\\]";
		String pattern2 = "\\d{1} \\d{1,3}";
		
		String str = str1+str2+str3+str4+str5+str6+str7+str8+str9+str10+str11+str12+str13+str14+str15;
		Pattern p = Pattern.compile(pattern);
		
		
		Pattern p2 = Pattern.compile(pattern2);
		
		Matcher m = p.matcher(str1);
		
		
		int indexend = m.end();
		int indexstart = m.start();
		
		
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.end());
		}

	}
	
}
