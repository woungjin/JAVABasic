package day08_Class.import_ex;

import java.util.Scanner;

import day08_Class.com.abc.ABC;
import day08_Class.com.def.DEF;
//import day08_Class.fruit.Apple;
//import day08_Class.fruit.Orange;
import day08_Class.fruit.*;

public class MainClass {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Orange o = new Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.println(o);
		System.out.println(abc);
		System.out.println(i);
		
	}

}
