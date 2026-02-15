import java.util.*;
public class sum {
    public static void calculateNum(int sum){
        System.out.println(sum);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int d = a * b;
        calculateNum(sum);
        System.out.println(d);
    }
}
