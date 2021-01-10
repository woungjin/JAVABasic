package day05;

import java.util.Scanner;

public class Break3 {

	public static void main(String[] args) {

//		boolean bool = false;
//		for( char u = 'A'; u <= 'Z'; u++) { 
//			for(char l = 'a' ; l<='z' ; l++) {
//				System.out.println(u + " - " + l);
//				if(l == 'c') {
//					bool = true;
//					break;
//				}
//				
//			}
//			if(bool) break;
//			
//		}

	name: for (char u = 'A'; u <= 'Z'; u++) {
			for (char l = 'a'; l <= 'z'; l++) {
				System.out.println(u + " - " + l);
				if (l == 'c') {
					break name;
					}

				}
			}

	
	
	}

}
