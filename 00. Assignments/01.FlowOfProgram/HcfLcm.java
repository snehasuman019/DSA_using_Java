// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.*;
public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    // Recursive algorithm to find HCF
    static int findHCF(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return findHCF(num2, num1 % num2);
    }
}
