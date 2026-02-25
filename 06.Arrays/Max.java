// Find the maximum item
/* /
import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(maxRange(arr, 0,3));
    }
    // Imagine that arr is not empty
    // static int max(int[] arr){
        // int maxVal = arr[0];
        // for(int i=0;i<arr.length; i++){

/*/
/* /
    static int maxRange(int[] arr, int start, int end){

            int maxVal = arr[start];
            for(int i=start; i<= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
        */
       /*/
// work on edges cases here, like array being null  
    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
            for(int i=start; i<= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
static int max(int[] arr){
    if(arr.length ==0){
        return -1;
    }
    int maxVal = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
}
}
*/

import java.util.*;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(maxRange(arr, 0, 3)); // should print 23
        System.out.println(max(arr));            // should print 23
    }

    static int maxRange(int[] arr, int start, int end){
        if(arr == null || arr.length == 0){
            return -1; // invalid array
        }
        if(start < 0 || end >= arr.length || start > end){
            return -1; // invalid range
        }

        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
