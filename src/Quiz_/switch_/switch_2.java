package Quiz_.switch_;

public class switch_2 {

	public static void main(String[] args) {

		String[] arr = { "안녕", "hello", "니하오", "@#$" };

		// 랜덤함수를 이용해 0~3까지의 수를만들어
		// 랜덤수를 배열에 index에 적용해
		// 선택된 단어가 한국어 영어 중국어 인지 처리
		int index = (int) (Math.random() * arr.length);
		System.out.println("나온 수 : " + index);
		switch (arr[index]) {
		case "안녕":
			System.out.println("한국어");
			break;
		case "hello":
			System.out.println("영어");
			break;
		case "니하오":
			System.out.println("중국어");
			break;
		default:
			System.out.println("외계어");
		}

	}

} 
