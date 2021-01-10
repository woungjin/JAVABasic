package Quiz_.while_;

import java.util.Arrays;
import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arrList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] age = new int[100];
		
		int index = -1;
		int count = 0;
		stop:while  (true) {
			
			System.out.println("---------------------------------");
			System.out.println("[메뉴] 1.Insert, 2.Prev, 3.Next 4.Current, 5.Update , 6.Delete, 7.Quit ");
			System.out.print("메뉴 입력  :" );
			
			String menu = sc.next();
			int a = Integer.parseInt(menu);
			switch (a) {
			case 1:
				System.out.println("------고객 정보 입력------");
				// 이름 , 성별 ,이메일 나이를 받아서 각 배열에 저장하고 사람수를 증가
				System.out.print("이름 : ");
				arrList[count] = sc.next();
				System.out.print("성별 : ");
				genderList[count] = sc.next();
				System.out.print("이메일 : ");
				emailList[count]  = sc.next();
				System.out.print("나이 : 	");
				age[count] = sc.nextInt();
				count++;
				index++;
				break;
			case 2:
				System.out.println("------이전 고객 정보------");
				if ( index <= 0 ) {
					System.out.println("이전 고객의 정보가 없습니다");
					break;
				} else {
					index--;
					for(int i = index ; i <= index; i++) {
						System.out.println("이름 : [" + arrList[i] 
								+ "] 성별 : [" + genderList[i]
								+ "] 이메일 : [" + emailList[i]
								+ "] 나이  : [" + age[i]+ "]");
					}
					System.out.println("번호 : [ " + (index+1) + " ] ");
				}
				break;
			case 3:
				System.out.println("------다음 고객 정보------");
					if(index < count-1) { 
						index++;
						for(int i = index ; i <= index; i++) {
							System.out.println("이름 : [" + arrList[i] 
									+ "] 성별 : [" + genderList[i]
									+ "] 이메일 : [" + emailList[i]
									+ "] 나이  : [" + age[i] + "]");
							System.out.println("번호 : [ " + (index+1) + " ] ");
						} 
					} else {
						System.out.println("다음 고객정보가 존재하지 않습니다");
						break;
					}
				break;
			case 4:
				System.out.println("------현재 고객 정보------");
				// 현재 위치 의 조건정보를 출력 없으면 없다고 출력
				if (index== -1) {
					System.out.println("현재 고객 정보가 없습니다");
				} else {
					for(int i = index ; i < index+1; i++) {
						System.out.println("이름 : [" + arrList[i] 
								+ "] 성별 : [" + genderList[i]
										+ "] 이메일 : [" + emailList[i]
												+ "] 나이  : [" + age[i] + "]");
					}
					System.out.println("번호 : [ " + (index+1 )+ " ] ");
				}
				
				break;
			case 5:
				System.out.println("------고객 정보 수정 ------");
				// 현재 위치의 스캐너를 통해 순서대로 이름 ~ 나이까지 배열의 값을 수정 
				if(count !=0) {;
					System.out.print("이름 : ");
					arrList[index] = sc.next();
					System.out.print("성별 : ");
					genderList[index] = sc.next();
					System.out.print("이메일 : ");
					emailList[index]  = sc.next();
					System.out.print("나이 : 	");
					age[index] = sc.nextInt();
					System.out.println("수정완료!");
				} else {
					System.out.println("수정할 고객이 없습니다.");
				}
				break;
			case 6:
				System.out.println("------고객 정보 삭제------");
				// 현재 indexqnxj ~~ 뒤에있는 배열을 앞당겨서 덮어 씌우고  고객수 감소 삭제할 데이터가 없다면 없다고 출력 
				if(index >=0&& index<count) {
					for(int i = index; i<count-1;i++) {
						arrList[i] = arrList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i +1];
						age[i] = age[i+1];
					}
					count--;
					index--;

				} else {
					System.out.println("삭제할 정보가 존재하지 않습니다.");
				}
				break;
			case 7:
				System.out.println("------ 종료 ------");
				System.out.println("시스템을 종료합니다");
				for(int i = 0 ; i < count; i++) {
					System.out.println("이름 : [" + arrList[i] 
							+ "] 성별 : [" + genderList[i]
									+ "] 이메일 : [" + emailList[i]
											+ "] 나이  : [" + age[i] + "]");
				}
				
				break stop;

			default:
				System.out.println("잘못된 입력입니다 다시 입력하세요.");
			}

//			
//			
		}
		

		
	}

}
