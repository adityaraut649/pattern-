package pattern2;

import java.util.Scanner;

    /*   *
        ***
       *****
        ***
         *   */

public class pattern6 {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        int nsp = n /2  , nst = 1;
       for (int i = 1; i <= n  ; i++) {
           // rows
           for (int j = 1; j <= nsp ; j++) {
               System.out.print(" ");
           }
           // colams
           for (int j = 1; j <= nst ; j++) {
               System.out.print("*");
           }
           if(i <= n/2) {
               nsp--;
               nst+=2;
           } else {
               nsp++;
               nst-=2;
           }
           System.out.println(" ");
       }
    }
}
