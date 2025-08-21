package pattern2;

import java.util.Scanner;

           /*     ***** *****
                  ****   ****
                  ***     ***
                  **       **
                  *         *
                  **       **
                  ***     ***
                  ****   ****
                  ***** *****  */

public class pattern7 {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        int nsp = 1 , nst = n/ 2 + 1;
       for (int i = 1; i <= n  ; i++) {
           // rows
           for (int j = 1; j <= nst ; j++) {
               System.out.print("*");
           }
           // colams
           for (int j = 1; j <= nsp ; j++) {
               System.out.print(" ");
           }
           for (int j = 0; j < nst; j++) {
               System.out.print("*");
           }
           if(i <= n/2) {
               nsp+=2;
               nst--;
           } else {
               nsp-=2;
               nst++;
           }
           System.out.println(" ");
       }
    }
}
