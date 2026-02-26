// package 02.Java Programs;

// 6. Input currency in rupees and output in USD.

import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double rupees = sc.nextDouble();
        double dollars = rupees / 82.0;
        System.out.println(rupees + " rupees is equal to " + dollars + " dollars.");
    }
}
