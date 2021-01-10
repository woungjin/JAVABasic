import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		String str1 = "kim";
		String str2 = "kim";
		String str3 = new String(str1);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
	}

}
   