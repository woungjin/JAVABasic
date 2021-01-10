package Quiz02.quiz28_Regex;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class RegexQuiz03 {

	public static void main(String[] args) {

		// 1. 해당 TxT 파일을 읽어서 day, store , grade, detail, price,

		List<Product> list = new ArrayList<>();

		String pa1 = "\\d{8}-\\d{2}-\\d{12,13}";
		Pattern p1 = Pattern.compile(pa1);

		String pa2 = "[가-힣]+ [가-힣]{3,6}";
		Pattern p2 = Pattern.compile(pa2);

		String pa3 = "\\[[A-Z]+\\]|\\[[가-힣]+\\]";
		Pattern p3 = Pattern.compile(pa3);

		String pa5 = "\\d{1,3},\\d{3,5}[가-힣]|\\d{5}[가-힣]|\\d{1}\\d{3}[가-힣]";
		Pattern p5 = Pattern.compile(pa5);

		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("D:\\course2\\java\\file\\건담.txt"));
			String str;
			while ((str = bf.readLine()) != null) {
				Product product = new Product();
				Matcher m1 = p1.matcher(str);
				Matcher m2 = p2.matcher(str);
				Matcher m3 = p3.matcher(str);
				Matcher m5 = p5.matcher(str);
				if (m1.find() && m2.find() && m3.find() && m5.find()) {
					product.setDay(m1.group());
					product.setStore(m2.group());
					product.setGrade(m3.group());
					product.setPrice(m5.group());
					product.setDetail(str.substring(m3.end()+1,m5.start()-1));
				}
				list.add(product);

			}

			for (Product m : list) {
				System.out.println(m.getDay());
				System.out.println(m.getStore());
				System.out.println(m.getGrade());
				System.out.println(m.getDetail());
				System.out.println(m.getPrice());
			}

		} catch (Exception e) {
			System.out.println("에러발생");
		}

		File f = new File("D:\\course2\\java\\data9999.xls");
		// 파일객체는 파일에대한 정보만 넘겨주는거기 때문에 예외처리 할필요 없음;
		try {
			WritableWorkbook wb = Workbook.createWorkbook(f);

			WritableSheet s1 = wb.createSheet("첫번째", 0);
		
				
			for (int i = 0; i < list.size(); i++) {
				Label label = new Label(0, i, list.get(i).getDay());
				s1.addCell(label);
				Label label1 = new Label(1, i, list.get(i).getStore());
				s1.addCell(label1);
				Label label2 = new Label(2, i, list.get(i).getGrade());
				s1.addCell(label2);
				Label label3 = new Label(3, i, list.get(i).getDetail());
				s1.addCell(label3);
				Label label4 = new Label(4, i, list.get(i).getPrice());
				s1.addCell(label4);
		
				
			}
			wb.write(); // 반드시 적어줘야 엑셀에 적용이 됨;
			wb.close();
		} catch (Exception e) {
			System.out.println("Err : " + e.getMessage());
		}
		
		
		// ------------------------- POI를 이용한 방법은 선생님꺼 가져오기 ----------------------------- 
		
		
		// 7s = 맥캔지사에서 조직역량,체계등을 분석하기위한 기법으로 ,Strategy,System.Staff,Skill,Structure,Shared value,STYLEA
		// 3c = 기관의 표적시작을 위해 고객, 경쟁사,자사분석을 통한 성공에  필요한 전략ㅇ을 수립
		// 5Force =  마이클 포터가 주장한 개념으로 경쟁사간 교섭력교섭력위협요소를 이용한 산업환경분석을 통해 기업과 기업을 둘러싼 주변환경을 분석하기 위한 도구
		// SWOT분석 =  SWOT 외부환경의 기회와 위협 내부환경의 강점과 약점을 분석하여 전략전 과제 및 방향성 설정  
		// ISP = 
		// CSF = MIT 경영대학원에서 개발한 전략 정보 시스템 실현을 위한기법중 하나로 성공부가결 요인을 찾아내 경영상 중요한 정보를 결정하는 기법 
		// 6 Sigma = 모로토라에서 창안한 방법으로 무결함을 위해 시작된 운동 정의(Define) -> Measure(측정) -> Analyze(분석) -> Improve(향상) -> Control(관리)  
	}

}
