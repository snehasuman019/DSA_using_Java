// package 02.Java Programs;

// 1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is a Even number.");

        }else{
            System.out.println(a + " is a Odd number.");

        }
        
    }
}
