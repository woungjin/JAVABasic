package day14_api.random;

import java.util.*;

public class RandomEx {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int x1 = (int) (rd.nextInt()); // int가 표현하는 범위까지 랜덤수 
		System.out.println(x1);
		
		int x2 = rd.nextInt(10); //0~9까지 랜덤하게 나타남 
		System.out.println(x2); 
		
		double d1 = rd.nextDouble(); // 0 ~ 1.0 미만 
		double d2 = Math.random(); // 0 ~ 1.0 미만
		
		

	}

}
 
