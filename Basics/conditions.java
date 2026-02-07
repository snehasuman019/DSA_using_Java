// package Basics;
import java.util.*;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        /*if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
*/
    if(x%2==0){
        System.out.println("Even");
    }else{
        System.out.println("odd");
    }
    System.out.println("Enter a: ");

    int a = sc.nextInt();
    System.out.println("Enter b: ");

    int b = sc.nextInt();

    if(a==b){
        System.out.println("Equal");
    }else{
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }
    }
    }
    
}
