package day13_exception.myexception;

public class Account {

	/*
	 * 1. 잔액 (balance:long) 타입으로 멤버변수 2. deposit : 입금기능 3. widthDraw : 출금기능 4.
	 * getBalance() : 잔액확인기능
	 * 
	 * 단 , widthDraw() 메소드에서 잔액이 출금보다 작다면 MyException을 발생시키는 코드를 작성해 보세요
	 */

	long balance = 0L;

	public void deposit(int balance) {
		this.balance += balance;
		System.out.println(balance+"원 입금 완료");
	}
 
	public void widthDraw(int money) throws MyException {
		if (money > this.balance) {
			throw new MyException("통장 잔액이 부족합니다");
		} else {
			this.balance -= money;
			System.out.println(money+"원 출금완료");
		}
	}

	public long getBalance() {
		return this.balance;
	}

	public static void main(String[] args) {

		Account a = new Account();
		a.deposit(3000);
		try {
			a.widthDraw(4000);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("남은 금액 : " + a.getBalance() + "원 ");
		
	}

}
