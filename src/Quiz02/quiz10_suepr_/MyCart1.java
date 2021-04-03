package Quiz02.quiz10_suepr_;

import java.util.Arrays;
import java.util.Scanner;

public class MyCart1 extends Cart {

   public MyCart1(int money) {
      tv = 300;
      com = 400;
      radio = 500;
      this.money = money;
      System.out.println("현재 잔액 : " + this.money);
   }

   void buy(String str) {
      if (this.money < 300) {
         System.out.println("금액부족");
         return;
      }
      if (str.equals("tv")) {
         money -= tv;
         add(str);
         System.out.println("tv를 구매합니다");
      } else if (str.equals("com") && money >= 400) {
         money -= com;
         add(str);
         System.out.println("com을 구매합니다");
      } else if (str.equals("radio") && money >= 500) {
         money -= radio; 
         System.out.println("radio를 구매합니다");
         add(str);
      } else {
         System.out.println("잔액부족 or 없는 상품입니다 ");
         return;
      }
      System.out.println("남은 금액 : " + this.money);
   }

   void add(String str) {
      if (this.i >= this.cart.length) {
         String[] cart2 = new String[cart.length * 2];
         for (int i = 0; i < cart.length; i++) {
            cart2[i] = cart[i];
         }
         this.cart = cart2;
      }
         cart[i] = str;
         this.i++;

      info();

   }

   void info() {
      int sum = 0;
      System.out.print ("장바구니 내용물 : ");
      for (int i = 0; i < cart.length; i++) {
         if (cart[i] != null) {
            System.out.print(cart[i]+" ");
            if (cart[i].equals("tv"))
               sum += 300;
            else if (cart[i].equals("com"))
               sum += 400;
            else if (cart[i].equals("radio"))
               sum += 500;
         }
      }
      System.out.println("");
      System.out.println("장바구니 총 금액 : " + sum);
      

      
   }

}
