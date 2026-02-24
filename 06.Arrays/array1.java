// 
import java.util.*;
public class array1 {
    public static void main(String[] args){
        // int[] marks = new int[3];
        // marks[0] = 91;
        // marks[1] = 92;
        // marks[2] = 80;
        // System.out.println(marks[1]);
        // System.out.println(marks[0]);
        // System.out.println(marks[2]);
// user input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
// input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("***");
// output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

// using loops

        // for(int i=0; i<3;i++){
        //     System.out.println(numbers[i]);
        // }
    }
}
