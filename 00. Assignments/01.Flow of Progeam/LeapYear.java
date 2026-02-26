// Input a year and find whether it is a leap year or not. 

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if(year % 4==0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;

                }
            }else {
                isLeap = true;
            }
        }
        if(isLeap){
            System.out.println(year + " is a Leap year.");
        }else{
            System.out.println(year + " is not a Leap year.");
        }
    }
}
