public class Main {
    public static void main(SearchInStrings[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16,-11, 28};
        int target = 19;
        // int ans = linearSearch2(nums, target);
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }

    // search in the array : return the index if found , otherwise return -1
/*/
    static int linearSearch(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        // for loop
        for(int i =0; i<arr.length; i++){
            // check for element at every index if it is = target 
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // this line will excecute if none of the return statement above have executed 
        // hence the target not found
        return -1;

    */
/*/
// search for the target : return the element if found , otherwise return -1
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
*/

// search the target : return true if found , otherwise return false
         static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
// time complexity : 
// Best Case O(1) // constant   
// Worst Case O(N)  //N ->size of array
// Average Case O(N) //N ->size of array