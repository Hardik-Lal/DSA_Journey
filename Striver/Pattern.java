package Striver;
import java.util.Scanner ;
public class Pattern {
    public static void Pattern1(int n) {
        for(int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n) {
        int space = 2 * (n-1) ;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print(j);
            }
            for (int j = 1; j < space; j++){
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            space = space - 2;
            System.out.println();
        }
    }
    public static void Pattern3(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num ++ ;
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n) {
        int ascii = 65 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)ascii);
                ascii++;
            }
            ascii = 65;
            System.out.println();
        }
    }
    public static void Pattern5(int n) {
        int space = n - 1;
        int alpha = 1 ;
        int ascii = 65;
        for(int i = 1; i < n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= alpha; j++){
                System.out.print((char)ascii);
                if(j<=alpha/2) {
                    ascii++ ;
                }
                else {
                    ascii--;
                }
            }
            ascii = 65;
            for(int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            space-- ;
            alpha = alpha + 2;
            System.out.println();
        }
    }
    public static void Pattern6(int n) {
        int spaces = 0 ;
        for(int i = 0; i < n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        spaces = 2*n - 2;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }
    public static void Pattern7(int n) {
        for(int i = 1; i <= n; i++) {
            int spaces = n - 2 ;
            if (i == 1 || i==n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for(int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt() ;
        Pattern7(n); ;
    }
}
