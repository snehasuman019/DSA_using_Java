// package 02.Java Programs;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter a time in year: ");
        double t = sc.nextDouble();
        System.out.print("Enter a rate of interest: ");
        double r = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest is: " + si);
    }
}
