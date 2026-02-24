public class arr1 {
    public static void main(String[] args) {
        
    
    int[] ros;    
    //Declaration of array ros is getting defined in stack

    ros = new int[5];   
    //initialisation : actually here object is being created in memory(heap)
        System.out.println(ros[1]);   //everything will be 0 internally [0,0,0,0,0]
        String[] arr = new String[4];
        System.out.println(arr[0]);
    }

}
