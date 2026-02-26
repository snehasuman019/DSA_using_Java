// 8. To find out whether the given String is Palindrome or not.

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " is not a palindrome.");
        }

    }
}
