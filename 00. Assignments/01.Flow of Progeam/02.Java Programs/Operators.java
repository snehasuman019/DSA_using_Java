// package 02.Java Programs;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class Operators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);    
    int result;
    if(operator == '+'){
        result = a + b;
        System.out.println("The result of " + a + " + " + b + " is: " + result);
    }else if(operator == '-'){
        result = a - b;
        System.out.println("The result of " + a + " - " + b + " is: " + result);
    }else if(operator == '*'){
        result = a * b;
        System.out.println("The result of " + a + " * " + b + " is: " + result);

    }else if(operator == '/'){
        if(b != 0){
            result = a / b;
            System.out.println("The result of " + a + " / " + b + " is: " + result);
        }else{
            System.out.println("Error: Division by zero is not allowed.");
        }
    }else{
        System.out.println("Invalid operator. Please use +, -, *, or /.");


}    
}
}