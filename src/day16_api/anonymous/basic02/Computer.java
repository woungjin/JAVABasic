package day16_api.anonymous.basic02;

public class Computer {

	private int sound;
	private RemoteControl remote;
	
	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}

	public Computer() {
		
		remote = new RemoteControl() {
			
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터볼륨 : " + sound);
				
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터 볼륨 : " + sound);

			}
			
			@Override
			public void turnoff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
}
