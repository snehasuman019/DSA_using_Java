public class PascTri {
    public static void main(String[] args) {
        int rows = 6; 
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            int num = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
