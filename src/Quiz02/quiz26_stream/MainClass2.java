package Quiz02.quiz26_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass2 {

	public static String[] arr1;

	public static void main(String[] args) {

		// 1. BufferReader클래스를 사용해서 파일을 읽는다
		// 2. , 기준으로 잘라서 Data 클래스에 값을 한줄 단위로 저장
		// 결측치 - > 빠진값을 적절하게 처리해서 list<Data>에 저장
		// 3. 람다식을 이요해서 , 지역 : 서율 , 짝수월 , 분양 가격은 4000만원이상의 값을 추려내기

		BufferedReader br = null;

		List<Data> list = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("D:\\course2\\java\\file\\a.txt"));
			String str;
			while ((str = br.readLine()) != null) {
				str = br.readLine();
				Data data = new Data();
				String[] arr1 = str.split(",");

				data.setCity(arr1[0]);
				data.setM(arr1[1]);
				data.setYear(Integer.parseInt(arr1[2]));
				data.setMonth(Integer.parseInt(arr1[3]));
				try {
					data.setMoney(Integer.parseInt(arr1[4]));

				} catch (Exception e) {
					data.setMoney(0);
				}

				list.add(data);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		List<Data> list2 = list.stream()
				.filter((t) -> t.getCity().equals("서울"))
				.filter((t) -> t.getMonth() % 2 == 0)
				.filter((t) -> t.getMoney() >= 4000)
				.collect(Collectors.toList());

		for (int i = 0; i < list2.size(); i++) {
			System.out.print("지역 : " + list2.get(i).getCity());
			System.out.print(" 월 : " + list2.get(i).getMonth());
			System.out.print(" 분양가 : " + list2.get(i).getMoney());
			System.out.println("");
		}
		
		//합계

		
	}

}
