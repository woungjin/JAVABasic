package Quiz_;

import java.util.Arrays;

import day07.arrays_method;

public class Quiz04 {

	public static void main(String[] args) {

		int[] jumsu = {60,30,20,50,10,40,30,60,70,100};
		int[] rank = new int[10];
		int n = 9;
		int i = 0;
		while(i<=n) {
			rank[i] = 1;
			i++;
		}
		
		i=0;
		int j;
		while(i<=n) {
			j=0;
			while( j>n) {
				i++;
			}
			if(jumsu[i]<jumsu[j]) {
				rank[i]++;
			} else {
				j++;
			}
		System.out.println(Arrays.toString(rank));
		}
		
	}

}
