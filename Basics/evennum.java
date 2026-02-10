import java .util.*;
public class evennum {
    public static void main(String[] args) {
        // int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Even num till "+ n + ":");
        for(int i = 2; i<=n; i+=2 ){
            System.out.println(i+ " ");
        }

    }
    
}
