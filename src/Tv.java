
public class Tv {

	private boolean power;
	private int channel;
	private int volume;
	int prevChannel;

	public void setPower(boolean power) {
		if (power) {
			System.out.println("전원을 끕니다 ");
		} else {
			System.out.println("전원을 킵니다 ");
		}
		this.power = power;

	}

	public boolean getPower() {
		return this.power;
	}

	public void setChannel(int channel) {
		this.prevChannel = this.channel;
		this.channel = channel;
		
	}

	public int getChannel() {
		return this.channel;
	}

	public void setVolume(int volume) {
		if (volume >= 1 && volume <= 100) {
			this.volume = volume;
		} else {
			System.out.println("오류");
			return;
		}
	}

	public int getVolume() {
		return this.volume;
	}

}
