// 9. To find Armstrong Number between two given number.

import java.util.*;
public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        int start = sc.nextInt();
        System.out.println("Enter end number : ");
        int end = sc.nextInt();
        System.out.println("Armstronng numbers between " + start + " and " + end + " are : ");
        for(int num = start ; num <= end; num++){
            int digits = String.valueOf(num).length();
            int sum =0, temp = num;
            while(temp > 0){
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }
    }
}
