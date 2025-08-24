package pattern2;


import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
           int icj = 1;
            for (int j = 0; j <=i; j++) {
                System.out.print(icj + " ");
                int icjp1 = icj * ( i - j) / ( j + 1);
                icj = icjp1;

            }
            System.out.println(" ");

        }
    }
}



