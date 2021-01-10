package Quiz02.quiz18_interface;


public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;

	public void insertList(String song) {	
		list[count] = song;
		count++;
	}

	public void playList() {
		for(int i = 0 ; i< count ; i++) { 
			int rdn = (int) (Math.random()*count);
			System.out.println(list[rdn] + " 을 실행 합니다");
		}

	}

	public int playLength() {
		for(int i = 0 ; i < count ; i++) {
			if(list[i]!=null){
				System.out.println(list[i]);
			}
		}
		return count;
	}
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	
}
