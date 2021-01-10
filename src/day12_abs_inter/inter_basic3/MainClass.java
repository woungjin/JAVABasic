package day12_abs_inter.inter_basic3;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		List list = new ArrayList();
		Printed p = new Samsung();
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "black");
		p.copy(10);
		p.turnOff();

	}

}
