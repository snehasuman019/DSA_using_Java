public class shadowing {
    static int x =  90;  //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x = 30;   //the class variable at line 2 is shadowed by this
        System.out.println(x); //30
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
