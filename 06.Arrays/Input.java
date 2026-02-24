import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//    Arrays of Primitives

        //  int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 65;
        // arr[3] = 405;
        // arr[4] = 459;
        // System.out.println(arr[2]);
        // input using for loops
        // dont know the size then arr.length
        // for(int i=0; i<5;i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        /*/
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        for(int num : arr){              //for every element in the array, print the element 
            System.out.print(num + " ");    // here num represents element of the array 
        }
        // System.out.println(arr[5]); //will give error coz index 5 dosent exist  (index out of bound error)
*/

//   Array of objects 
        String[] str = new String[4];  ///interval working on object .
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
    System.out.println(Arrays.toString(str));

// Modify
        str[1] = "Sneha";
        System.out.println(Arrays.toString(str));


    }
}

