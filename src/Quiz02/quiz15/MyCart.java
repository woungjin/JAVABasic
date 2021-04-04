package Quiz02.quiz15;



public class MyCart {
	//1. 모든 변수와 메서드에 적절한 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
		System.out.println("현재 잔액 : " + this.money);
	}
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     	 */ 	
	public void buy(Product[] product) { 
		for(Product p : product) {
			if(p instanceof Tv && this.money >= p.price) {
				this.money -=p.price;
				add(p);
			} else if (p instanceof Radio && this.money >= p.price) {
				this.money -=p.price; 
				add(p);
			} else if (p instanceof Computer && this.money >= p.price) {
				this.money -=p.price;
				add(p);
			} else  {
				System.out.println("금액 부족으로 인한 계산 불가 ");
				return;
			} 
			System.out.println(p.name + "을 구매합니다");
			System.out.println("남은 금액 : " + this.money);
			System.out.println(" ");
		}
	}

	
	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 * info()메서드 호출
	 */
	public void add(Product p) {
		if(i >= cart.length) {
			Product[] newcart = new Product[cart.length*2];
			for(int i = 0; i < cart.length; i++) {
				newcart[i] = cart[i];
			}
			cart = newcart;
		}
		cart[i] = p;
		i++;
		info();
	}
	
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void info() {
		int sum =0;
		System.out.print("장바구니 목록 : " );
		
		for(int i=0 ; i<this.i;i++) {
			if(cart[i] != null) {
				System.out.print(cart[i].name);
				if(cart[i] instanceof Tv) {
					sum += cart[i].price;
				} else if (cart[i] instanceof Radio) {
					sum += cart[i].price;
				} else if (cart[i] instanceof Computer) {
					sum += cart[i].price;
				}
			}

		}
		System.out.println("");
		System.out.println("장바구니 총 금액 : " + sum);
	}

	
	
	
	
	
	
	
	
	
	
	
}
