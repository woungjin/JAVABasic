package Quiz02.quiz18_interface;

import java.util.Arrays;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;

	public void insertList(String song) {	
		list[count] = song;
		count++;
	}

	public void playList() {
		while(true) {
			int rd = (int) (Math.random()*count);
			int rd2 = (int) (Math.random()*count);
			if(rd!=rd2) {
			System.out.println(list[rd]+ "음악을 재생합니다");
			System.out.println(list[rd2] + "음악을 예약합니다");
			break;
			}
		}
	}

	public int playLength() {
		
		return count;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로~
	 *  
	 */
	
}
