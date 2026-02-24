public class arr1 {
    public static void main(String[] args) {
        
    
    int[] ros;    
    //Declaration of array ros is getting defined in stack
    ros = new int[5];   
    //initialisation : actually here object is being created in memory(heap)
        System.out.println(ros[1]);   //everything will be 0 internally [0,0,0,0,0]
        String[] arr = new String[4];
        System.out.println(arr[0]);    //out: null
                                      // null cannot to assigned to any primitive can only be assigned to non primitives. (None in Python)
        // primitives are stored in stack memory 
        // In python there is no primitives there are only objects .
        // Objects and classes are stored in heap memory 

    }

}
