import java.util.*;
public class multiDArr {
    public static void main(String[] args) {
        // int[][] arr = new int[3][];  //no of rows is mandatory . []rows[]columns.
        // int[][] arr = {
        //     // {1,2,3},    //0th index 
        //     // {4,5,6},    //1st index 
        //     // {7,8,9}   
        //     {1,2,3},    //0th index
        //     {4,5},      //1st index
        //     {6,7,8,9}   //2nd index  -> arr2D[2] = {6,7,8,9}
        // };
        Scanner in = new Scanner(System.in);

        /*/
        int[][] arr = new int[3][3];
        // input
        System.out.println(arr.length);     //no of rows
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        for(int row = 0; row<arr.length; row++){
            // for each col in every row 
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }   
        for(int row =0; row < arr.length; row++){
            // for each col in every row
            for(int col =0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        */

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialization
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());

        }
        // add elements
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);


    }
    
}
