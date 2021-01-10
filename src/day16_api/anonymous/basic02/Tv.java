package day16_api.anonymous.basic02;

public class Tv {

	private int sound;
	private RemoteControl remote ; 
	
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

	public Tv() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("볼륨+");
				
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("-볼륨");
				
			}
			
			@Override
			public void turnoff() {
				System.out.println("");
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			
			
		};
	}
}
