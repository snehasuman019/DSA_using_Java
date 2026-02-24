import java.util.*;
public class ArrayListE {
    public static void main(String[] args) {
        // ArrayList is a class  
        ArrayList<Integer> list = new ArrayList<>(10);
        // cannot add primitives over here , have to use wrapper classes .
        
        list.add(67);
        list.add(676);
        list.add(675);
        list.add(671);
        list.add(672);
        list.add(6723);
        list.add(627);
        list.add(6);
        System.out.println(list);
// here initial capacity is 10 but still it will hold as many as we want . 

        System.out.println(list.contains(654));
        System.out.println(list.contains(6));
        list.set(0,99);
        System.out.println(list);
    }
}
