// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


import java.util.*;
public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number or 'x' to stop : " );
            String input = sc.next();
            if(input.equals("x")){
                break;
            }
            int num = Integer.parseInt(input);
            sum+= num;

        }
        System.out.println("Sum of all numbers : " + sum);
    }
}
