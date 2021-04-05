package Quiz02.quiz16;

public class DropShip extends Unit {

	public Unit[] unit = new Unit[8];
	public int index = 0; // Unit배열의 index

	public DropShip() {
		super(0, 0, 60);
	}

	@Override
	public void location() {
		System.out.println("드랍쉽의 의 현재 위치 x : " + this.getX() + " y : " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		int c = 0;
			int a =  x - this.getX() ;
			int b =  y - this.getY()  ; 
			c = (int) Math.sqrt(a*a + b*b);
		
			// ride()를 이용한 탱크와 마린들의 위치를 드랍쉽과 같이 변경해준다
		for (int i = 0; i < unit.length; i++) {
			if (unit[i] != null) {
				unit[i].setX(x);
				unit[i].setY(y);
			}
		}
		this.setX(x);
		this.setY(y);
		System.out.println("이동한 거리 : " + c );
	}

	
	
	
	public void stop() {
		super.stop();
	} 

	
	
	public void ride(Unit[] u) {
		for (int i = 0; i < u.length; i++) {

			if (u[i] instanceof Marine && this.index <8) {
				this.unit[index] = u[i];
				index++;
 			} else if (u[i] instanceof Tank && index<=4) {
				this.unit[index] = u[i];
				index+=4;
			} else {
				System.out.println("공간이 부족합니다");
				return; 
			}

		}
		System.out.print("[ ");
		for(int i = 0 ; i< unit.length;i++) {
			if(unit[i] != null ) {
				if(unit[i] instanceof Marine) { 
					System.out.print("마린 ");
				}
				else if (unit[i] instanceof Tank) {
					System.out.print("탱크 ");
				}
			}
		}
		System.out.print("]");
		System.out.println();
	}

	/*
	 * ride(모든 유닛을 받을수 있도록 선언 ) { 1. 배열의 크기는 8이고, 수송선 배열에는 마린과 탱크가 탈수있따 탱크는 4칸씩 차지 =
	 * 탱크가 타면 4공간을 뛰면 된다
	 * 
	 * 2. 배열에 유닛이 탈수 있으면 유닛에 배열을 저장한다 배열을 전부 차지하거나 공간이 없으면 부족하다고 출력 3. 수송선에 탄 유닛을
	 * 가로로 출력하면 된다 }
	 */
}
