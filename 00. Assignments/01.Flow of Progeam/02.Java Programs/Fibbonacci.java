// package 02.Java Programs;

// 7. To calculate Fibonacci Series up to n numbers.

import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibbonacci series: ");
        int n = sc.nextInt();
        int a = 0;
         int b =1;
        System.out.println("Fibbonacci series up to " + n + " terms:");

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        
    }
}
