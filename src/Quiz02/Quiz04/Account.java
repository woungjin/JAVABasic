package Quiz02.Quiz04;

public class Account{

	String name;
	String password;
	int balace;
	
	public Account(String name, String password, int balace) {
		this.name = name;
		this.password = password;
		this.balace = balace;
	}
	
	void deposit(int n) {
		this.balace +=n;
	}
	
	void withDrwa(int n) {
		this.balace -=n;
	}
	
	int getbalance() {
		return balace;
	}
	

}
